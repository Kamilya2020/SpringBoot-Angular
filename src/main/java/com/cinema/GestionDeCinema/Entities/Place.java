package com.cinema.GestionDeCinema.Entities;

import java.util.Collection;

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
public class Place {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private double longititude, laltitude,altitude;
	@ManyToOne
	private Salle salle;
	@OneToMany(mappedBy ="place")
	private Collection<Ticket> tickets;
	public void setNumero(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setSalle(Salle salle2) {
		// TODO Auto-generated method stub
		
	}
	

}
