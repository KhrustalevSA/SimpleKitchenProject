package com.simplekitchen.dao.entity.recipe;

import com.simplekitchen.dao.entity.image.ImageImpl;
import com.simplekitchen.dao.entity.recipe.api.Recipe;
import com.simplekitchen.dao.entity.user.UserImpl;
import com.simplekitchen.dao.entity.user.api.User;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * Класс реализующий интерфейс Recipe
 * @see Recipe
 * @author KhrustalevSA
 * @since 03.10.2022
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPE")
public class RecipeImpl implements Recipe {

    /**
     * поле уникального идентификатора рецепта
     */
    @Id
    @Column(name = "uuid", nullable = false)
    private Long uuid;

    /**
     * поле названия рецепта
     */
    @Column(name = "name")
    private String name;

    /**
     * поле списка используемых в рецепте ингредиентов
     */
    @ManyToMany(fetch = FetchType.EAGER, mappedBy="recipeList")
    private List<IngredientImpl> ingredientsList;

    /**
     * поле описания рецепта
     */
    @Column(name = "description")
    private String description;

    @ManyToOne
    private UserImpl user;

    /**
     * поле списка изображений на странице рецептов
     */
    @OneToMany(mappedBy = "recipe")
    private List<ImageImpl> imagesList;

    // /**
    //  * список описаний правильности действий на шагах готовки
    //  */
    // @OneToMany()
    //private List<String> stepsDescription;

    /**
     * время готовки рецепта
     */
    @Column(name = "cookingTime")
    private Long cookingTime;

    /**
     * имя автора рецепта
     */
    @Column(name = "authorName")
    private String author;

    /**
     *  дату публикации рецепта
     */
    @Column(name = "publishDate")
    private Date publishDate;

    /**
     * Сложность рецепта
     */
    @Column(name = "difficulty")
    private String difficulty;

}
