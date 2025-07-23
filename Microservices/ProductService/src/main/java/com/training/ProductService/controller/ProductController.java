package com.training.ProductService.controller;

import com.training.ProductService.entities.Product;
import com.training.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @GetMapping("/user/{userId}")
    public List<Product> ProductByUser(@PathVariable int userId){
        return productService.ProductByUserId(userId);
    }

}