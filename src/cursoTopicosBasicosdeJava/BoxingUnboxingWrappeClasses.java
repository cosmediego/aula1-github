package cursoTopicosBasicosdeJava;

public class BoxingUnboxingWrappeClasses {

	public static void main(String[] args) {
		/*
		 * � o processo de convers�o de um objeto 
		 * tipo valor para um objetobtipo refer�ncia
		 * compat�vel
		 * */
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		/*
		 * � o processo de convers�o de um objeto tipo
		 * refer�ncia para um objeto tipo 
		 * valor compat�vel
		 * */
		int y = (int) obj;
		System.out.println(y);
		
		/**Wrapper classes
		� S�o classes equivalentes aos tipos primitivos
		� Boxing e unboxing � natural na linguagem
		*/
		int z = 20;
		Integer obj1 = z;
		System.out.println(obj1);
	}

}
