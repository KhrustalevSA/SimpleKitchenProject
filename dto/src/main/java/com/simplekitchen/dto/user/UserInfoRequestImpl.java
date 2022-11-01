package com.simplekitchen.dto.user;

import com.simplekitchen.dto.user.api.UserInfoRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс для легкого поиска пользователей
 * @author KhrustalevSA
 * @since 16.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoRequestImpl implements UserInfoRequest {

    /**
     * @return уникальный идентификатор пользователя
     */
    private String uuid;

    /**
     * @return имя пользователя
     */
    private String name;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
