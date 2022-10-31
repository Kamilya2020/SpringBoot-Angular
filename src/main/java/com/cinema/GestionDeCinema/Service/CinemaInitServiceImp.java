package com.cinema.GestionDeCinema.Service;

import com.cinema.GestionDeCinema.DAO.CinemaRepository;
import com.cinema.GestionDeCinema.DAO.PlaceRepository;
import com.cinema.GestionDeCinema.DAO.SalleRepository;
import com.cinema.GestionDeCinema.DAO.VilleRepository;
import com.cinema.GestionDeCinema.Entities.Cinema;
import com.cinema.GestionDeCinema.Entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;

public class CinemaInitServiceImp implements ICenemaInitService{
    @Autowired
    private VilleRepository villeRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private SalleRepository salleRepository;
    @Autowired
    private PlaceRepository placeRepository;




    public void initVilles() {
        Stream.of("Teboursouk","Douz","Tataouin","Gbeli","Bizerte").forEach(nameVille->{
            Ville ville=new Ville();
            ville.setName(nameVille);
            villeRepository.save(ville);

        });


    }

    @Override
    public void initCinemas() {
        villeRepository.findAll().forEach(v->{
            Stream.of("Le Colisée","Le Parnasse","Centre Culturel Neapolis Nabeul","Salle Rayhana Bourgo Mall")
                    .forEach(nameCinema->{
                        Cinema cinema= new Cinema();
                        cinema.setName(nameCinema);
                        cinema.setNombreSalles( (int) (3+(Math.random()*7)));
                        cinema.setVille(v);

                    });
        });

    }

    @Override
    public void initSalles() {

    }

    @Override
    public void initPlaces() {

    }

    @Override
    public void initSeances() {

    }

    @Override
    public void initCategories() {

    }

    @Override
    public void initFilms() {

    }

    @Override
    public void initProjections() {

    }

    @Override
    public void initTickets() {

    }
}
