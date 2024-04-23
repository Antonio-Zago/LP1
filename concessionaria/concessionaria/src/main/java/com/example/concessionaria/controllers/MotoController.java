package com.example.concessionaria.controllers;

import java.util.List;

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
import com.example.concessionaria.models.Moto;

@RestController
@RequestMapping("/api/moto")
@CrossOrigin(origins="*")
public class MotoController {
	public MotoController() {

		Moto.addCliente(new Moto("Yamaha", "verde")); 
		Moto.addCliente(new Moto("Suzuki", "vermelho")); 
		Moto.addCliente(new Moto("Honda", "preto")); 


	}
	
	@GetMapping
	public List<Moto> getAll() {
		
		return Moto.motos;
	}
	
	@PostMapping
	public void Post(@RequestBody Moto moto) {
		Moto.addCliente(moto);
	}
	
	@PutMapping("/{id}")
	public void Put(@RequestBody Moto carroForm, @PathVariable Integer id) {
		 Moto.atualizar(id,carroForm);
	}
	
	@DeleteMapping("/{id}")
	void Delete(@PathVariable Integer id) {
		
		
		
		Moto.deletar(id);
	}
	
	@PutMapping("/comprar/{id}")
	public void Comprar(@PathVariable Integer id) {
		 Moto.ComprarMoto(id);
	}
}
