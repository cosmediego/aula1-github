package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio3ParaIniciante4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (num <= 100) {
			if (num % 2 != 0) {
				System.out.println(num);
				
			}
			num++;

		}

		sc.close();

	}

}
