package com.example.manytoone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private  String nom;
}
