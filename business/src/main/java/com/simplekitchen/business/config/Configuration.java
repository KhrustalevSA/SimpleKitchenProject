package com.simplekitchen.business.config;

import com.simplekitchen.business.service.UserServiceImpl;
import com.simplekitchen.business.service.api.UserService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public UserService getUserService(com.simplekitchen.dao.service.api.UserService userService) {

        return new UserServiceImpl(userService);
    }

}
