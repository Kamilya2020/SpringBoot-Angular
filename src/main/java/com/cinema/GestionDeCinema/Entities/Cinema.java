package com.cinema.GestionDeCinema.Entities;

import java.io.Serializable;
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
@ToString
public class Cinema implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public int getNombreSalles() {
		return nombreSalles;
	}
	public void setNombreSalles(int nombreSalles) {
		this.nombreSalles = nombreSalles;
	}
	public Collection<Salle> getSalles() {
		return Salles;
	}
	public void setSalles(Collection<Salle> salles) {
		Salles = salles;
	}
	public String getName() {
		return name;
	}
	public Ville getVille() {
		return ville;
	}
	private String name;
	private double longitude, latitude, altitude;
	private int nombreSalles;
	@OneToMany(mappedBy="cinema")
	private Collection<Salle> Salles;
	@ManyToOne
	private Ville ville;
	public void setName(String nameCinema) {
		// TODO Auto-generated method stub
		
	}
	public void setVille(Ville v) {
		// TODO Auto-generated method stub
		
	}
}
