package com.simplekitchen.business.entity.user.api;

import com.simplekitchen.business.entity.recipe.api.Recipe;

import java.util.Date;
import java.util.List;

public interface User {
    /**
     * Метод для получения имени пользователя
     * */
    Long getUuid();

   UserName getUserName();

    /**
     * Метод для получения даты рождения пользователя
     * */
    Date getBirthDate();

    /**
     * Метод для получения пола пользователя
     * */
    String getSex();

    /**
     * Метод для получения списка любимых рецептов пользователя
     * */
    List<Recipe> getFavoriteRecipeList();

    /**
     * Метод для получения места жительства пользователя
     * */
    City getCity();
}
