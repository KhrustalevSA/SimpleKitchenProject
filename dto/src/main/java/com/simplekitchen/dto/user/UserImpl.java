package com.simplekitchen.dto.user;

import com.simplekitchen.dto.user.api.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImpl implements User {
    private String name;
    private String surname;
    private Long age;
    private String sex;

}
