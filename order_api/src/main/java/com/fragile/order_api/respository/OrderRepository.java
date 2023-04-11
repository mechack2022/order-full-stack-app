package com.fragile.order_api.respository;


import com.fragile.order_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findAllByOrderByCreatedAtDesc();

    List<Order> findByIdContainingOrDescriptionContainingIgnoreCaseOrderByCreatedAt(String id, String description);
}
