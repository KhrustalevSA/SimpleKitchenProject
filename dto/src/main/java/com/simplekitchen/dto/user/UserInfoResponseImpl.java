package com.simplekitchen.dto.user;

import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.recipe.api.RecipeList;
import com.simplekitchen.dto.user.api.UserInfoResponse;
import com.simplekitchen.dto.user.api.UserList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс для получения найденных из запроса поьзователей
 * @author KhrustalevSA
 * @since 16.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponseImpl implements UserInfoResponse {

    /**
     * поле статуса запроса
     */
    private StatusImpl status;

    /**
     * поле списка пользователей
     */
    private UserList userList;
}
