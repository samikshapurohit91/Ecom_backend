package com.example.Ecom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecom.entity.User;
import com.example.Ecom.security.JwtUtil;
import com.example.Ecom.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	 @Autowired
	    private UserService userService;
	 
	 @Autowired
	 private JwtUtil jwtUtil;

	    @PostMapping("/register")
	    public User register(@RequestBody User user) {
	        return userService.register(user);
	    }

//	    @PostMapping("/login")
//	    public User login(@RequestParam String email,
//	                      @RequestParam String password) {
//	        return userService.login(email, password);
//	    }
	    
	    @PostMapping("/login")
	    public String login(@RequestParam String email,
	                        @RequestParam String password) {

	        User user = userService.login(email, password);

	        return jwtUtil.generateToken(user.getEmail());
	    }

	    
	  
}
