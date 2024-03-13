package exercicio2;

public class Carros {

	private String Modelo;
	
	private String Placa;
	
	private String Cor;
	
	public void Acelerar() {
		System.out.println("Acelerando!");
	}
	
	public void Freiar() {
		System.out.println("Freiando!!");
	}
	
	public void DispararAlarme() {
		System.out.println("DisparandoAlarme!");
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	
}
