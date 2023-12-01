package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @Column(name = "id")
    private UUID id;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "creationDate")
    private LocalDate creationDate;

    @NotNull
    @Column(name = "expirationDate")
    private LocalDate expirationDate;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    @NotNull
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @NotNull
    private Patient patientId;

    public Prescription() {
    }

    public Prescription(UUID id, @NotNull String description, @NotNull LocalDate creationDate, @NotNull LocalDate expirationDate, @NotNull Doctor doctorId, @NotNull Patient patientId) {
        this.id = id;
        this.description = description;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @NotNull
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(@NotNull LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @NotNull
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(@NotNull LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @NotNull
    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(@NotNull Doctor doctorId) {
        this.doctorId = doctorId;
    }

    @NotNull
    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull Patient patientId) {
        this.patientId = patientId;
    }
}
