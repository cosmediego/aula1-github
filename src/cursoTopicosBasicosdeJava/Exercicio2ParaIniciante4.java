package cursoTopicosBasicosdeJava;

import java.util.Scanner;

public class Exercicio2ParaIniciante4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();	
		int horasDia = 24;
		int horasJogadas;
		
		if(horaInicial < horaFinal) {
			horasJogadas = horaFinal - horaInicial;
		} else {
			horasJogadas = horasDia - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + horasJogadas + " HORA(S)");
		
		sc.close();

	}

}
