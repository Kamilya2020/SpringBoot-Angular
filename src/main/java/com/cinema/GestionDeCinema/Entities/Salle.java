package com.cinema.GestionDeCinema.Entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Salle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nombrePlace;
	@ManyToOne
	private Cinema cinema;
	@ToString.Exclude
	@OneToMany(mappedBy = "salle")
	private Collection<Place> places = new java.util.ArrayList<>();
	@ToString.Exclude
	@OneToMany(mappedBy = "salle")
	private Collection<Projection> projections = new java.util.ArrayList<>();
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setNombrePlace(int i) {
		// TODO Auto-generated method stub
		
	}
	public int getNombrePlace() {
		// TODO Auto-generated method stub
		return 0;
	}

}
