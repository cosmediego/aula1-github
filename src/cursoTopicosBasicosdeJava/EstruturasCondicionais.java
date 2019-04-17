package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas horas são?");

		// int num1 = sc.nextInt();

		// if(num1 % 2 == 0) {
		// System.out.println("Par!");
		// } else {
		// System.out.println("Impar!");
		// }
		int time = sc.nextInt();

		if (time < 12) {
			System.out.println("Bom dia!!!");
		} else if (time <= 12 || time < 18) {
			System.out.println("Boa tarde!!");
		} else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}

}
