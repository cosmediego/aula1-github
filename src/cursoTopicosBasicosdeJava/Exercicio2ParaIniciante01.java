package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio2ParaIniciante01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num1 = sc.nextInt();
		
		
		if(num1 < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		
		sc.close();

	}

}
