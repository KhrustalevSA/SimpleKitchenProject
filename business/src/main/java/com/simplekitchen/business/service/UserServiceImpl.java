package com.simplekitchen.business.service;

import com.simplekitchen.business.entity.user.api.User;
import com.simplekitchen.business.mapper.api.UserMapper;
import com.simplekitchen.business.service.api.UserService;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final com.simplekitchen.dao.service.api.UserService userService;

    @Override
    public List<User> findByName(String name, String surname, String patronymic) {
        List<com.simplekitchen.dao.entity.user.api.User> userList = userService.findByName(name, surname, patronymic);
        if (CollectionUtils.isNotEmpty(userList)) {
            return userList.stream().map(UserMapper.INSTANCE::map).collect(Collectors.toList());
            //stream()
        }
        return null;
    }

    @Override
    public User findByUuid(Long uuid) {
        return null;
    }
}
