package com.example.concessionaria.controllers;

import java.util.List;

import org.springframework.boot.autoconfigure.ssl.PemSslBundleProperties;
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
import com.example.concessionaria.models.Pessoa;

@RestController
@RequestMapping("/api/pessoa")
@CrossOrigin(origins="*")
public class PessoaController {
	
	public PessoaController() {

		Pessoa.addCliente(new Pessoa("Antonio")); 


	}
	
	@GetMapping
	public List<Pessoa> getAll() {
		
		return Pessoa.pessoas;
	}
	
	@PostMapping
	public void Post(@RequestBody Pessoa pessoa) {
		Pessoa.addCliente(pessoa);
	}
	
	@PutMapping("/{id}")
	public void Put(@RequestBody Pessoa carroForm, @PathVariable Integer id) {
		 Pessoa.atualizar(id,carroForm);
	}
	
	@DeleteMapping("/{id}")
	void Delete(@PathVariable Integer id) {
		
		
		
		Pessoa.deletar(id);
	}
}
