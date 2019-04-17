package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	/*
	 * do { comando 1 comando 2 } while ( condição );
	 */

	/*
	 * Regra: V: volta F: pula fora
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String resposta;

		do {
			System.out.println("Digite o número que queira a raiz quadrada: ");
			double num = sc.nextDouble();
			double raizQuadrada = Math.sqrt(num);
			System.out.printf("Raiz Quadrada = %.3f ", raizQuadrada);
			
			System.out.println("Deseja repetir o procedimento. S ou N?");
			resposta = sc.next();
		} while (!resposta.equalsIgnoreCase("N"));
		System.out.println("Programa encerrado!!!");

		sc.close();
	}

}
