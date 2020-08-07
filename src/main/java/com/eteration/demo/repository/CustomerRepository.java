package com.eteration.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eteration.demo.dto.OrderResponse;
import com.eteration.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("SELECT new com.eteration.demo.dto.OrderResponse(c.name , p.productName, p.price) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInfo();

}
