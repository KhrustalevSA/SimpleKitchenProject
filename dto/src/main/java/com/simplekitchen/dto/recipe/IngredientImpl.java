package com.simplekitchen.dto.recipe;

import com.simplekitchen.dto.recipe.api.Ingredient;
import com.simplekitchen.dto.recipe.api.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Класс реализующий интерфейс Ingredient
 * @see Ingredient
 * @author KhrustalevSA
 * @since 03.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientImpl implements Ingredient {

    /**
     *  уникальный идентификатор рецепта
     */
    String uuid;

    /**
     *  название ингредиента
     */
    String name;

    /**
     *  список рецептов где используется
     */
    List<Recipe> recipeList;

    /**
     *  средний вес ингредиента
     */
    Long averageWeight;

    /**
     *  срок годности ингредиента
     */
    Long expirationDate;

    /**
     *  срок годности ингредиента в холодильнике
     */
    Long expirationDateInFridge;
}
