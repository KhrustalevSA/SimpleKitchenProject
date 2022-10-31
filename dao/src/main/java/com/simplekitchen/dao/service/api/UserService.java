package com.simplekitchen.dao.service.api;


import com.simplekitchen.dao.entity.user.api.User;

import java.util.List;

public interface UserService {
    List<User> findByName(String name, String surname, String patronymic);
    User findByUuid(Long uuid);
}
