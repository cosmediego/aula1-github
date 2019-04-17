package cursoTopicosBasicosdeJava; //pacote: agrupamento lógico

import java.util.Locale;
import java.util.Scanner;

public class ProgramaExercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String nomeTodo = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		int qtdQuartos = sc.nextInt();
		
		System.out.println("Enter product price:");
		double valorDoProduto = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		String sobrenome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		
		
		System.out.println(nomeTodo);
		System.out.println(qtdQuartos);
		System.out.printf("%.2f%n", valorDoProduto);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.printf("%.2f%n",altura);
		
		sc.close();

	}
}
