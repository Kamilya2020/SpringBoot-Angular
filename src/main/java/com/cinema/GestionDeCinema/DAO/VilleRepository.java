package com.cinema.GestionDeCinema.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cinema.GestionDeCinema.Entities.Ville;
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long> {

}
