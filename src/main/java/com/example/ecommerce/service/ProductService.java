package com.example.ecommerce.service;

import com.example.ecommerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

/**
 * Service layer for Product operations
 */

@Service
public class ProductService {
    private final ProductRepository productRepository;

    /**
     * Constructor injection of Repository
     * @param productRepository repository bean (object).
     */

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}

