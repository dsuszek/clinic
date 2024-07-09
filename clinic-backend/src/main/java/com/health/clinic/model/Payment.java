package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "Payments")
public class Payment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "dueDate")
    private LocalDate dueDate;

    @Column(name = "status")
    private String status;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @NotNull
    private Patient patientId;

    public Payment() {
    }

    public Payment(int id, LocalDate dueDate, String status, double amount, @NotNull Patient patientId) {
        this.id = id;
        this.dueDate = dueDate;
        this.status = status;
        this.amount = amount;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @NotNull
    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull Patient patientId) {
        this.patientId = patientId;
    }
}
