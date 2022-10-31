package com.simplekitchen.dao.entity.image.api;

/**
 * Интерфейс dto изображений
 * @author KhrustalevSA
 * @since 03.10.2022
 */
public interface Image {
    /**
     * @return уникальный идентификатор изображения
     */
    Long getUuid();

    /**
     * @return путь к изображению
     */
    String getPath();

    /**
     * @return url изображения
     */
    String getUrl();
}
