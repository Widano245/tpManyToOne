package com.example.manytoone.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Command {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommand;
    private Double montant;

    @ManyToOne(cascade = CascadeType.MERGE)  // Car sinon la table de Client sera fermée
    @JoinColumn(name = "idClient")
    private Client client;

    //On peut faire ce lien avec un table d'association aussi comme suit
/*
@ManyToOne
    // Premiere solution et c'est mieux @JoinColumn(name="idClient") ou
	@JoinTable (name="Commande_Client_Association",
	            joinColumns=@JoinColumn(name="IdCommande"),
	             inverseJoinColumns=@JoinColumn(name="IdClient"))

	private Client client;
   */
}