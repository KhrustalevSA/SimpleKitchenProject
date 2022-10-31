package com.simplekitchen.business.mapper.api;

import com.simplekitchen.business.entity.user.api.User;
import com.simplekitchen.business.entity.user.api.UserName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User map(com.simplekitchen.dao.entity.user.api.User user);
    UserName mapName(com.simplekitchen.dao.entity.user.api.User user);
}
