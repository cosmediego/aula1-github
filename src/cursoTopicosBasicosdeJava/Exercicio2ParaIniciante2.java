package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio2ParaIniciante2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}
