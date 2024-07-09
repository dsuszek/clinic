package com.health.clinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MedicalHistory {

    @Id
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "appointments")
    private List<Appointment> appointments;

    @NotNull
    @Column(name = "prescriptions")
    private List<Prescription> prescriptions;

    @NotNull
    @Column(name = "patientId")
    private Patient patientId;

    public MedicalHistory() {
    }

    public MedicalHistory(int id, @NotNull List<Appointment> appointments, @NotNull Patient patientId) {
        this.id = id;
        this.appointments = appointments;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(@NotNull List<Appointment> appointments) {
        this.appointments = appointments;
    }

    @NotNull
    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull Patient patientId) {
        this.patientId = patientId;
    }
}
