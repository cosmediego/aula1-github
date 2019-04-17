package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class ExercicioParaIniciante3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int diferencaProdutos = a * b - c * d;

		System.out.println("DIFERENÇA = " + diferencaProdutos);
		sc.close();
	}

}
