package com.simplekitchen.dao.entity.image;

import com.simplekitchen.dao.entity.image.api.Image;
import com.simplekitchen.dao.entity.recipe.RecipeImpl;
import com.simplekitchen.dao.entity.recipe.api.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Класс реализующий интерфейс Image
 * @see Image
 * @author KhrustalevSA
 * @since 03.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class ImageImpl implements Image {

    /**
     * поле уникального идентификатора изображения
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long uuid;


    /**
     * поле для хранения пути к картинке
     */
    @Column(name = "path")
    private String path;

    /**
     * поле для хранения url к картинке
     */
    @Column(name = "url")
    private String url;


    @ManyToOne(fetch = FetchType.EAGER)
    private RecipeImpl recipe;

}
