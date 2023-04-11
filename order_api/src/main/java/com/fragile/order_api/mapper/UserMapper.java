package com.fragile.order_api.mapper;

import com.fragile.order_api.dto.UserDto;
import com.fragile.order_api.model.User;

public interface UserMapper {

    UserDto toUserDto(User user);
}
