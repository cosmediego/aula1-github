package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio4ParaIniciante5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int fat = 1;

		for (int i = 1; i <= num; i++) {
			fat = fat * 1;
		}
		System.out.println(fat);
		sc.close();

	}

}
