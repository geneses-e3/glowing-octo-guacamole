package com.geneses.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
    private String storeId;
    private int stock;
    private List<String> images;
    private List<String> tags;

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setImages(List<String> images) {
        this.images = images;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    /** ==================== GETTERS ======================= */
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public String getStoreId(){
        return storeId;
    }
    public int getStock(){
        return stock;
    }
    public List<String> getImages(){
        return images;
    }
    public List<String> getTags(){
        return tags;
    }
}
