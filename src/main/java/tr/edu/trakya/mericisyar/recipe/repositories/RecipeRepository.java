package tr.edu.trakya.mericisyar.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.mericisyar.recipe.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
