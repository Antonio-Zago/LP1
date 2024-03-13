package exercicio2;

public class Fruta {
	private String Nome;
	
	private String Cor;
	
	private double Peso;
	
	public void Crescer() {
		System.out.println("Crescendo!!");
	}
	
	public void Apodrescer() {
		System.out.println("Apodrescendo!!");
	}
	
	public void Cair(double volume) {
		System.out.println("Caindo!!");
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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
