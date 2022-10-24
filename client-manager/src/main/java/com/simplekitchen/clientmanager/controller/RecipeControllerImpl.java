package com.simplekitchen.clientmanager.controller;

import com.simplekitchen.clientmanager.controller.api.RecipeController;
import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.recipe.RecipeImpl;
import com.simplekitchen.dto.recipe.RecipeListImpl;
import com.simplekitchen.dto.recipe.RecipeRequestImpl;
import com.simplekitchen.dto.recipe.RecipeResponseImpl;
import com.simplekitchen.dto.recipe.api.RecipeList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс реализующий интерфейс RecipeController
 * @see RecipeController
 * @author KhrustalevSA
 * @since 16.10.2022
 */

@RestController
@RequestMapping("/recipe")
public class RecipeControllerImpl implements RecipeController {

    /**
     * @return список найденных рецептов
     */
    @Override
    @PostMapping("/get")
    public RecipeResponseImpl getRecipe(@RequestParam(name = "recipe") RecipeRequestImpl request) {
        if(request == null) {
            return RecipeResponseImpl.builder()
                    .status(StatusImpl.builder()
                            .success(false).description("Not null").build()).build();
        }
        RecipeImpl recipe = RecipeImpl.builder()
                .uuid(request.getUuid())
                .name(request.getName()).build();
        RecipeList recipeList = new RecipeListImpl();
        recipeList.getRecipeList().add(recipe);
        return RecipeResponseImpl.builder().status(StatusImpl.builder().success(true).build()).recipeList(recipeList).build();
    }

}
