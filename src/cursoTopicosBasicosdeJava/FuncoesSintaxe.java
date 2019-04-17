package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class FuncoesSintaxe {
	/*
	 * � Representam um processamento que possui um significado �
	 * Math.sqrt(double)calcula raiz quadrada � System.out.println(string) �
	 * Principais vantagens: modulariza��o, delega��o e reaproveitamento � Dados de
	 * entrada e sa�da � Fun��es podem receber dados de entrada (par�metros ou
	 * argumentos) � Fun��es podem ou n�o retornar uma sa�da � Em orienta��o a
	 * objetos, fun��es em classes recebem o nome de"m�todos"
	 */

	public static void main(String[] args) {
		/*
		 * Scanner sc= new Scanner(System.in); double x = sc.nextDouble(); double y =
		 * Math.sqrt(x);//uma fun��o j� pront System.out.println(y);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();//F6 executa e n�o entra na funcao
		
		int higher = maiorNumero(num1, num2, num3);
		apresentaMaiorNumero(higher);
		sc.close();
	}

	public static int maiorNumero(int num1, int num2, int num3) {
		int aux;
		if (num1 > num2 && num1 > num3) {
			aux = num1;
		} else if (num2 > num1 && num2 > num3) {
			aux = num2;
		} else {
			aux = num3;
		}
		return aux;
	}
	
	public static void apresentaMaiorNumero(int value) {//VOID = n�o retorna valor, simplismente imprime valor na tela ou  faz uma A��O
		System.out.println("higher = "  + value);
	}
}
