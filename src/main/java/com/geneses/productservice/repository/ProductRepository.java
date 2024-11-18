package com.geneses.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.geneses.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByStoreId(String storeId);
    List<Product> findByCategory(String tag);
    List<Product> findByNameContainingIgnoreCase(String name);
}
