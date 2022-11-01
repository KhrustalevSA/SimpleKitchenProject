package com.simplekitchen.business.entity.recipe;

import com.simplekitchen.business.entity.recipe.api.Ingredient;
import com.simplekitchen.business.entity.recipe.api.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Entity
public class IngredientImpl implements Ingredient {
    @Id
    @Column(name = "uuid", nullable = false)
    private Long uuid;

    /**
     *  название ингредиента
     */
    @Column(name = "name")
    String name;

    /**
     *  список рецептов где используется
     */
    @ManyToMany(fetch = FetchType.EAGER, mappedBy= "ingredientsList")
    List<Recipe> recipeList;

    /**
     *  средний вес ингредиента
     */
    @Column(name = "weight")
    Long averageWeight;

    /**
     *  срок годности ингредиента
     */
    @Column(name = "expirationDate")
    Long expirationDate;

    /**
     *  срок годности ингредиента в холодильнике
     */
    @Column(name = "expirationDateInFridge")
    Long expirationDateInFridge;

}
