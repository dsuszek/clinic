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
    @Column(name = "dateTime")
    private LocalDateTime dateTime;

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

    public Appointment(int id, int roomNumber, @NotNull LocalDateTime dateTime, @NotNull Patient patientId, @NotNull Doctor doctorId) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.dateTime = dateTime;
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
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDate(@NotNull LocalDateTime dateTime) {
        this.dateTime = dateTime;
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
