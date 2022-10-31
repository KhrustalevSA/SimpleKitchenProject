package com.simplekitchen.business.service.api;

import com.simplekitchen.business.entity.user.api.User;

import java.util.List;

public interface UserService {
    List<User> findByName(String name, String surname, String patronymic);
    User findByUuid(Long uuid);
}
