package com.simplekitchen.clientmanager.controller.api;

import com.simplekitchen.dto.user.UserInfoRequestImpl;
import com.simplekitchen.dto.user.api.UserInfoResponse;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Интерфейс контроллера вывода полной информации о пользователе
 * @author KhrustalevSA
 * @since 16.10.2022
 */
public interface UserController {

    /**
     * @param userInfoRequest
     * @return список пользователей с их полной информацией
     */
    UserInfoResponse find(@RequestParam(name = "userInfo") UserInfoRequestImpl userInfoRequest);
}
