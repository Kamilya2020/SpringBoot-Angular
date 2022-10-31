package com.cinema.GestionDeCinema.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cinema.GestionDeCinema.Entities.Salle;
@RepositoryRestResource

public interface SalleRepository extends JpaRepository<Salle, Long> {

}
