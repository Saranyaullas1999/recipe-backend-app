package com.nestdigital.recipebackendapp1.Controller;

import com.nestdigital.recipebackendapp1.Model.RecipeModel;
import com.nestdigital.recipebackendapp1.dao.RecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addRecipe",consumes = "application/json",produces = "application/json")
    public String Addrecipe(@RequestBody RecipeModel recipe){
        System.out.println(recipe.toString());
        dao.save(recipe);
        return  "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewrecipe")
    public List<RecipeModel> Viewrecipe(){
        return (List<RecipeModel>)dao.findAll();
    }
}
