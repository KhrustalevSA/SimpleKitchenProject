package com.simplekitchen.clientmanager.controller;

import com.simplekitchen.clientmanager.controller.api.RecipeController;
import com.simplekitchen.clientmanager.controller.api.UserController;
import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.user.*;
import com.simplekitchen.dto.user.api.User;
import com.simplekitchen.dto.user.api.UserInfoResponse;
import com.simplekitchen.dto.user.api.UserList;
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
public class UserControllerImpl implements UserController {

    /**
     * @return список найденных пользователей с их полной информацией
     */
    @PostMapping("/find")
    public UserInfoResponse find(@RequestParam(name = "userInfo") UserInfoRequestImpl userInfoRequest) {
        if (userInfoRequest == null) {
            return UserInfoResponseImpl.builder()
                    .status(StatusImpl.builder()
                            .success(false).description("must not null").build()).build();
        }
        User user = UserImpl.builder()
                .name("Ivan").surname("Ivanov").patronymic("Ivanovich").sex("M").birthDate(new Date(1998, 05, 23))
                .city(CityImpl.builder()
                        .cityName("Vologda").regionName("Vologodskaya obl").streetName("Gor val")
                        .houseNumber(26L).entranceNumber(1L).flatNumber(112L).build()).build();
        UserList userList = new UserListImpl();
        userList.getUserList().add(user);
        return UserInfoResponseImpl.builder().status(StatusImpl.builder().success(false).build()).userList(userList).build();

    }

    //@PostMapping("/registration")
    //public registrationResponse registrate(@RequestParam registrationRequest ){

    //}

}
