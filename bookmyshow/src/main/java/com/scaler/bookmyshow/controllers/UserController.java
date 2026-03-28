package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseEntityController<User> {

    public UserController(UserService service) {
        super(service);
    }
}
