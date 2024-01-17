package aula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		double numeroUm = scan.nextDouble();
		System.out.println("Insira o segundo numero: ");
		double numeroDois = scan.nextDouble();
		System.out.println("Insira o Terceiro numero: ");
		double numeroTres = scan.nextDouble();
		
		if (numeroUm >= numeroDois && numeroUm >= numeroTres) {
			System.out.println("O primeiro numero e o maior entre os numeros inseridos." + numeroUm);
		} else if (numeroDois >= numeroUm && numeroDois >= numeroTres) {
			System.out.println("O segundo numero e o maior entre os numeros inseridos. " + numeroDois);
		}else if (numeroTres >= numeroUm && numeroTres >= numeroDois){
			System.out.println("O terceiro numero e o maior entre os numeros inseridos. " + numeroTres);
		}
		
		scan.close();
		
		
	}

}
