/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models;

/**
 *
 * @author LC
 */
public class Recipe {
    private int recipeId;
    private String name;
    private String imagePath;
    private int categoryId;

    public Recipe(int recipeId, String name, String imagePath, int categoryId) {
        this.recipeId = recipeId;
        this.name = name;
        this.imagePath = imagePath;
        this.categoryId = categoryId;
    }

    
    
    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    
}
