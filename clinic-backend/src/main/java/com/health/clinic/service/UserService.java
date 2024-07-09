package com.health.clinic.service;

import com.health.clinic.dao.UserDao;
import com.health.clinic.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value = "userService")
@Service
public class UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);
    private UserDao userDao;
    private UserValidator userValidator;

    public UserService(UserDao userDao, UserValidator userValidator) {
        this.userDao = userDao;
        this.userValidator = userValidator;
    }


}
