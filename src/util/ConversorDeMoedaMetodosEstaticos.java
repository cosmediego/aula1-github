package util;

public class ConversorDeMoedaMetodosEstaticos {
	public static  double preco;
	public static  double quantidade;
	
	public static double quantidadeDolaresComprados() {
		return quantidade;
	}

	public static double valorPagar() {
		return preco * quantidade *1.06;
	}
}
