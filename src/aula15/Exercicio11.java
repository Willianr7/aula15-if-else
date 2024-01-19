package aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o seu salario: ");
		double salarioInserido = scan.nextDouble();
		double aumentoRecebido = 0;
		
				
		
		if (salarioInserido <= 280) {
			System.out.println("O reajuste sera de 20%! ");
			aumentoRecebido = (salarioInserido / 100) * 0.2;
		}else if (salarioInserido > 280 && salarioInserido <= 700) {
			System.out.println("O reajuste sera de 15%! ");
			aumentoRecebido = (salarioInserido / 100) * 0.15;
		}else if (salarioInserido > 700 && salarioInserido <= 1500) {
			System.out.println("O reajuste sera de 10%");
			aumentoRecebido = (salarioInserido / 100) * 0.10;
		}else if (salarioInserido > 1500) {
			System.out.println("O reajuste sera de 5%");
			aumentoRecebido = (salarioInserido / 100) * 0.5;
		}
		double reajuste = salarioInserido + aumentoRecebido;
		System.out.println("Salario Total: " + reajuste);
		System.out.println("O seu salario antes do reajuste: " + salarioInserido);	
		System.out.println("Voce ira receber de aumento total: " + aumentoRecebido);
		
		
	}

}
