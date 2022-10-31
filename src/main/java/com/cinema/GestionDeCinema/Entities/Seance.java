package com.cinema.GestionDeCinema.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureDebut;
}
