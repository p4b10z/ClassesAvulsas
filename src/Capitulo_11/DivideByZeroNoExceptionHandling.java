package Capitulo_11;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

	public static int quotient(int numerador, int denominador) {
		return numerador/ denominador ; 
	}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("entre com o numerador ");
	    int numerador = input.nextInt();
	    		
	    System.out.println("entre com o denominador");
	    int denominador = input.nextInt();
	    
	    int resultado = quotient(numerador, denominador);
	    
	    System.out.printf("%nO Resultado é : %d /%d = %d%n", numerador, denominador, resultado);
	}
}
