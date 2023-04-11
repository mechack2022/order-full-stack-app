package com.fragile.order_api.dto;

import java.time.ZonedDateTime;

public record OrderDto(String id, String description, OrderDto.UserDto user, ZonedDateTime createdAt) {

    public record UserDto(String username) {
    }
}
