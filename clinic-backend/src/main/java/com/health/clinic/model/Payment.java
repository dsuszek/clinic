package com.health.clinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Payment {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "dueDate")
    private LocalDate dueDate;

    @Column(name = "status")
    private String status;

    @Column(name = "bill")
    private double bill;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @NotNull
    private Patient patientId;
}
