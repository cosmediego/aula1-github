package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Entre com um número:");
		double num1 = sc.nextDouble();
		
		
		while(num1 >= 0.0) {
			double raizQuadrada = Math.sqrt(num1);
			System.out.printf("%.3f%n", raizQuadrada);
			System.out.println("Digite Outro número: ");
			num1 = sc.nextDouble();
		}
		System.out.println("Número negativo");
		sc.close();
	}

}
