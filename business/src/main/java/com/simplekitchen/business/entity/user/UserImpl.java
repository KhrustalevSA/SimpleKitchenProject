package com.simplekitchen.business.entity.user;

import com.simplekitchen.business.entity.recipe.RecipeImpl;
import com.simplekitchen.business.entity.recipe.api.Recipe;
import com.simplekitchen.business.entity.user.api.User;
import com.simplekitchen.business.entity.user.api.UserName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


/**
 * Класс для создания объекта пользователя
 * @author Khrustalev-sa
 * @since 26.10.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImpl implements User {

    /**
     * уникальный идентификатор пользователя
     */
    private Long uuid;

    private UserName userName;

    /**
     * поле возраста пользователя
     */
    private Date birthDate;

    /**
     * поле хранит пол пользователя
     */
    private String sex;

    /**
     * поле хранит список избранных рецептов пользователя
     */
    private List<Recipe> favoriteRecipeList;

    /**
     * поле хранит место жительства пользователя
     */
    private CityImpl city;

    private UserListImpl userList;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
