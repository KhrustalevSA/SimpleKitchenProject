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
    private Long uuid;

    /**
     *  название ингредиента
     */
    private String name;

    /**
     *  список рецептов где используется
     */
    private List<Recipe> recipeList;

    /**
     *  средний вес ингредиента
     */
    private Long averageWeight;

    /**
     *  срок годности ингредиента
     */
    private Long expirationDate;

    /**
     *  срок годности ингредиента в холодильнике
     */
    private Long expirationDateInFridge;

    public Long getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public Long getAverageWeight() {
        return averageWeight;
    }

    public Long getExpirationDate() {
        return expirationDate;
    }

    public Long getExpirationDateInFridge() {
        return expirationDateInFridge;
    }
}
