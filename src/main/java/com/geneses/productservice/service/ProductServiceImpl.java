package com.geneses.productservice.service;

import com.geneses.productservice.dto.ProductDto;
import com.geneses.productservice.exception.ResourceNotFoundException;
import com.geneses.productservice.model.Product;
import com.geneses.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setCategory(productDto.getCategory());
        product.setStoreId(productDto.getStoreId());
        product.setStock(productDto.getStock());
        product.setImages(productDto.getImages());
        product.setTags(productDto.getTags());
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    @Override
    public Product updateProduct(String id, ProductDto productDto) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(productDto.getName());
        existingProduct.setDescription(productDto.getDescription());
        existingProduct.setPrice(productDto.getPrice());
        existingProduct.setCategory(productDto.getCategory());
        existingProduct.setStock(productDto.getStock());
        existingProduct.setImages(productDto.getImages());
        existingProduct.setTags(productDto.getTags());
        return productRepository.save(existingProduct);
    }


    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> getProductsByStoreId(String storeId) {
        return productRepository.findByStoreId(storeId);
    }
}
