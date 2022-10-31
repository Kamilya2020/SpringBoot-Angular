package com.cinema.GestionDeCinema.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.*;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String nomClient;
	private double prix;
	private int codePayement;
	private boolean reservee;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection;

}
