package com.cinema.GestionDeCinema;

import com.cinema.GestionDeCinema.Service.ICenemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionDeCinemaApplication implements CommandLineRunner {
	@Autowired
	private ICenemaInitService cinemaInitService;

	
	public static void main(String[] args) {
		SpringApplication.run(GestionDeCinemaApplication.class, args);
	
	 
	}


	@Override
	public void run(String... args) throws Exception {
		cinemaInitService.initVilles();


	}
}
