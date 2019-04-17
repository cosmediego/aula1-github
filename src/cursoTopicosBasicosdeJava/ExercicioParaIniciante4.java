package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioParaIniciante4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		
		
		System.out.println("NUNBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		

	}

}
