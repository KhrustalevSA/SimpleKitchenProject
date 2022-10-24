package com.simplekitchen.dto.recipe.api;

import com.simplekitchen.dto.common.StatusImpl;

import java.util.List;

/**
 * Интерфейс для ответа на запроса рецепта пользователем
 * @author KhrustalevSA
 * @since 09.10.2022
 */
public interface RecipeResponse {
    /**
     * @return статус ответа
     */
    StatusImpl getStatus();

    /**
     * @return сущность рецепта
     */
    RecipeList getRecipeList();
}
