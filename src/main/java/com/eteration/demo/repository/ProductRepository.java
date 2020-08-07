package com.eteration.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteration.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
