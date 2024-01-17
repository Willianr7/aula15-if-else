package aula15;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Insira um valor para verificar se e positivo ou negativo: ");
		 int numeroPositivoNegativo = scan.nextInt();
		 
		 
		 if (numeroPositivoNegativo >= 0) {
			 System.out.println("Parabens, o numero informado e positivo! " + numeroPositivoNegativo);
		 } else if (numeroPositivoNegativo <=0) {
			 System.out.println("Parabens, o numero informado e negativo! " + numeroPositivoNegativo);
		 } else {
			 System.out.println("O numero informado nao e positivo nem negativo! ");
		 }
		  
		 
		 scan.close();
	}

}
