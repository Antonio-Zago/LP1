package exercicio2;

public class Computadores {
	private String Modelo;
	
	private String Cor;
	
	private double TamanhoTela;
	
	public void Ligar() {
		System.out.println("Ligando!!");
	}
	
	public void Desligar() {
		System.out.println("Desligando!!");
	}
	
	public void AcessarInternet(double volume) {
		System.out.println("Acessando Internet!!");
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public double getTamanhoTela() {
		return TamanhoTela;
	}

	public void setTamanhoTela(double tamanhoTela) {
		TamanhoTela = tamanhoTela;
	}
	
	
}
