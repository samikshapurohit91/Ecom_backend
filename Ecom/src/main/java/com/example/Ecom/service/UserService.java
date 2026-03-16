package com.example.Ecom.service;

import com.example.Ecom.entity.User;

public interface UserService {

	User register(User user);

    User login(String email, String password);

}
