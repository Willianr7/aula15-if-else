package aula15;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		double numeroUm = scan.nextDouble();
		System.out.println("Insira o segundo numero: ");
		double numeroDois = scan.nextDouble();
		System.out.println("Insira o Terceiro numero: ");
		double numeroTres = scan.nextDouble();
		
		if (numeroUm >= numeroDois && numeroUm >= numeroTres) {
			System.out.println("O primeiro numero e o maior!" + numeroUm);
		} else if (numeroDois >= numeroUm && numeroDois >= numeroTres) {
			System.out.println("O segundo numero e o maior! " + numeroDois);
		}else if (numeroTres >= numeroUm && numeroTres >= numeroDois){
			System.out.println("O terceiro numero e o maior! " + numeroTres);
		} 
		
		 if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
			System.out.println("O primeiro numero e o menor! " + numeroUm);
		} else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
			System.out.println("O segundo numero e o menor! " + numeroDois);
		} else if (numeroTres <= numeroUm && numeroTres <= numeroDois) {
			System.out.println("O terceiro numero e o menor!"+ numeroTres);
		}
		
		scan.close();
	}

}
