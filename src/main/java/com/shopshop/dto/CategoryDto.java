package com.shopshop.dto;

import java.util.List;

public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    private String icon;
    private List<SubcategoryDto> subcategories;
    
    // Constructors
    public CategoryDto() {}
    
    public CategoryDto(Long id, String name, String description, String icon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
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
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public List<SubcategoryDto> getSubcategories() {
        return subcategories;
    }
    
    public void setSubcategories(List<SubcategoryDto> subcategories) {
        this.subcategories = subcategories;
    }
}
