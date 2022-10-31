package com.simplekitchen.clientmanager.config;

import com.simplekitchen.business.service.api.UserService;
import com.simplekitchen.clientmanager.service.UserControllerServiceImpl;
import com.simplekitchen.clientmanager.service.api.UserControllerService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public UserControllerService getUserControllerService(UserService userService) {

        return new UserControllerServiceImpl(userService);
    }
}
