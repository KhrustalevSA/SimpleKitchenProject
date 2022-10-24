package com.simplekitchen.clientmanager.controller.api;

import com.simplekitchen.dto.user.api.User;

/**
 * Интерфейс контроллера главного экрана
 * @author KhrustalevSA
 * @since 09.10.2022
 */
public interface MainScreenInfoController {

    /**
     * @return объект полученного пользователя
     */
    User getUser();

    /**
     * @return объект отправленного пользователя
     */
    User postUser();
}
