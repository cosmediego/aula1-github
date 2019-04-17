package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		
		
		System.out.println("Insira os dados do Produto.");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco =  sc.nextDouble();
		Produto produto = new Produto(nome, preco);//ISSO É um construtor
		
		produto.setNome(" Computador");
		System.out.println("Nome atualizado" + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Atualizar preço" + produto.getPreco());
		
		System.out.println();
		System.out.println("Informação do produto" + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
		int qtdEstoque = sc.nextInt();
		produto.adicionaProduto(qtdEstoque);
		
		System.out.println();
		System.out.println("Produto atualizado" + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser remover no estoque: ");
		qtdEstoque = sc.nextInt();
		produto.removerProduto(qtdEstoque);
		
		System.out.println();
		System.out.println("Produto atualizado" + produto);
		
		sc.close();

	}

}
