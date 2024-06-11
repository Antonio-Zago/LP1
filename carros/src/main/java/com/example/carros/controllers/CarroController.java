package com.example.carros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carros.models.carro;
import com.example.carros.repositories.CarroRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/carro")
@CrossOrigin(origins="*")
public class CarroController {
	@Autowired
	private CarroRepository repository;
	
	@GetMapping
	public ResponseEntity<List<carro>> getAll() {

		return ResponseEntity.ok().body(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<carro> save(@RequestBody carro carro) {
		
		
		return ResponseEntity.ok().body(repository.save(carro));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<carro> update(@RequestBody carro carro, @PathVariable int id) {
		
		carro carroBanco = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());                    
		
		carroBanco.setCor(carro.getCor());
		carroBanco.setModelo(carro.getModelo());
		
		return ResponseEntity.ok().body(repository.save(carroBanco));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		
		carro carroBanco = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
		
		repository.delete(carroBanco);
	}
}
