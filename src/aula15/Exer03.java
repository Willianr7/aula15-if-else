package aula15;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Informe o sexo: M/F");
	        char sexo = sc.next().charAt(0);

	        switch (sexo) {
	            case 'm':
	                System.out.println("Sexo masculino");
	                break;
	            case 'M':
	                System.out.println("Sexo masculino");
	                break;
	            case 'f':
	                System.out.println("Sexo feminino");
	                break;
	            case 'F':
	                System.out.println("Sexo feminino");
	                break;

	            default:
	                System.out.println("Sexo Inválido");
	                break;
	        }

	        sc.close();
	}
     
}
