package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "roomNumber")
    private int roomNumber;

    @NotNull
    @Column(name = "date")
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @NotNull
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    @NotNull
    private Doctor doctorId;

    public Appointment() {
    }

    public Appointment(int id, int roomNumber, @NotNull LocalDateTime date, @NotNull Patient patientId, @NotNull Doctor doctorId) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.date = date;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @NotNull
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(@NotNull LocalDateTime date) {
        this.date = date;
    }

    @NotNull
    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull Patient patientId) {
        this.patientId = patientId;
    }

    @NotNull
    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(@NotNull Doctor doctorId) {
        this.doctorId = doctorId;
    }
}
