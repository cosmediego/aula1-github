package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class ExercicioDeFixacaoWhileFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero positivo correspondente a "
				+ "quantidade de n�meros que ser�o testados:");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.println(" O num�ro deve ser positivo tente novamente: ");
			num = sc.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			int valor3 = sc.nextInt();
			int valor4 = sc.nextInt();

			if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
				System.out.println("O maioo n�mero � = " + valor1);
				
			} else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
				System.out.println("O maioo n�mero � o" + valor2);
				
			} else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
				System.out.println("O maioo n�mero � o" + valor3);
				
			} else {
				System.out.println("O maioo n�mero � o" + valor4);
			}
		}

		sc.close();

	}

}
