package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio3ParaIniciante3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tpConbustivel = sc.nextInt();

		while (tpConbustivel != 4) {
			if (tpConbustivel == 1) {
				alcool++;
			} else if (tpConbustivel == 2) {
				gasolina++;
			} else if (tpConbustivel == 3) {
				diesel++;
			} else if (tpConbustivel == 4) {

			}
			tpConbustivel = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool:%d%nGasolina:%d%nDiesel:%d%n", alcool, gasolina, diesel);

		sc.close();

	}

}
