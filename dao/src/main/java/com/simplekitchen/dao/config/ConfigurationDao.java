package com.simplekitchen.dao.config;

import com.simplekitchen.dao.service.UserServiceImpl;
import com.simplekitchen.dao.service.api.UserService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ConfigurationDao {

    @Bean
    public UserService getUserService() {

        return new UserServiceImpl();
    }
}
