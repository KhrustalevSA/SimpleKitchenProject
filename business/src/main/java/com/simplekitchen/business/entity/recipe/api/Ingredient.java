package com.simplekitchen.business.entity.recipe.api;

import com.simplekitchen.business.entity.recipe.RecipeImpl;

import java.util.List;

/**
 * Интерфейс для сущности ингредиента
 * @author KhrustalevSA
 * @since 09.10.2022
 */
public interface Ingredient {

    /**
     * @return уникальный идентификатор рецепта
     */

    Long getUuid();

    /**
     * @return название ингредиента
     */
    String getName();

    /**
     * @return список рецептов где используется
     */
    List<Recipe> getRecipeList();

    /**
     * @return средний вес ингредиента
     */
    Long getAverageWeight();

    /**
     * @return срок годности ингредиента
     */
    Long getExpirationDate();

    /**
     * @return срок годности ингредиента в холодильнике
     */
    Long getExpirationDateInFridge();
}
