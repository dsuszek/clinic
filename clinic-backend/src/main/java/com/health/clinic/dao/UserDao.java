package com.health.clinic.dao;

import com.health.clinic.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<User> {

    private List<User> users = new ArrayList<>();

    public UserDao() {
    }

    @Override
    public Optional<User> get(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setUsername(Objects.requireNonNull(
                params[0], "User name cannot be null"
        ));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"
        ));
        user.setPassword(Objects.requireNonNull(
                params[2], "Password cannot be null"
        ));
        user.setRoleId(Objects.requireNonNull(
                Short.valueOf(params[3]), "Role id cannot be null"
        ));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
