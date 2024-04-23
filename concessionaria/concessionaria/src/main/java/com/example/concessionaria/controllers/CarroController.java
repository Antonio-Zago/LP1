package com.example.concessionaria.controllers;

import java.util.List;

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

import com.example.concessionaria.models.Carro;

@RestController
@RequestMapping("/api/carro")
@CrossOrigin(origins="*")
public class CarroController {

	
	public CarroController() {

		Carro.addCliente(new Carro("Ford", "verde")); 
		Carro.addCliente(new Carro("Gm", "vermelho")); 
		Carro.addCliente(new Carro("Volks", "preto")); 


	}
	
	@GetMapping
	public List<Carro> getAll() {
		
		return Carro.carros;
	}
	
	@PostMapping
	public void Post(@RequestBody Carro carro) {
		Carro.addCliente(carro);
	}
	
	@PutMapping("/{id}")
	public void Put(@RequestBody Carro carroForm, @PathVariable Integer id) {
		 Carro.atualizar(id,carroForm);
	}
	
	@DeleteMapping("/{id}")
	void Delete(@PathVariable Integer id) {
		
		
		
		Carro.deletar(id);
	}
	
	@PutMapping("/comprar/{id}")
	public void Comprar(@PathVariable Integer id) {
		 Carro.ComprarCarro(id);
	}
}
