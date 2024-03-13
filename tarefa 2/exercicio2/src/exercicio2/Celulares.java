package exercicio2;

public class Celulares {
    private String Modelo;
	
	private int TamanhoTela;
	
	private String Cor;
	
	public void Ligar() {
		System.out.println("Ligando!");
	}
	
	public void Desligar() {
		System.out.println("Desligando!!");
	}
	
	public void Telefonar() {
		System.out.println("Telefonando!");
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getTamanhoTela() {
		return TamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		TamanhoTela = tamanhoTela;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	
}
