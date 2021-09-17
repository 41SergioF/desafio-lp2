package com.carlossergio.desafio.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.carlossergio.desafio.entities.Client;
import com.carlossergio.desafio.repository.ClientRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private ClientRepository repository;
	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(0L, "Carlos Sergio", "carlos@gmail.com", "000", true);
		Client c2 = new Client(1l, "Lucas Alexandre", "lucas@gmail.com", "111", true);
		Client c3 = new Client(3L, "Patricia Fernandes", "praticia@gmail.com", "333", true);
		
		repository.insert(c1);
		repository.insert(c2);
		repository.insert(c3);
	}	

}
