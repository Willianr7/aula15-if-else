package aula15;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Insira a primeira nota parcial: ");
		 double notaUm = scan.nextDouble();
				 
		 System.out.println("Insira a segunda nota parcial: ");
		 double notaDois = scan.nextDouble();
		 
		 double mediaParcial = notaUm + notaDois / 2;
		 
		 if (mediaParcial >= 7) {
			 System.out.println("A media alcancada e maior ou igual a sete. Parabens, Aprovado! ");
		 } else if (mediaParcial <=7) {
			 System.out.println("A media alcancada e menor do que sete. Reprovado ");
		 }else if (mediaParcial >= 10) {
			 System.out.println("Parabens! Aprovado com Distincao! ");
		 }

	}

}
