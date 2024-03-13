package exercicio2;

public class Animais {
	private String Nome; 
	
	private String Especie;
	
	private int NumeroDePatas;
	
	public void Correr() {
		System.out.println("Correndo!");
	}
	
	public void Morder() {
		System.out.println("Mordendo!");
	}
	
	public void Dormir() {
		System.out.println("Dormindo!");
	}
	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public int getNumeroDePatas() {
		return NumeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		NumeroDePatas = numeroDePatas;
	}
	
	
}
