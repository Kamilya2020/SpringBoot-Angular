package com.cinema.GestionDeCinema.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cinema.GestionDeCinema.Entities.Ticket;
@RepositoryRestResource

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
