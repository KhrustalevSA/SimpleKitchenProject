package com.simplekitchen.dto.recipe.api;

import com.simplekitchen.dto.image.api.Image;

import java.util.List;

/**
 * Интерфейс для запроса рецепта
 * @author KhrustalevSA
 * @since 09.10.2022
 */
public interface RecipeRequest {

    /**
     * @return уникальный идентификатор запроса рецепта
     */
    String getUuid();

    /**
     * @return название рецепта
     */
    String getName();

}
