package com.randstad.characters.domain.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "characters")
public class MyCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String img;

    @Column(length = 1000)
    private String description;
}
