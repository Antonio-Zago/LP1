package exercicio2;

public class Motos {
	private String Modelo;
	
	private double Velocidade;
	
	private double Peso;
	
	public void Ligar() {
		System.out.println("Ligando!!");
	}
	
	public void Acelerar(double velocidade) {
		Velocidade += velocidade;
	}
	
	public void Freiar(double velocidade) {
		Velocidade += velocidade;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public double getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(double velocidade) {
		Velocidade = velocidade;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}
	
	
}
