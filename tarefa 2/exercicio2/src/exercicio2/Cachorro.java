package exercicio2;

public class Cachorro {
    private String Nome; 
	
	private String Raça;
	
	private String Cor;
	
	public void Correr() {
		System.out.println("Correndo!");
	}
	
	public void Comer() {
		System.out.println("Comendo!!");
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

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	
}
