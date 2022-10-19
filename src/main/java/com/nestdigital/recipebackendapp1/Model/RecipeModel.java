package com.nestdigital.recipebackendapp1.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "recipes")
public class RecipeModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dishtype;
    private String ingredients;

    public RecipeModel() {
    }

    public RecipeModel(int id, String name, String dishtype, String ingredients) {
        this.id = id;
        this.name = name;
        this.dishtype = dishtype;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDishtype() {
        return dishtype;
    }

    public void setDishtype(String dishtype) {
        this.dishtype = dishtype;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
