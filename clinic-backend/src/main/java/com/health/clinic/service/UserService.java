package com.health.clinic.service;

import com.health.clinic.dao.UserDao;
import com.health.clinic.exception.FailedToCreateUserException;
import com.health.clinic.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public User createUser(User user) throws FailedToCreateUserException {
        logger.info("Trying to create a new user");
        String validationError = userValidator.isUserValid(user);

        if (validationError != null) {
            logger.error("User validation failed: {}", validationError);
            throw new FailedToCreateUserException("Error while creating the user: " + validationError);
        }

        try {
            User savedUser = userDao.save(user);
            logger.info("User created successfully with ID: {}", savedUser.getId());
            return savedUser;
        } catch (Exception e) {
            logger.error("Failed to create user due to an unexpected error", e);
            throw new FailedToCreateUserException("Failed to create user: " + e.getMessage());
        }
    }
}
