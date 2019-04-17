package cursoTopicosBasicosdeJava;

public class FuncoesInteressantesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();//minusculo
		String s02 = original.toUpperCase();//maisusculo
		String s03 = original.trim();//elimina espaços em branco
		String s04 = original.substring(2);//monta um substring a partir 2 em diante(começa a contar DO ZERO)
		String s05 = original.substring(2, 9);//monta um substring  a partir 2 em diante(começa a DO ZERO)
		String s06 = original.replace('a', 'x');//troca o primeiro argumento pelo segundo CARACTER
		String s07 = original.replace("abc", "xy");//troca o primeiro argumento pelo segundo SUBSTRING
		int i = original.indexOf("bc");//PRIMEIRA POSIÇÃO DO SUBSTRING "bc"
		int j = original.lastIndexOf("bc");//ÚLTIMA POSIÇÃO DO SUBSTRING "bc"
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
