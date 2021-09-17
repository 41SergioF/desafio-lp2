package com.carlossergio.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlossergio.desafio.entities.Client;
import com.carlossergio.desafio.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {
	@Autowired
	ClientService service;

	/// CREATE
	@PostMapping
	public ResponseEntity<Client> insert(@RequestBody Client obj) {
		service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}

	/// READ
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> clients = service.findAll();
		return ResponseEntity.ok().body(clients);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}

	/// UPDATE
	@PutMapping(value = "/{id}")
	public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client obj) {
		return ResponseEntity.ok().body(service.update(id, obj));
	}

	/// DELETE
	@DeleteMapping(value = "/{id}")
	public void remove(@PathVariable Long id) {
		service.remove(id);
	}
}
