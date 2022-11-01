package com.simplekitchen.dto.user;

import com.simplekitchen.dto.recipe.api.Recipe;
import com.simplekitchen.dto.user.api.City;
import com.simplekitchen.dto.user.api.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Класс реализовывающий интерфейс User
 * @see User
 * @Author KhrustalevSA
 * @since 28.09.2022
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImpl implements User {

    /**
     * поле уникального идентификатора пользователя
     */
    private Long uuid;

    /**
     * поле имени пользователя
     */
    private String name;

    /**
     * поле фамилии пользователя
     */
    private String surname;

    /**
     * поле отчества пользователя
     */
    private String patronymic;

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
    private City city;

    public Long getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSex() {
        return sex;
    }

    public List<Recipe> getFavoriteRecipeList() {
        return favoriteRecipeList;
    }

    public City getCity() {
        return city;
    }
}
