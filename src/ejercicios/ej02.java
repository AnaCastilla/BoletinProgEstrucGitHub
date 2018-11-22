package ejercicios;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {

		/*
		 *  2.Pedir dos números por teclado e indicar si el primero es múltiplo del segundo.
			Nota: un número x es múltiplo de y, si al dividir x entre y, el resto es 0. 
		 */
		
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce n1: ");
		n1 = keyboard.nextInt();
		System.out.println("Introduce n2: ");
		n2 = keyboard.nextInt();
		
		keyboard.close();
		
		if (n1 % n2 == 0) {
			System.out.println(n1 + " es múltiplo de " + n2);
		} else {
			System.out.println(n1 + " no es múltiplo de " + n2);
		}
	}

}
