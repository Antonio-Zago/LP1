package exercicio2;

public class Arvores {
    private String Nome;
	
	private String FormatoGalhos;
	
	private double Altura;
	
	public void Crescer(double tamanho) {
		Altura += tamanho; 
	}
	
	public void DerrubarFolhas() {
		System.out.println("Derrubando folhas!!");
	}
	
	public void Balançar() {
		System.out.println("Balançando!");
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getFormatoGalhos() {
		return FormatoGalhos;
	}

	public void setFormatoGalhos(String formatoGalhos) {
		FormatoGalhos = formatoGalhos;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	
}
