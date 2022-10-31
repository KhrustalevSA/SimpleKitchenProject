package com.simplekitchen.clientmanager.service.api;

import com.simplekitchen.dto.user.UserInfoResponseImpl;
import com.simplekitchen.dto.user.api.UserInfoRequest;
import com.simplekitchen.dto.user.api.UserInfoResponse;

public interface UserControllerService {
    UserInfoResponse find(UserInfoRequest request);

}
