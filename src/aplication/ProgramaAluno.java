package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();

		System.out.println("Digite as notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		if (aluno.nota1 > 30) {
			System.out.println("A nota do primeiro trimestre é no máximo 30 digite esta nota novamente.");
			aluno.nota1 = sc.nextDouble();
		} else if (aluno.nota3 > 35) {
			System.out.println("A nota do segunda trimestre é no máximo 35, digite esta nota novamente.");
			aluno.nota2 = sc.nextDouble();
		} else if (aluno.nota3 > 35) {
			System.out.println("A nota do segunda trimestre é no máximo 35, digite esta nota novamente.");
			aluno.nota3 = sc.nextDouble();
		}
		double notafinal = aluno.notaFinal();
		double quantoFaltou = aluno.quantoFaltou();

		if (notafinal > 60.00) {
			System.out.printf("NOTA FINAL = %.2f %nAPROVADO ", notafinal);
		} else {
			System.out.printf("NOTA FINAL = %.2f %nREPROVADO%n FALTOU %.2f PONTOS ", notafinal, quantoFaltou);
			
		}
		System.out.println("Bom dia");

		sc.close();
	}
}
