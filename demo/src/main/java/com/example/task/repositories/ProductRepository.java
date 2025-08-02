package com.example.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.example.task.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
