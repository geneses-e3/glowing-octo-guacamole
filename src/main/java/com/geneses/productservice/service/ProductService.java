package com.geneses.productservice.service;

import com.geneses.productservice.dto.ProductDto;
import com.geneses.productservice.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDto productDto);
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product updateProduct(String id, ProductDto productDto);
    void deleteProduct(String id);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByStoreId(String storeId);
}

