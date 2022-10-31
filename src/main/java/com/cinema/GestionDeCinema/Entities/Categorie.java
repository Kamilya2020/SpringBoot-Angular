package com.cinema.GestionDeCinema.Entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Categorie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=75)
	private String name;
	@ToString.Exclude
	@OneToMany(mappedBy = "categorie")
	private Collection<Film> films = new java.util.ArrayList<>();

}
