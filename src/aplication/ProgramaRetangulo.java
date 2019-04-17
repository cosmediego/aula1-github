package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Retangulo rect;
		rect = new Retangulo();
		
		
		
		System.out.println("Digite a Altura e a Largura do retangulo: ");
		rect.altura = sc.nextDouble(); 
		rect.largura = sc.nextDouble();
		
		double area = rect.area();
		System.out.printf("AREA = %.2f%n", area);
		
		double perimetro = rect.perimetro();
		System.out.printf("PERÍMETRO = %.2f%n", perimetro);
		
		double diagonal = rect.diagonal();
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		sc.close();
		}
	

}
