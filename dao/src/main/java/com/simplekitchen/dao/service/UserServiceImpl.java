package com.simplekitchen.dao.service;

import com.simplekitchen.dao.entity.user.api.User;
import com.simplekitchen.dao.repository.UserRepository;
import com.simplekitchen.dao.service.api.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;


    @Override
    public List<User> findByName(String name, String surname, String patronymic) {
        //
        List<User> userList = repository.findByNameAndAndSurnameAndPatronymic(name, surname, patronymic );
        log.debug(String.format("Было найдено %s пользователей",CollectionUtils.size(userList)));
        return  userList;
    }

    @Override
    public User findByUuid(Long uuid) {
        Optional<User> optional = repository.findByUuid(uuid);

        if (optional.isPresent()) {
            User user = optional.get();
            log.debug(String.format("Был найден пользователь: ", user.toString()));
            return user;
        }
        return null;

    }
}
