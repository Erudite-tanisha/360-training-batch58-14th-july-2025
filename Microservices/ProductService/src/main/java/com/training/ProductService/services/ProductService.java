package com.training.ProductService.services;

import com.training.ProductService.entities.Product;

import java.util.List;

public interface ProductService {

    Product add(Product product);

    List<Product> getAll();

    Product getProduct(int id);

   List<Product> ProductByUserId(int userId);
}