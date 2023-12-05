package com.health.clinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

public class UserRole {

    @Id
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    public UserRole() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }
}
