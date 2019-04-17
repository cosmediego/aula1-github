package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class VetoresExercicioFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Aluguel[] vect = new Aluguel[10];
		
		
		System.out.println("Quantos quartos serão alugados?");
		int num = sc.nextInt();
		
		
		for(int i = 1; i<num; i++) {
			System.out.println("Rent #" + i + ":");
			sc.nextLine();//consome a quebra de linha do nextint
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Nº do quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Aluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados são:");
		
		for(int i = 0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ", " + vect[i]);
				
			}
			
		}
		
		
		sc.close();


	}

}
