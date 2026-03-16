package com.example.Ecom.service;

import java.util.List;

import com.example.Ecom.entity.Cart;

public interface CartService {
	
	 Cart addToCart(Cart cart);

	    List<Cart> getUserCart(Long userId);

	    void removeFromCart(Long cartId);

}
