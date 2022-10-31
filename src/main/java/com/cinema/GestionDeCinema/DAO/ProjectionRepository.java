package com.cinema.GestionDeCinema.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cinema.GestionDeCinema.Entities.Projection;
@RepositoryRestResource

public interface ProjectionRepository extends JpaRepository<Projection, Long> {

}
