package com.example.ecommerce;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
        if (repo.count() == 0) {
            repo.save(new Product("Laptop", 999.99));
            repo.save(new Product("Phone", 499.99));
            repo.save(new Product("Headphones", 99.99));
        }
    }

    @GetMapping
    public List<Product> all() {
        return repo.findAll();
    }
}
