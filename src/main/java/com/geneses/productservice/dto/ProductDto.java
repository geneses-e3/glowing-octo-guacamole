package com.geneses.productservice.dto;

import java.util.List;

public class ProductDto {

    private String name;
    private String description;
    private double price;
    private String category;
    private String storeId;
    private int stock;
    private List<String> images;
    private List<String> tags;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}
    public List<String> getImages() {return images;}
    public void setImages(List<String> images) {this.images = images;}
    public List<String> getTags() {return tags;}
    public void setTags(List<String> tags) {this.tags = tags;}
    public String getDescription() {return description;}
    public String getStoreId() {return storeId;}
    public void setStoreId(String storeId) {this.storeId = storeId;}
    public void setDescription(String description) {this.description = description;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getCategory() {return category;}

}
