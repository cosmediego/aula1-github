package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio4ParaIniciante2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in ++;
			} else {
				out ++;
			}

		}
		System.out.println(in + "in");
		System.out.println(out + "out");
		sc.close();

	}

}
