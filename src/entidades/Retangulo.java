package entidades;

public class Retangulo {
	public double largura;
	public double altura;

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return altura * 2 + largura * 2;
	}

	public double diagonal() {
		double diagonal = (altura * altura) + (largura * largura);
		return Math.sqrt(diagonal);
	}
}
