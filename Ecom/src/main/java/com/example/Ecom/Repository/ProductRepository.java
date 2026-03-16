package com.example.Ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
