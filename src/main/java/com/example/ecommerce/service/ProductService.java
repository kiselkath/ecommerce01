package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    /**
     * Creating new product
     * @param product to insert
     * @return
     */
    public Product addProduct(Product product){
        return productRepository.insert(product);
    }

    /**
     * Find product by ID.
     * @param id the product ID
     * @return optional product
     */
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    /**
     * Retrieve all products.
     * @return list of products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}

