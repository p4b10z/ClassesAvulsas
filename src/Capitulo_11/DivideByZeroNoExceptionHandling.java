package Capitulo_11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
	public static int quotient(int numerador, int denominador)
	     throws ArithmeticException 
	{
		return numerador/ denominador ; 
	}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		boolean continueLopp = true ; //determina se são necessarias mais entradas
		
		do {
			try {//lê os dois numeros e calcula o quociente
				System.out.println("adicione o primeiro numero");
				int numerador = input.nextInt();
				System.out.println("adicione o segundo numero");
				int denominador = input.nextInt();
				
				int result = quotient(numerador, denominador);
				System.out.printf("%n%d/%d = %d", numerador, denominador, result);
				continueLopp = false ; 	
				
			}catch (InputMismatchException inputMIssMachExcepition) {
			//faz a analise para que exista uma entrada de um valor invalido 
			System.out.printf("%nexeption: %s%n", 
					inputMIssMachExcepition);
			input.nextLine(); // para descartar a proxima linha 
			System.out.println("caracteres invalidos por favor tente novamente");
			}
			catch(ArithmeticException aritimeticalEeption) {
				System.out.printf("%nException : %s%n", aritimeticalEeption);
				input.nextLine(); // para descartar a proxima linha novamente 
				System.out.println("zero é um numero invalido, por favor tente novamente");
			}
		}
		while(continueLopp);
		
	}
}
