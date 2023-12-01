package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Entity
@Table(name = "Doctors")
public class Doctor {

    @Id
    @Column(name = "id")
    private UUID id;

    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name = "lastName")
    private String lastName;

    @NotNull
    @Column(name = "isAvailable")
    private boolean isAvailable;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "emailAddress")
    private String emailAddress;

    @NotNull
    @Column(name = "specialization")
    private String specialization;

    public Doctor() {
    }

    public Doctor(UUID id, @NotNull String firstName, @NotNull String lastName, boolean isAvailable, String phoneNumber, String emailAddress, @NotNull String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAvailable = isAvailable;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.specialization = specialization;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @NotNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @NotNull
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(@NotNull String specialization) {
        this.specialization = specialization;
    }
}

