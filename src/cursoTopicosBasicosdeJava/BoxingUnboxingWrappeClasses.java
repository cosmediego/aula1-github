package cursoTopicosBasicosdeJava;

public class BoxingUnboxingWrappeClasses {

	public static void main(String[] args) {
		/*
		 * É o processo de conversão de um objeto 
		 * tipo valor para um objetobtipo referência
		 * compatível
		 * */
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		/*
		 * É o processo de conversão de um objeto tipo
		 * referência para um objeto tipo 
		 * valor compatível
		 * */
		int y = (int) obj;
		System.out.println(y);
		
		/**Wrapper classes
		• São classes equivalentes aos tipos primitivos
		• Boxing e unboxing é natural na linguagem
		*/
		int z = 20;
		Integer obj1 = z;
		System.out.println(obj1);
	}

}
