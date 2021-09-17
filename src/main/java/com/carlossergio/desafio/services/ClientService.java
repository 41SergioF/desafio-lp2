package com.carlossergio.desafio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carlossergio.desafio.entities.Client;
import com.carlossergio.desafio.repository.ClientRepository;

@Service
public class ClientService {
	
	private static ClientRepository repository = new ClientRepository();

	
	/// CREATE
	public void insert(Client client) {
		repository.insert(client);
	}

	/// READ
	public List<Client> findAll() {
		List<Client> list = repository.findAll();
		return list	;
	}

	/// UPADATE
	public Client update(Client client) {
		return repository.update(client);		
	}

	/// DELETE
	public void remove(Long id) {
		repository.remove(id);
	}
}
