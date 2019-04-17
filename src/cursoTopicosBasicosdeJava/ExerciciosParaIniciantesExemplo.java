package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosParaIniciantesExemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorDoMetroQuadrado = sc.nextDouble();
		
	//	System.out.println("Qual a largura do terreno?");
		double largura = sc.nextDouble();

	//	System.out.println("Qual comprimento do terreno?");
		double comprimento = sc.nextDouble();
		
		
		double areaDoTerreno = largura * comprimento;
		double preco = valorDoMetroQuadrado * areaDoTerreno;
		
		System.out.printf("AREA = %.2f%n", areaDoTerreno);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();
	
	}

}
