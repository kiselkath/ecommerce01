package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    /**
     * Constructor injetions of service
     * @param productService service bean
     */

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    /**
     * Create a new product.
     * POST /api/products – to add new products
     * @param product product to create
     * @return inserted product
     */
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    /**
     * Get all products.
     * GET /api/products – to list all
     * @return list of products
     */
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    /**
     * Get a product by ID.
     * GET /api/products/{id} – to find by ID
     * @param id product ID
     * @return optional product
     */
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

}
