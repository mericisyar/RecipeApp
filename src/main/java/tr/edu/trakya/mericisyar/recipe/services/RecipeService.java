package tr.edu.trakya.mericisyar.recipe.services;

import tr.edu.trakya.mericisyar.recipe.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
