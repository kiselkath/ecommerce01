package com.example.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents product in a ecommerce catalog
 */
@Data //generated all getters and setters, equals, toString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor //to exclude id from the all-arg-constr


@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;


}
