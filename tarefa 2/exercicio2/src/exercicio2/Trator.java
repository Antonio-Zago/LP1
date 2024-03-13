package exercicio2;

public class Trator {
	private String Modelo;
	
	private String Cor;
	
	private double Peso;
	
	public void LevantaCarga() {
		System.out.println("Levantando!!");
	}
	
	public void Acelerar() {
		System.out.println("Acelerando!!");
	}
	
	public void AbaixarCarga(double volume) {
		System.out.println("Abaixando!!");
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

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}
	
	
}
