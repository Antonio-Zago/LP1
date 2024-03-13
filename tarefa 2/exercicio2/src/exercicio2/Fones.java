package exercicio2;

public class Fones {
	private String Modelo;
	
	private double Volume;
	
	private double Peso;
	
	public void Tocar() {
		System.out.println("Tocando!!");
	}
	
	public void AumentarVolume(double volume) {
		Volume += volume;
	}
	
	public void AbaixarVolume(double volume) {
		Volume -= volume;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public double getVolume() {
		return Volume;
	}

	public void setVolume(double volume) {
		Volume = volume;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}
	
	

}
