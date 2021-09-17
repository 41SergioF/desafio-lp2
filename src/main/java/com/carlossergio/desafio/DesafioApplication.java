package com.carlossergio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DesafioApplication.class, args);
		
	}

}
/*
 * Client c1 = new Client(0L, "Carlos Sergio", "carlos@gmail.com", "000", true);
		Client c2 = new Client(1l, "Lucas Alexandre", "lucas@gmail.com", "111", true);
		Client c3 = new Client(3L, "Patricia Fernandes", "praticia@gmail.com", "333", true);
		ClientRepository repository  = new ClientRepository();
		repository.insert(c1);
		repository.insert(c2);
		repository.insert(c3);*/
 