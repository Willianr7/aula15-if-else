package aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira a primeira nota do semestre: ");
		double notaUm = scan.nextDouble();
		
		System.out.println("Insira a segunda nota do semestre: ");
		double notaDois = scan.nextDouble();
		
		double media = (notaUm + notaDois / 2);
		
		if (notaUm >= 9 && notaUm <= 10 && notaDois >= 9 && notaDois <= 10 ) {
			System.out.println("APROVADO! Conceito A " + " A sua média foi de: " + media);
		} else if (notaUm >= 7.5 && notaUm <= 9 && notaDois >= 7.5 && notaDois <= 9) {
			System.out.println("APROVADO! Conceito B " + " A sua média foi de: " + media);
		} else if (notaUm >= 6 && notaUm <= 7.5 && notaDois >= 6 && notaDois <= 7.5) {
			System.out.println("APROVADO! Conceito C " + " A sua média foi de: " + media);
		} else if (notaUm >= 4 && notaUm <= 6 && notaDois >= 4 && notaDois <= 6) {
			System.out.println("REPROVADO! Conceito D " + " A sua média foi de: " + media);
		} else if (notaUm >= 4 || notaUm == 0 && notaDois >= 4 || notaDois == 0) {
			System.out.println("REPROVADO! Conceito E " + " A sua média foi de: " + media);
		}

	}

}
