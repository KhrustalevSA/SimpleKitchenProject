package com.simplekitchen.clientmanager.controller;

import com.simplekitchen.clientmanager.controller.api.MainScreenInfoController;
import com.simplekitchen.dto.user.CityImpl;
import com.simplekitchen.dto.user.UserImpl;
import com.simplekitchen.dto.user.api.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Класс реализующий интерфейс MainScreenInfoController
 * @see MainScreenInfoController
 * @author KhrustalevSA
 * @since 09.10.2022
 */

@RestController
@RequestMapping("/main")
public class MainScreenInfoControllerImpl implements MainScreenInfoController {

    /**
     * @return объект пользователя
     */
    @Override
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        UserImpl user = new UserImpl();

        return UserImpl.builder()
                .name("Ivan").surname("Ivanov").patronymic("Ivanovich").sex("M").birthDate(new Date(1998, 05, 23))
                .city(CityImpl.builder()
                        .cityName("Vologda").regionName("Vologodskaya obl").streetName("Gor val")
                        .houseNumber(26L).entranceNumber(1L).flatNumber(112L).build()).build();
    }

    /**
     * @return объект пользователя
     */
    @Override
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User postUser(){
        UserImpl user = new UserImpl();

        return UserImpl.builder()
                .name("Ivan").surname("Ivanov").patronymic("Ivanovich").sex("M").birthDate(new Date(1998, 05, 23))
                .city(CityImpl.builder()
                        .cityName("Vologda").regionName("Vologodskaya obl").streetName("Gor val")
                        .houseNumber(26L).entranceNumber(1L).flatNumber(112L).build()).build();
    }

}
