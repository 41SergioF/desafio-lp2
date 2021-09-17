package com.carlossergio.desafio.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.carlossergio.desafio.entities.Client;

/// CRUD
/// CREATE-READ-UPDATE-DELETE
public class ClientRepository {

	private static Long coant = 0l;

	HashMap<Long, Client> clientHashMap;

	public ClientRepository() {
		clientHashMap = new HashMap<Long, Client>();
	}

	/// CREATE
	public void insert(Client client) {
		client.setId(coant);
		clientHashMap.put(coant, client);
		coant++;
	}

	/// READ
	public List<Client> findAll() {
		List<Client> listClients = new ArrayList<>(clientHashMap.values());
		return listClients;
	}

	/// UPADATE
	public Client update(Client client) {
		Client clientWork = clientHashMap.get(client.getId());
		if(clientWork == null) {
			return null;
		}
		clientWork.setName(client.getName().isEmpty() ? client.getName() : null);
		clientWork.setEmail(client.getEmail().isEmpty() ? client.getEmail() : null);
		clientWork.setPassword(client.getPassword().isEmpty() ? client.getPassword() : null);
		clientWork.setEnabled(client.isEnabled());
		return clientWork;
	}

	/// DELETE
	public void remove(Long id) {
		clientHashMap.remove(id);
	}

}
