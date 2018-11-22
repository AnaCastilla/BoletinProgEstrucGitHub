package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {

		/*
		 * 7.Dada una cadena solicitada al usuario, obtener y mostrar uno de sus caracteres elegidos
			 aleatoriamente. Mostrar también en qué posición se encuentra dicho carácter
		 */
		
		String string;
		int charPosition;
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Introduce una cadena: ");
		string = keyboard.nextLine();
		keyboard.close();
		
		charPosition = rnd.nextInt(string.length());
		
		System.out.println("Carácter elegido aleatoriamente: " + string.charAt(charPosition));
		System.out.println("Posición de dicho carácter: " + (charPosition+1));
	}

}
