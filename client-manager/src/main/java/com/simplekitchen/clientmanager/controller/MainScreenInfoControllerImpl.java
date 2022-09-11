package com.simplekitchen.clientmanager.controller;

import com.simplekitchen.clientmanager.controller.api.MainScreenInfoController;
import com.simplekitchen.dto.user.UserImpl;
import com.simplekitchen.dto.user.api.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainScreenInfoControllerImpl implements MainScreenInfoController {

    @Override
    @GetMapping("/user")
    public User getUser(){
        return UserImpl.builder().name("Ivan").surname("Ivanov").age(30L).sex("M").build();
    }

}
