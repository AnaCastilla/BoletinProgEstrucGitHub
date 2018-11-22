package ejercicios;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {

		//6.Realiza un programa que dados tres números, los devuelva en orden ascendente
		
		int n1, n2, n3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce 3 números: ");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		keyboard.close();
		
		//n3 < n2 < n1
		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n3 + " " + n2 + " " + n1);
		//n2 < n3 < n1
		} else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println(n2 + " " + n3 + " " + n1);
		// n3 < n1 < n2
		} else if (n2 > n1 && n2 > n1 && n1 > n3) {
			System.out.println(n3 + " " + n1 + " " + n2);
		//n1 < n3 < n2
		} else if (n2 > n1 && n2 > n3 ) {
			System.out.println(n1 + " " + n3 + " " + n2);
		//n1 < n2 < n3
		}  else if (n3 > n2 && n3 > n1 && n2 > n1) {
			System.out.println(n1 + " " + n2 + " " + n3);
		// n2 < n1 < n3
		} else if (n3 > n2 && n3 > n1 && n1 > n2) {
			System.out.println(n2 + " " + n1 + " " + n3);
		} else {
			System.out.println("ERROR");
		}
	}

}
