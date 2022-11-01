package com.simplekitchen.dao.entity.user.api;

import com.simplekitchen.dao.entity.user.UserImpl;

import java.util.List;

/**
 * Интерфейс для сущности списка пользователей
 * @author KhrustalevSA
 * @since 16.10.2022
 */
public interface UserList {
    /**
     * список пользователей
     */
    List<UserImpl> getUserList();
}
