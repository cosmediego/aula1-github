package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcion�rios ser�o registrados?");
		int qtdFuncionario = sc.nextInt();
		
		for(int i = 0; i<qtdFuncionario; i++) {
			System.out.println("Funcion�rio #" + i + ":");
			
		}
		
		
		sc.close();

	}

}
