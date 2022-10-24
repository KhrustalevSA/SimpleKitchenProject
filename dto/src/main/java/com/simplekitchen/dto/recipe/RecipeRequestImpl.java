package com.simplekitchen.dto.recipe;

import com.simplekitchen.dto.recipe.api.RecipeRequest;
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
public class RecipeRequestImpl implements RecipeRequest {

    /**
     * поле уникального идентификатора рецепта
     */
    private String uuid;

    /**
     * поле названия рецепта
     */
    private String name;

}
