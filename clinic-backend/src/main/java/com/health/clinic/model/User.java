package com.health.clinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

public class User {

    @Id
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "roleId")
    private short roleId;

    public User() {
    }

    public User(int id, @NotNull String email, @NotNull String username, @NotNull String password, short roleId) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    public short getRoleId() {
        return roleId;
    }

    public void setRoleId(short roleId) {
        this.roleId = roleId;
    }
}
