package com.simplekitchen.clientmanager.controller;

import com.simplekitchen.clientmanager.controller.api.RecipeController;
import com.simplekitchen.clientmanager.controller.api.UserController;
import com.simplekitchen.clientmanager.service.api.UserControllerService;
import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.user.*;
import com.simplekitchen.dto.user.api.User;
import com.simplekitchen.dto.user.api.UserInfoRequest;
import com.simplekitchen.dto.user.api.UserInfoResponse;
import com.simplekitchen.dto.user.api.UserList;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Класс реализующий интерфейс UserController
 * @see UserController
 * @author KhrustalevSA
 * @since 16.10.2022
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
@NoArgsConstructor
public class UserControllerImpl implements UserController {

    @Autowired
    private UserControllerService userControllerService;

    /**
     * @return список найденных пользователей с их полной информацией
     */
    @PostMapping("/find")
    public UserInfoResponse find(@RequestParam(name = "userInfo") UserInfoRequestImpl userInfoRequest) {
        //Валидация
        if (userInfoRequest == null) {
            return UserInfoResponseImpl.builder()
                    .status(StatusImpl.builder()
                            .success(false).description("must not null").build()).build();
        }
        //Передача управления сервису контроллера

        return userControllerService.find(userInfoRequest);

    }

    //@PostMapping("/registration")
    //public registrationResponse registration(@RequestParam registrationRequest ){

    //}

}
