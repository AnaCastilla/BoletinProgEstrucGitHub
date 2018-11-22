package ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {

		/*
		 *  1.Hacer un programa que lea por teclado un número entero y nos diga si el número es positivo,
			  negativo o cero. 
		 */
		
		int number;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");
		number = keyboard.nextInt();
		
		keyboard.close();

		if (number == 0) {
			System.out.println("Número 0");
		} else if (number < 0) {
			System.out.println(number + " es un número negativo");
		} else if (number > 0) {
			System.out.println(number + " es un número positivo");
		}
	}
}
