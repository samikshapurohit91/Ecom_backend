package com.example.Ecom.service;

import java.util.List;

import com.example.Ecom.entity.Order;

public interface OrderService {
	
	Order placeOrder(Order order);

    List<Order> getUserOrders(Long userId);

}
