package com.health.clinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class MedicalHistory {

    @Id
    @Column(name = "id")
    private int id;
}
