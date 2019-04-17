package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class AprendendoSwitchCase {
	/**
	 * Estrutura opcional a vários if-else encadeados, quando a condição envolve o
	 * teste do valor de uma variável.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
		}
		System.out.println("Day: " + day);
	}

}
