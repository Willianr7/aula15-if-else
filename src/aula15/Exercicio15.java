package aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o primeiro lado do triangulo: ");
		double ladoA = scan.nextDouble();
		
		System.out.println("Insira o segundo lado do triangulo: ");
		double ladoB = scan.nextDouble();
		
		System.out.println("Insira o terceiro lado do triangulo: ");
		double ladoC = scan.nextDouble();
		
		double somaTriangulo;
		
		
		if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoA && ladoB == ladoC && ladoC == ladoA && ladoC == ladoB) {
			System.out.println("Triangulo Equilatero!");
		}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoA || ladoB == ladoC || ladoC == ladoA || ladoC == ladoB) {
			System.out.println("Triangulo Isosceles! ");
		}else if(ladoA != ladoB || ladoA != ladoC || ladoB != ladoA || ladoB != ladoC || ladoC != ladoA || ladoC != ladoB) {
			System.out.println("Triangulo Escaleno!");
		}else if (ladoA > ladoC || ladoB > ladoC) {
			System.out.println("Triangulo!");
		}
		
		
	}

}
