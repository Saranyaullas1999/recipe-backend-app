package com.nestdigital.recipebackendapp1.dao;

import com.nestdigital.recipebackendapp1.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
