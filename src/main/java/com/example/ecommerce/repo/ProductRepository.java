package com.example.ecommerce.repo;

import com.example.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository interface for a Product document
 * Spring DatMongo Db will auto-implement this
 */

//as far as we extending MongoRepository - annotation @Repository in not req
public interface ProductRepository extends MongoRepository<Product, String> {
    //By extending mongo repository. Spring data will handle all CRUD methods for us automatically
}
