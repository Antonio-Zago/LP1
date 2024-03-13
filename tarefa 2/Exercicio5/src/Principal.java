
public class Principal {
	
	
	
	public static void main(String[] args) {
		Fracao n1= new Fracao();
		n1.setNumerador(2);
		n1.setDenominador(5);
		
		Fracao n2= new Fracao();
		n2.setNumerador(3);
		n2.setDenominador(7);
		
		Fracao resultado = new Fracao();
				
	    resultado = n1.Soma(n2);
	    
	    System.out.println(resultado.getNumerador());
	    System.out.println(resultado.getDenominador());
	}
	
	

	
	
	
	
	
	
}
