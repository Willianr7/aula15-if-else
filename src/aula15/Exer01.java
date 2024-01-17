package aula15;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Insira o primeiro numero para calcular o maior: ");
		 int number1 = scan.nextInt();
		 
		 System.out.println("Insira o segundo numero para calcular o maior: ");
		 int number2 = scan.nextInt();
		 
		 if (number1 > number2) {
			 System.out.println("O maior numero informado foi: " + number1);
		 } else {
			 System.out.println("O maior numero informado foi: " + number2);
		 }
		 
		 
		 scan.close();
	}

}
