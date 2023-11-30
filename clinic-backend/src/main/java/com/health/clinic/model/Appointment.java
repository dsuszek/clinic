package com.health.clinic.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @SequenceGenerator(name = "appointments_id_seq",
            sequenceName = "appointments_id_seq",
            allocationSize = 1)
    private int id;

    @NonNull
    @Column(name = "roomNumber")
    private int roomNumber;

    @NotNull
    @Column(name="date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @NotNull
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    @NotNull
    private Doctor doctor;
}
