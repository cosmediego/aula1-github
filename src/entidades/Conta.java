package entidades;

public class Conta {
	 private int numConta;
	 private String nomeTitular;
	 private double saldo;
	
	 
	 public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}


	public Conta(int numConta, String nomeTitular, double depositoInicial) {

		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositoEmConta(depositoInicial);
	}
	
	public void depositoEmConta(double depositoInicial) {
		saldo += depositoInicial;
		
	}
	
	public void saqueEmConta(double saque) {
		saldo -= saque + 5.0;
	}
	
	public double extratoConta() {
		return saldo;
	}
	
	public String toString() {
		return "Conta "
				+ numConta
				+", Nome do titular: "
				+ nomeTitular
				+ String.format(", Extrato: $ %.2f ", extratoConta());
				
	}


	public int getNumConta() {
		return numConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	 
	 
	 

}
