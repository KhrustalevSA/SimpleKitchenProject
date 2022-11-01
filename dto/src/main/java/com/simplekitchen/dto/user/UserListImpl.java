package com.simplekitchen.dto.user;

import com.simplekitchen.dto.user.api.User;
import com.simplekitchen.dto.user.api.UserList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Класс списка пользователей
 * @author KhrustalevSA
 * @since 16.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserListImpl implements UserList {
    /**
     * список пользователей
     */
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }
}
