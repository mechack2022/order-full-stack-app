package com.fragile.order_api.mapper;

import com.fragile.order_api.dto.CreateOrderRequest;
import com.fragile.order_api.model.Order;
import com.fragile.order_api.dto.OrderDto;

public interface OrderMapper {

    Order toOrder(CreateOrderRequest createOrderRequest);

    OrderDto toOrderDto(Order order);
}
