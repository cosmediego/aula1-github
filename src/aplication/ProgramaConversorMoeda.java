package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoedaMetodosEstaticos;

public class ProgramaConversorMoeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o pre�o do dolar?");
		ConversorDeMoedaMetodosEstaticos.preco = sc.nextDouble();

		System.out.println("Quantos d�lares ser�o comprados?");
		ConversorDeMoedaMetodosEstaticos.quantidade = sc.nextDouble();

		System.out.printf("Valor a ser pago em reais: %.2f", ConversorDeMoedaMetodosEstaticos.valorPagar());

		sc.close();
	}

}
