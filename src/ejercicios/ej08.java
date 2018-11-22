package ejercicios;

import java.util.Random;

public class ej08 {

	public static void main(String[] args) {

		/*
		 * 8.Realiza un programa que saque una carta aleatoria de una baraja con 4 palos y 13 cartas por cada
			 palo. Los palos son Picas ♠, Corazones ♥, Diamantes ♦ y Tréboles ♣. Las 13 cartas por cada
			 palo irán del as al diez y además tres figuras: jota, reina y rey. Mostrar la carta incluyendo el
			 símbolo del palo(♠,♥,♦,♣).
		 */
		
		int card, pale;
		final String ROJO = "\u001B[31m";
		final String RESET = "\u001B[0m";
		
		Random rnd = new Random();
		
		pale = rnd.nextInt(4) + 1;
		card = rnd.nextInt(13) + 1;
		
		//Podria hacerse también con else if
		switch (card) {
		case 1:
			System.out.print("As de ");
			break;
		case 2: 
			System.out.print("2 de ");
			break;
		case 3:
			System.out.print("3 de ");
			break;
		case 4:
			System.out.print("4 de ");
			break;
		case 5:
			System.out.print("5 de ");
			break;
		case 6:
			System.out.print("6 de ");
			break;
		case 7: 
			System.out.print("7 de ");
			break;
		case 8:
			System.out.print("8 de ");
			break;
		case 9:
			System.out.print("9 de ");
			break;
		case 10: 
			System.out.print("10 de ");
			break;
		case 11:
			System.out.print("Jota de ");
			break;
		case 12:
			System.out.print("Reina de ");
			break;
		case 13:
			System.out.print("Rey de ");
			break;
		default:
			System.out.print("ERROR");
			break;
		}
		
		if (pale == 1) {
			System.out.print("Picas ♠");
		} else if (pale == 2) {
			System.out.print("Corazones " + ROJO + "♥" + RESET);
		} else if (pale == 3) {
			System.out.print("Diamantes " + ROJO + "♦" + RESET);
		} else if (pale == 4) {
			System.out.print("Tréboles ♣");
		}
	}

}
