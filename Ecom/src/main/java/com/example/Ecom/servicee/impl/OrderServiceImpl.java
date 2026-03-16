package com.example.Ecom.servicee.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecom.Repository.OrderRepository;
import com.example.Ecom.entity.Order;
import com.example.Ecom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
    private OrderRepository orderRepository;

    @Override
    public Order placeOrder(Order order) {

        order.setOrderDate(LocalDateTime.now());
        order.setStatus("PLACED");

        return orderRepository.save(order);
    }

    @Override
    public List<Order> getUserOrders(Long userId) {
        return orderRepository.findByUserId(userId);
    }

}
