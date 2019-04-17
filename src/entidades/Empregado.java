package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public double aumentoSalario(double percente) {
		double salarioAjustado = (salarioBruto * (percente/100 + 1)) - imposto;
		return salarioAjustado;
	}

}
