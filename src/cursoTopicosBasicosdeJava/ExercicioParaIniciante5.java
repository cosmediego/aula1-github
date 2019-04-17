package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioParaIniciante5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codicoPeca1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double vlrUnitarioPeca1 = sc.nextDouble();

		int codicoPeca2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double vlrUnitarioPeca2 = sc.nextDouble();

		double total = numeroPecas1 * vlrUnitarioPeca1 + numeroPecas2 * vlrUnitarioPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
