package com.example.Ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecom.entity.Cart;
import com.example.Ecom.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	 @Autowired
	    private CartService cartService;

	    @PostMapping("/add")
	    public Cart addToCart(@RequestBody Cart cart) {
	        return cartService.addToCart(cart);
	    }

	    @GetMapping("/user/{userId}")
	    public List<Cart> getUserCart(@PathVariable Long userId) {
	        return cartService.getUserCart(userId);
	    }

	    @DeleteMapping("/remove/{cartId}")
	    public String removeFromCart(@PathVariable Long cartId) {
	        cartService.removeFromCart(cartId);
	        return "Item removed from cart";
	    }
	

}
