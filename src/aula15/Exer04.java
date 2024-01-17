package aula15;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira uma letra para verificar se e vogal ou consoante: ");
		char letraInserida = scan.next().charAt(0);
		
		if (letraInserida == 'a') {
			System.out.println("a letra inserida e uma vogal");
		} else if (letraInserida == 'e') {
			System.out.println("a letra inserida e uma vogal");
		} else if (letraInserida == 'i') {
			System.out.println("a letra inserida e uma vogal");
		}else if (letraInserida == 'o') {
			System.out.println("a letra inserida e uma vogal");
		}else if (letraInserida == 'u') {
			System.out.println("a letra inserida e uma vogal");
		}else {
			System.out.println("a letra inserida e uma consoante");
		}
		 scan.close();
		}
	}


