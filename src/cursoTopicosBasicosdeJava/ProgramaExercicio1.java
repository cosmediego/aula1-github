package cursoTopicosBasicosdeJava; //pacote: agrupamento lógico

import java.util.Locale;
import java.util.Scanner;

public class ProgramaExercicio1 {

	
	 
	
	public static void main(String[] args) {// pelo menos uma classe deve ter esse método. ponto de uma entrada para um
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("Computer, which price is $%.2f%n", price1);
		System.out.printf("Office desk, hich price is $%.2f%n", price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println("");
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
