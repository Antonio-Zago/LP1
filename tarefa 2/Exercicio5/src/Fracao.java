
public class Fracao {
	private double numerador;
	
	private double denominador;
	
	public Fracao Soma( Fracao n2) {
		
		int cont = 1;
		double maiorDenominador = 0;
		double mmc = 0;
		
		while(true) {
			if(denominador > n2.getDenominador()) {
				maiorDenominador = denominador;
			}
			else {
				maiorDenominador = n2.getDenominador();
			}
			
			double aux = maiorDenominador * cont;
			
			
			if(aux%denominador == 0 && aux%n2.getDenominador() == 0) {
				mmc = aux;
				break;
			}
			
			cont++;
		}
		
		double resultNumerador = ((mmc/denominador) * numerador) + ((mmc/n2.getDenominador()) * n2.getNumerador());
		
		Fracao retorno = new Fracao();
		retorno.setNumerador(resultNumerador);
		retorno.setDenominador(mmc);
		
		return retorno;
	}
	
	public Fracao Subtracao(Fracao n2) {
		int cont = 1;
		double maiorDenominador = 0;
		double mmc = 0;
		
		while(true) {
			if(denominador > n2.getDenominador()) {
				maiorDenominador = denominador;
			}
			else {
				maiorDenominador = n2.getDenominador();
			}
			
			double aux = maiorDenominador * cont;
			
			
			if(aux%denominador == 0 && aux%n2.getDenominador() == 0) {
				mmc = aux;
				break;
			}
			
			cont++;
		}
		
		double resultNumerador = ((mmc/denominador) * numerador) - ((mmc/n2.getDenominador()) * n2.getNumerador());
		
		Fracao retorno = new Fracao();
		retorno.setNumerador(resultNumerador);
		retorno.setDenominador(mmc);
		
		return retorno;
	}
	
	public Fracao Multiplicacao(Fracao n2) {
		double resultNumerador = numerador * n2.getNumerador();
		double resultDenominador = denominador * n2.getDenominador();
		
		Fracao resut = new Fracao();
		resut.setDenominador(resultDenominador);
		resut.setNumerador(resultNumerador);
		
		return resut;
	}
	
	public Fracao Divisao(Fracao n2) {
		double resultNumerador = numerador * n2.getDenominador();
		double resultDenominador = denominador * n2.getNumerador();
		
		Fracao resut = new Fracao();
		resut.setDenominador(resultDenominador);
		resut.setNumerador(resultNumerador);
		
		return resut;
	}
	
	
	
	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
}
