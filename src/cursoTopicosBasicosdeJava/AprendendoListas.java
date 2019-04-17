package cursoTopicosBasicosdeJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AprendendoListas {
	/**
	 * vale dizer que as listas(List) não aceita tipos primitivos, o certo é usar a
	 * Wrapper classes do tipo primitivo lista é uma interface e para acessá-las é
	 * preciso usar uma de suas classes
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("kadu");
		list.add("beto");
		list.add("lia");
		list.add(2, "Marco");

		// list.remove(1);//tem capacidade de remover um dado a partir da comparação do
		// dado com outro da lista

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		
		list.removeIf(nomes ->nomes.charAt(0)== 'M');//UM TIPO DE EXPREÇÃO LAMBDA
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));//caso não encontre retorna -1
		
		/*Elemento da lista que começam com a letra A */
		System.out.println("-------------------------------");
		List<String> result = list.stream().filter(nomes ->nomes.charAt(0)== 'l').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		/**Elemento da lista que ATENDA UM CERTO PREDICADO.
		 * EX: PRIMEIRO ELEMENTO QUE COMECE COM A LETRA K
		 * */
		System.out.println("-------------------------------");
		String nome = list.stream().filter(nomes ->nomes.charAt(0)== 'J').findFirst().orElse(null);
		System.out.println(nome);
	
	}

}
