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
	
	public Client findById(Long id) {
		return clientHashMap.get(id);
	}

	/// UPADATE
	public Client update(Long id, Client client) {
		Client clientOld = clientHashMap.get(id);
		if(clientOld == null) {
			return null;
		}
		/*
		clientOld.setName(!client.getName().isEmpty() ? client.getName() : clientOld.getName());
		clientOld.setEmail(!client.getEmail().isEmpty() ? client.getEmail() : clientOld.getEmail());
		clientOld.setPassword(!client.getPassword().isEmpty() ? client.getPassword() : clientOld.getPassword());
		clientOld.setEnabled(client.isEnabled());
		*/
		if(!client.getName().isEmpty()) {
			clientOld.setName(client.getName());
		}
		if(!client.getEmail().isEmpty()) {  
			clientOld.setEmail(client.getEmail());
		}
		if(!client.getPassword().isEmpty()) {
			clientOld.setPassword(client.getPassword());
		}
		clientOld.setEnabled(client.isEnabled());
		
		/// Retorna o cliente velho atualiza 
		return clientOld;
	}

	/// DELETE
	public void remove(Long id) {
		clientHashMap.remove(id);
	}

}
