package aula15;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Em qual turno voce estuda? Insira 'M' para matutino, 'V' para vespertino ou 'N' para Noturno.");
		char turnoInserido = scan.next().charAt(0);
		
		if (turnoInserido == 'm' || turnoInserido == 'M') {
			System.out.println("Bom dia! ");
		}else if (turnoInserido == 'V' || turnoInserido == 'v') {
			System.out.println("Boa Tarde!");
		}else if (turnoInserido == 'N' || turnoInserido == 'n') {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("O turno inserido e invalido, por favor tente novamente! ");
		}
		
		
		

	}

}
