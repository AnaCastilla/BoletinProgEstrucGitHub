package ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {

		/*
		 *  3.Realiza un programa que lea tres números positivos y compruebe si son iguales. Por ejemplo:
			  Si la entrada fuese 5 5 5, la salida debería ser “hay tres números iguales a 5”. Si la entrada
			  fuese 4 6 4, la salida debería ser “hay dos números iguales a 4”. Si la entrada fuese 0 1 2, la
			  salida debería ser “no hay números iguales”.
		 */
		
		int n1, n2, n3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce n1: ");
		n1 = keyboard.nextInt();
		System.out.println("Introduce n2: ");
		n2 = keyboard.nextInt();
		System.out.println("Introduce n3: ");
		n3 = keyboard.nextInt();
		
		keyboard.close();
		
		if (n1 < 0 || n2 < 0 || n3 < 0) {
			System.out.println("ERROR! Todos los números deben ser positivos");
		} else if (n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("hay tres números iguales a " + n1);
		} else if (n1 == n2 || n1 == n3 || n2 == n3) {
			if (n2 == n3) {
				System.out.println("hay dos números iguales a " + n2);
			} else {
			System.out.println("hay dos números iguales a " + n1);
			}
		} else if (n1 != n2 && n1 != n3 && n2 != n3) {
			System.out.println("no hay números iguales");
		}
	}

}
