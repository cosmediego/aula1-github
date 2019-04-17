package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ProgramaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Entre com o nome do titular: ");
		
		String nomeTitular = sc.nextLine();
		nomeTitular = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial(s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Entre com deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, depositoInicial);
				
		}else {
			conta = new Conta(numConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println();
		System.out.println("Entre com valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.depositoEmConta(deposito);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		
		
		System.out.println("Entre com valor do saque: ");
		double saque = sc.nextDouble();
		conta.saqueEmConta(saque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}
