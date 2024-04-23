package com.example.concessionaria.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pessoa {
	private int id;
	
	private String Nome;
	
	private List<Carro> carros;
	
	private List<Moto> motos;
	
	public static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static Integer idIncremento = 0;
	
	public Pessoa(String nome) {
		this.Nome = nome;
		carros = new ArrayList<Carro>();
		motos = new ArrayList<Moto>();
	}
	
	public static Pessoa addCliente(Pessoa pessoa) {
		pessoa.id = idIncremento;
		idIncremento++;
		pessoas.add(pessoa);
		return pessoa;
	}
	
	public static Pessoa encontrarPorId(int idProcurado) {
        for (Pessoa objeto : pessoas) {
            if (objeto.getId() == idProcurado) {
                return objeto;
            }
        }
        return null;
	}
	
	public static void atualizar(int idProcurado, Pessoa carroForm) {
		Pessoa carro = Pessoa.encontrarPorId(idProcurado);
		
		carro.setNome(carroForm.getNome());
		

		
	}
	
	public static void deletar(Integer id) {
		Iterator<Pessoa> iterator = pessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa objeto = iterator.next();
            if (objeto.getId() == id) {
                iterator.remove();
            }
        }
		
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public List<Moto> getMotos() {
		return motos;
	}

	public void setMotos(List<Moto> motos) {
		this.motos = motos;
	}
	
	
	
	
	
}
