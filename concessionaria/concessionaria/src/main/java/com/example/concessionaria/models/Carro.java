package com.example.concessionaria.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Carro {
	
	private int id;
	
	private String Cor;
	
	private String Marca;
	
	public static List<Carro> carros = new ArrayList<Carro>();
	
	public static Integer idIncremento = 0;
	
	public Carro(String marca, String cor) {
		this.Marca = marca;
		this.Cor = cor;
	}
	
	public static Carro addCliente(Carro carro) {
		carro.id = idIncremento;
		idIncremento++;
		carros.add(carro);
		return carro;
	}
	
	public static Carro encontrarPorId(int idProcurado) {
        for (Carro objeto : carros) {
            if (objeto.getId() == idProcurado) {
                return objeto;
            }
        }
        return null;
	}
	
	public static void atualizar(int idProcurado, Carro carroForm) {
		Carro carro = Carro.encontrarPorId(idProcurado);
		
		carro.setMarca(carroForm.getMarca());
		carro.setCor(carroForm.getCor());
		

		
	}
	
	public static void deletar(Integer id) {
		Iterator<Carro> iterator = carros.iterator();
        while (iterator.hasNext()) {
            Carro objeto = iterator.next();
            if (objeto.getId() == id) {
                iterator.remove();
            }
        }
		
	}
	
	public static void ComprarCarro(Integer idCarro) {
		Carro carro = Carro.encontrarPorId(idCarro);
		Pessoa eu = Pessoa.encontrarPorId(0);
		
		List<Carro> meusCarros =  eu.getCarros();
		meusCarros.add(carro);
		Carro.deletar(idCarro);
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	
	
	
}
