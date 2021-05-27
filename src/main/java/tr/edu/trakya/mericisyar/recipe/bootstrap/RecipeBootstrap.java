package tr.edu.trakya.mericisyar.recipe.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import tr.edu.trakya.mericisyar.recipe.models.Recipe;
import tr.edu.trakya.mericisyar.recipe.repositories.CategoryRepository;
import tr.edu.trakya.mericisyar.recipe.repositories.RecipeRepository;
import tr.edu.trakya.mericisyar.recipe.repositories.UnitOfMeasureRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final CategoryRepository categoryRepository;
    private final RecipeRepository recipeRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
         recipeRepository.saveAll(getRecipes());

    }

    private List<Recipe>getRecipes(){
        List<Recipe> recipes=new ArrayList<>(2);

        //fill

        return recipes;
    }
}
