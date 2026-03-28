package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractEntityService<User> {

    public UserService(UserRepository repository) {
        super(repository);
    }
}
