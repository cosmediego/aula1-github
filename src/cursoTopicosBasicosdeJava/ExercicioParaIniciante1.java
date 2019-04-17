package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class ExercicioParaIniciante1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr1 = sc.nextInt();
		int vlr2 = sc.nextInt();
		int soma = vlr1 + vlr2;
		
		System.out.println("SOMA = " + soma );
		sc.close();
	}

}
