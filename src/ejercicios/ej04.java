package ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {

		/*
		 * 4.Realiza un programa que calcule el precio de un billete de ida y vuelta por avión, conociendo
    		 la distancia a recorrer, el número de días de estancia y sabiendo que si la distancia es
			 superior a 1.000 Km y el número de días de estancia es superior a 7, la línea aérea le hace un
			 descuento del 30 %. (Precio por kilómetro = 0,35 €).
		 */
		
		double ticket, distance;
		int daysEstance;
		final double DISCOUNT = 0.30, PRICEPERKM = 0.35;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce la distancia recorrida: ");
		distance = keyboard.nextDouble();
		System.out.println("Introduce el número de días de estancia: ");
		daysEstance = keyboard.nextInt();
		
		keyboard.close();
		
		if (distance > 1000 && daysEstance > 7) {
			ticket = (distance * PRICEPERKM) * DISCOUNT;
			System.out.printf("El billete tendrá un precio de %.2f € con descuento ", ticket);
		} else {
			ticket = distance * PRICEPERKM;
			System.out.printf("El billete tendrá un precio de %.2f €", ticket);
		}
	}

}
