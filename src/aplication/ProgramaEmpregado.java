package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class ProgramaEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		
		System.out.println("Digite o nome do empregado: ");
		emp.nome = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto descontado: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println("Empregado: " + emp.nome + ", " + "$ " + emp.salarioLiquido() + "\n");
		System.out.println("Qual o percentual de aumento do salário: ");

		double percentage = sc.nextDouble();
		percentage = emp.aumentoSalario(percentage);
		
		
		System.out.printf("Dados do empregado atualizados: %s, $ %.2f", emp.nome, percentage);
		
		sc.close();

	}

}
