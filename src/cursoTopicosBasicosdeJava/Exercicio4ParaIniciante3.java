package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4ParaIniciante3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			
			double vlrReal = sc.nextDouble();
			double vlrRea2 = sc.nextDouble();
			double vlrRea3 = sc.nextDouble();

			double media1 = (vlrReal*2.0 + vlrRea2*3.0 + vlrRea3*5.0) / 10;
			System.out.printf("%.1f%n ", media1);

		}

		sc.close();

	}

}
