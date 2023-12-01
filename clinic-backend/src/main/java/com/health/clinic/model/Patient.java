package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Patients")
public class Patient {

    @Id
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name = "lastName")
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "birthDate")
    private LocalDate birthDate;

    @NotNull
    @Column(name = "addressStreet")
    private String addressStreet;

    @NotNull
    @Column(name = "addressApartmentNumber")
    private String addressApartmentNumber;

    @NotNull
    @Column(name = "addressCity")
    private String addressCity;

    @NotNull
    @Column(name = "postalCode")
    private String postalCode;

    @NotNull
    @Column(name = "addressCountry")
    private String addressCountry;

    public Patient() {
    }

    public Patient(int id, @NotNull String firstName, @NotNull String lastName, @NotNull LocalDate birthDate, @NotNull String addressStreet, @NotNull String addressApartmentNumber, @NotNull String addressCity, @NotNull String postalCode, @NotNull String addressCountry) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.addressStreet = addressStreet;
        this.addressApartmentNumber = addressApartmentNumber;
        this.addressCity = addressCity;
        this.postalCode = postalCode;
        this.addressCountry = addressCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @NotNull
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotNull LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @NotNull
    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(@NotNull String addressStreet) {
        this.addressStreet = addressStreet;
    }

    @NotNull
    public String getAddressApartmentNumber() {
        return addressApartmentNumber;
    }

    public void setAddressApartmentNumber(@NotNull String addressApartmentNumber) {
        this.addressApartmentNumber = addressApartmentNumber;
    }

    @NotNull
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(@NotNull String addressCity) {
        this.addressCity = addressCity;
    }

    @NotNull
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@NotNull String postalCode) {
        this.postalCode = postalCode;
    }

    @NotNull
    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(@NotNull String addressCountry) {
        this.addressCountry = addressCountry;
    }
}
