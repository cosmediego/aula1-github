package cursoTopicosBasicosdeJava;

public class AprendendoForEach {

	/*Sintaxe opcional e simplificada para percorrer coleções
	 * for (Tipo apelido : coleção) {
	 * 	<comando 1>
	 * <comando 2>
		}*/
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("______________________________");
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
