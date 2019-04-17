package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2ParaIniciante5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double codItem = sc.nextDouble();
		double quantidade = sc.nextDouble();
		double preco = 0.0;
		
		if(codItem == 1) {
			preco = quantidade * 4.00;
		}
		else if(codItem == 2) {
			preco = quantidade * 4.50;
		}
		else if(codItem == 3) {
			preco = quantidade * 5.00;
		}
		else if(codItem == 4) {
			preco = quantidade * 2.00;
		}
		else if(codItem == 5) {
			preco = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f ", preco);
		
		sc.close();
		
	}
	 


}
