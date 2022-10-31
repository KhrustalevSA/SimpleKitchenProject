package com.simplekitchen.dao.entity.user;

import com.simplekitchen.dao.entity.recipe.RecipeImpl;
import com.simplekitchen.dao.entity.user.api.User;
import com.simplekitchen.dto.user.api.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Entity(name = "User")
public class UserImpl implements User {

    /**
     * уникальный идентификатор пользователя
     */
    @Id
    @Column(name = "uuid", nullable = false)
    private Long uuid;

    /**
     * поле имени пользователя
     */
    @Column(name = "name")
    private String name;

    /**
     * поле фамилии пользователя
     */
    @Column(name = "surname")
    private String surname;

    /**
     * поле отчества пользователя
     */
    @Column(name = "patronymic")
    private String patronymic;

    /**
     * поле возраста пользователя
     */
    @Column(name = "birthdate")
    private Date birthDate;

    /**
     * поле хранит пол пользователя
     */
    @Column(name = "sex")
    private String sex;

    /**
     * поле хранит список избранных рецептов пользователя
     */
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "favoriteRecipe")
    private List<RecipeImpl> favoriteRecipeList;

    /**
     * поле хранит место жительства пользователя
     */
    private City city;

    @ManyToOne
    @JoinColumn(name="userList_id", nullable=false)
    private UserListImpl userList;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
