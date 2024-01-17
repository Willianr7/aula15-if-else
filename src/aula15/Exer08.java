package aula15;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro preco para indicar o mais barato: ");
		double precoUm = scan.nextDouble();
		System.out.println("Insira o segundo preco para indicar o mais barato: ");
		double precoDois = scan.nextDouble();
		System.out.println("Insira o terceiro preco para indicar o mais barato: ");
		double precoTres = scan.nextDouble();
		
		if (precoUm <= precoDois && precoUm <= precoTres) {
			System.out.println("Voce deve comprar o produto numero 1! ");
		}else if (precoDois <= precoUm && precoDois <= precoTres) {
			System.out.println("Voce deve comprar o produto numero 2! ");
		}else if (precoTres <= precoUm && precoTres <= precoDois) {
			System.out.println("Voce deve comprar o produto de numero 3!");
		}

	}

}
