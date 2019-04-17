package cursoTopicosBasicosdeJava;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoVetores;

/**
 * vetores com objetos 
 * tipos referência (classes)
 * */
public class VetoresExercicioExemplo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int num = sc.nextInt();
		 ProdutoVetores[] vect = new ProdutoVetores[num];
		 
		 for(int i = 0; i<vect.length; i++) {//length retorna o tamanho do vetor e trabalha de forma +coesa. Contudo posso colocar "num" tbm
			 sc.nextLine();//esse nextline é pra consumir a quebra de linha do nextint
			 String nome = sc.nextLine();
			 double preco = sc.nextDouble();
			 vect[i] = new ProdutoVetores(nome, preco);
		 }
		 
		 double soma = 0;
		 for(int i = 0; i<num; i++) {
			 soma += vect[i].getPreco();
		 }
		 
		 double media = soma / num;
		 
		 System.out.printf("A média de preços = %.2f%n", media);
		
		sc.close();

	}

}
