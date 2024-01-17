package aula15;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero para ser lido de forma decrescente: ");
		double numberUm = scan.nextDouble();
		System.out.println("Insira o segundo numero para ser lido de forma decrescente: ");
		double numberDois = scan.nextDouble();
		System.out.println("Insira o terceiro numero para ser lido de forma decrescente: ");
		double numberTres = scan.nextDouble();
		
		if (numberUm <= numberDois && numberUm <= numberTres && numberDois <= numberTres) {
			System.out.println("A sequencia decrescente e:" + numberTres);
			System.out.println("A sequencia decrescente e:"+numberDois);
			System.out.println("A sequencia decrescente e:"+numberUm);
		} else if (numberDois <= numberUm && numberDois <= numberTres) {
			System.out.println("A sequencia decrescente e:" +numberTres);
			System.out.println("A sequencia decrescente e:"+numberDois);
			System.out.println("A sequencia decrescente e:"+numberUm);
		}else if (numberTres <= numberUm && numberTres <= numberDois) {
			System.out.println("A sequencia decrescente e:"+numberTres);
			System.out.println("A sequencia decrescente e:"+numberDois);
			System.out.println("A sequencia decrescente e:"+numberUm);
		}
	}

}
