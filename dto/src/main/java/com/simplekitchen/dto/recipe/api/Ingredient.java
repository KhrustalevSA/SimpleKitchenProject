package com.simplekitchen.dto.recipe.api;

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
    String getUuid();

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
