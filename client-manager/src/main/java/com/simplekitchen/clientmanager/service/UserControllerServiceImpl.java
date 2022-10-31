package com.simplekitchen.clientmanager.service;

import com.simplekitchen.business.entity.user.api.User;
import com.simplekitchen.business.service.api.UserService;
import com.simplekitchen.clientmanager.service.api.UserControllerService;
import com.simplekitchen.dto.user.api.UserInfoRequest;
import com.simplekitchen.dto.user.api.UserInfoResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class UserControllerServiceImpl implements UserControllerService {



    @Autowired
    private UserService userService;

    @Override
    public UserInfoResponse find(UserInfoRequest request) {
        //Подготовка данных к запросу бизнес-логики

        String name = request.getName();

        //Иньекция
        //Бины
        //mapper
        //Запрос данных
        //создать класс который перекладывает с юзера внешнего на дто слой
        List<User> byName = userService.findByName(name, null, null);
        return null; /////
    }


}
