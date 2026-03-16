package com.example.Ecom.servicee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecom.Repository.CartRepository;
import com.example.Ecom.entity.Cart;
import com.example.Ecom.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
    private CartRepository cartRepository;

    @Override
    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getUserCart(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public void removeFromCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }


}
