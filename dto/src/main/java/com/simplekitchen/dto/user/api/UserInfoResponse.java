package com.simplekitchen.dto.user.api;

import com.simplekitchen.dto.common.StatusImpl;
import com.simplekitchen.dto.recipe.api.RecipeList;

public interface UserInfoResponse {
    /**
     * @return статус ответа
     */
    StatusImpl getStatus();

    /**
     * @return найденные пользователи
     */
    UserList getUserList();
}
