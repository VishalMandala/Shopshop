package com.shopshop.dto;

import java.util.List;
import java.util.stream.Collectors;

public class SubcategoryDto {
    private Long id;
    private String name;
    private String description;
    private List<ProductDto> products;
    
    // Constructors
    public SubcategoryDto() {}
    
    public SubcategoryDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<ProductDto> getProducts() {
        return products;
    }
    
    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
