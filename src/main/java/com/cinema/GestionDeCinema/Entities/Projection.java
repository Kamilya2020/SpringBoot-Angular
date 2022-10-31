package com.cinema.GestionDeCinema.Entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.*;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Projection {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateProjection;
	private double prix;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Film film;
	@OneToMany(mappedBy = "projection")
	private Collection<Ticket> tickets;
	@ManyToOne
	private Seance seance;

}
