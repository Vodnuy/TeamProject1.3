package com.example.pz13.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String name;
    private int aud;
}
