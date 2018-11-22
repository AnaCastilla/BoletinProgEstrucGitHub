package ejercicios;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {

		/*
		 * 5.Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno. Se desea calcular el
			 jornal diario de acuerdo con los siguientes tarifas: la tarifa de las horas diurnas es de 3 € por
			 hora, mientras que el de las nocturnas es de 4,80 € por hora. Cuando se trata de un día
			 festivo, la tarifa se incrementa en 1,20 € por hora en el turno diurno y 1,80 € por hora en el
			 nocturno.
		 */
		
		double dailyPay;
		int hours, selection;
		boolean isFestive;
		final int DAYHOURS = 3;
		final double NIGHTHOURS = 4.80, DAYHOURSFESTIVE = (3+1.20), NIGHTHOURSFESTIVE = (4.80+1.80);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("¿En qué turno trabaja el empleado? \n1. Diurno\n2. Nocturno");
		selection = keyboard.nextInt();
		System.out.println("¿Cuántas horas?");
		hours = keyboard.nextInt();
		System.out.println("¿Es festivo? true/false");
		isFestive = keyboard.nextBoolean();
		
		keyboard.close();
		
		if (selection == 1 && !isFestive) {
			dailyPay = hours * DAYHOURS;
			System.out.printf("El jornal diario diurno sin ser festivo es de %.2f €", dailyPay);
		} else if (selection == 1 && isFestive) {
			dailyPay = hours * DAYHOURSFESTIVE;
			System.out.printf("El jornal diario diurno siendo festivo es de %.2f €", dailyPay);
		} else if (selection == 2 && !isFestive) {
			dailyPay = hours * NIGHTHOURS;
			System.out.printf("El jornal diario nocturno sin ser festivo es de %.2f €", dailyPay);
		} else if (selection == 2 && isFestive) {
			dailyPay = hours * NIGHTHOURSFESTIVE;
			System.out.printf("El jornal diario nocturno siendo festivo es de %.2f €", dailyPay);
		} else {
			System.out.println("error al introducir los datos");
		}
		
	}

}
