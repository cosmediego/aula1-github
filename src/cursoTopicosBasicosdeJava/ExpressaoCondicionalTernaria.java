package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	/**
	 * Estrutura opcional ao 
	 * if-else quando se deseja decidir um 
	 * VALOR com base em uma condição.
	 * 
	 */

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}

}
