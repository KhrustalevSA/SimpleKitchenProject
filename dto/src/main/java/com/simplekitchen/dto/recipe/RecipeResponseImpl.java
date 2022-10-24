package com.simplekitchen.dto.recipe;

import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.recipe.api.Recipe;
import com.simplekitchen.dto.recipe.api.RecipeList;
import com.simplekitchen.dto.recipe.api.RecipeRequest;
import com.simplekitchen.dto.recipe.api.RecipeResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс реализующий интерфейс RecipeRequest
 * @see RecipeRequest
 * @author KhrustalevSA
 * @since 03.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeResponseImpl implements RecipeResponse {

    /**
     * поле статуса получения рецепта
     */
    private StatusImpl status;

    /**
     * поле сущности полученного рецепта
     */
    private RecipeList recipeList;

}
