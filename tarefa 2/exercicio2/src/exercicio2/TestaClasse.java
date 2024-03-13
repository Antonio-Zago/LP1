package exercicio2;

public class TestaClasse {
	public static void main(String[] args) {
		Animais animal = new Animais();
		Arvores arvore = new Arvores();
		Cachorro cachorro = new Cachorro();
		Celulares celular = new Celulares();
		Computadores computador = new Computadores();
		Fones fone = new Fones();
		Fruta fruta =new Fruta();
		Motos moto = new Motos();
		Trator trator = new Trator();
		
		animal.Correr();
		animal.Dormir();
		
		arvore.Balançar();
		arvore.Crescer(10);
		
		cachorro.Comer();
		cachorro.Correr();
		
		celular.Ligar();
		celular.Desligar();
		
		computador.Ligar();
		computador.Desligar();
		
		fone.AumentarVolume(10);
		fone.AbaixarVolume(5);
		
		fruta.Crescer();
		fruta.Apodrescer();
		
		moto.Ligar();
		moto.Acelerar(10);
		
		trator.LevantaCarga();
		trator.Acelerar();
		
	
	}
}
