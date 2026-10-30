package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; // 1. Import this
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name ="student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Use IDENTITY instead of default AUTO
    private long id;
    private String name;
    private String address;


}
