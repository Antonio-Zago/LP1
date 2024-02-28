import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		//1. Altere seu programa para imprimir uma mensagem diferente.
	      System.out.println("Quem tem boca vaia roma!!"); 
	      
	    //2 . Altere seu programa para imprimir duas linhas de texto usando 
	    //duas linhas de código System.out.
	      System.out.println("Em terra de cego ");
	      System.out.println("quem tem um olho é rei");
	      
	    //3. Sabendo que os caracteres \n representam uma quebra de linhas, 
	    //imprima duas linhas de texto usando uma única linha de código 
	    //System.out
	      System.out.println("O machado esquece da arvore \n a arvore não esquece do machado");
	      
	      
	     /*1. Na empresa em que trabalhamos, há tabelas com o gasto de cada 
	      mês. Para fechar o balanço do primeiro trimestre, precisamos 
	      somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil 
	      reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um 
	      programa que calcule e imprima a despesa total no trimestre e a 
	      média mensal de gastos. */
	      double janeiro = 15000;
	      double fevereiro = 23000;
	      double marco = 17000;
	      double despesaTotal = janeiro + fevereiro + marco;
	      double media = despesaTotal / 3;
	      System.out.println("Despesa total: " + despesaTotal);
	      System.out.println("Média mensal: " + media);
	      
	      /*2. Programa que leia as notas e calcule a média de LP1 deste 
	      semestre, referente a um determinado aluno.*/
	      
	      Scanner ler = new Scanner(System.in);
	      
	      System.out.printf("Informe a nota da prova 1:\n");
	      double p1 = ler.nextDouble();
	      System.out.printf("Informe a nota do exercicio 1:\n");
	      double e1 = ler.nextDouble();
	      System.out.printf("Informe a nota do exercicio 2:\n");
	      double e2 = ler.nextDouble();
	      
	      System.out.printf("Informe a nota da API:\n");
	      double api = ler.nextDouble();
	      
	      System.out.printf("Informe a nota das atividades extras:\n");
	      double x = ler.nextDouble();
	      
	      System.out.printf("Informe a nota da prova substitutiva:\n");
	      double sub = ler.nextDouble();
	      
	      double max = ((p1*0.6+((e1+e2)/2)*0.4)-5.9);
	      
	      if(max < 0 ) {
	    	  max = 0;
	      }
	      double notaFinal = 	(p1*0.6+((e1+e2)/2)*0.4)*0.5+(max/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2);
	      
	      
	      System.out.printf("Nota final:" + notaFinal);
	      
	      
	      

	      
	      
	      
	   }
}
