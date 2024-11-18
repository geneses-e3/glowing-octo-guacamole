package com.geneses.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "products")
public class Project {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String storeId;
    private int stock;
    private List<String> images;
    private List<String> tags;
}
