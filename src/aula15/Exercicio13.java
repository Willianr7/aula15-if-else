package aula15;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um numero: ");
		double numeroInserido = scan.nextDouble();
		
		if (numeroInserido == 1) {
			System.out.println("Domingo");
		}else if(numeroInserido == 2) {
			System.out.println("Segunda");
		}else if(numeroInserido == 3) {
			System.out.println("Terca");
		}else if(numeroInserido == 4) {
			System.out.println("Quarta");
		}else if(numeroInserido == 5) {
			System.out.println("Quinta");
		}else if(numeroInserido == 6) {
			System.out.println("Sexta");
		}else if(numeroInserido == 7) {
			System.out.println("Sabado");
		}else {
			System.out.println("Valor invalido!");
		}
		
		
	}

}
