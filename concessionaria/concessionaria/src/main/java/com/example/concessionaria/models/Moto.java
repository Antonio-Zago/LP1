package com.example.concessionaria.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Moto {
	private int id;
	
	private String Cor;
	
	private String Marca;
	
	public static List<Moto> motos = new ArrayList<Moto>();
	
	public static Integer idIncremento = 0;
	
	public Moto(String marca, String cor) {
		this.Marca = marca;
		this.Cor = cor;
	}
	
	public static Moto addCliente(Moto moto) {
		moto.id = idIncremento;
		idIncremento++;
		motos.add(moto);
		return moto;
	}
	
	public static Moto encontrarPorId(int idProcurado) {
        for (Moto objeto : motos) {
            if (objeto.getId() == idProcurado) {
                return objeto;
            }
        }
        return null;
	}
	
	public static void atualizar(int idProcurado, Moto carroForm) {
		Moto moto = Moto.encontrarPorId(idProcurado);
		
		moto.setMarca(carroForm.getMarca());
		moto.setCor(carroForm.getCor());
		

		
	}
	
	public static void deletar(Integer id) {
		Iterator<Moto> iterator = motos.iterator();
        while (iterator.hasNext()) {
            Moto objeto = iterator.next();
            if (objeto.getId() == id) {
                iterator.remove();
            }
        }
		
	}
	
	public static void ComprarMoto(Integer idMoto) {
		Moto moto = Moto.encontrarPorId(idMoto);
		Pessoa eu = Pessoa.encontrarPorId(0);
		
		List<Moto> minhasMotos =  eu.getMotos();
		minhasMotos.add(moto);
		Moto.deletar(idMoto);
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
