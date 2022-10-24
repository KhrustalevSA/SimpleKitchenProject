package com.simplekitchen.clientmanager.controller.api;

import com.simplekitchen.dto.recipe.RecipeRequestImpl;
import com.simplekitchen.dto.recipe.RecipeResponseImpl;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Интерфейс контроллера экрана рецептов
 * @author KhrustalevSA
 * @since 09.10.2022
 */
public interface RecipeController {

    /**
     * @param request
     * @return список рецептов с их полной информацией
     */
    RecipeResponseImpl getRecipe(@RequestParam(name = "recipe") RecipeRequestImpl request);
}
