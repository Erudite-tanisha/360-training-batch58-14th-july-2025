package com.training.ProductService.repo;

import com.training.ProductService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByUserId(int userId);
}
