/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LC
 */
public class Repository {
    private List<Category> categories;
    private List<Recipe> recipes;
    
    public Repository(){
        categories = new ArrayList<>();
        categories.add(new Category(1, "Recetas de comida China", "chinese/chinese_category.jpg"));
        categories.add(new Category(2, "Recetas de comida Francesa", "french/french_category.jpg"));
        categories.add(new Category(3, "Recetas de comida Alemana", "german/german_category.jpg"));
        categories.add(new Category(4, "Recetas de comida Hindú", "indian/indian_category.jpg"));
        categories.add(new Category(5, "Recetas de comida Italiana", "italian/italian_category.jpg"));
        categories.add(new Category(6, "Recetas de comida Mexicana", "mexican/mexican_category.jpg"));        
        
        recipes = new ArrayList<>();
        recipes.add(new Recipe(1, "team bun baos", "chinese/Chinese_1_600_C.jpg", 1));
        recipes.add(new Recipe(1, "Breaded shrimp balls", "chinese/Chinese_2_600_C.jpg", 1));
        recipes.add(new Recipe(1, "Carrot Salad", "chinese/Chinese_3_600_C.jpg", 1));
        recipes.add(new Recipe(1, "Shanghai Noodle Soup", "chinese/Chinese_4_600_C.jpg", 1));
        recipes.add(new Recipe(1, "Fried Rice", "chinese/Chinese_5_600_C.jpg", 1));
        recipes.add(new Recipe(1, "Fried Dumpling", "chinese/Chinese_6_600_C.jpg", 1));
    }
    
    public List<Category> getCategories(){
        return categories;
    }
    
    public List<Recipe> getRecipes(){
        return recipes;
    }
    
    
}
