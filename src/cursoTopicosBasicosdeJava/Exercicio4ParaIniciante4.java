package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4ParaIniciante4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num = sc.nextInt();
		double numerador;
		double denominador;
		double resultado;

		for (int i = 1; i <= num; i++) {
			numerador = sc.nextInt();
			denominador = sc.nextInt();

			if (denominador != 0) {
				resultado = numerador / denominador;
				System.out.printf("%.1f", resultado);
			} else {
				System.out.println("divisao impossive");
			}
		}

		sc.close();

	}

}
