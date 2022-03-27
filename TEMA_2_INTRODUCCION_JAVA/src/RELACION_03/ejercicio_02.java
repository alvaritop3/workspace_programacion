package RELACION_03;

//Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
//baraja est� dividida en cuatro palos: picas, corazones, diamantes y tr�boles. Cada palo est�
//formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
//9, 10, J, Q, K y A (que ser�a el 1). 

import java.util.Scanner;

public class ejercicio_02 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce cualquier caracter para darte una carta aleatoria de la baraja francesa.");
		String cadena = sn.next();

		System.out.print("Ha salido el/la ");

		int carta = (int) Math.floor(Math.random() * 13 + 1);
		switch (carta) {
		case 1:
			System.out.print("As ");
			break;
		case 2:
			System.out.print("2 ");
			break;
		case 3:
			System.out.print("3 ");
			break;
		case 4:
			System.out.print("4 ");
			break;
		case 5:
			System.out.print("5  ");
			break;
		case 6:
			System.out.print("6 ");
			break;
		case 7:
			System.out.print("7 ");
			break;
		case 8:
			System.out.print("8 ");
			break;
		case 9:
			System.out.print("9 ");
			break;
		case 10:
			System.out.print("10 ");
			break;
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;

		}

		System.out.print("de ");

		int palo = (int) Math.floor(Math.random() * 4 + 1);

		switch (palo) {
		case 1:
			System.out.print("Picas");
			break;
		case 2:
			System.out.print("Corazones ");
			break;
		case 3:
			System.out.print("Diamantes ");
			break;
		case 4:
			System.out.print("Tréboles ");
			break;

		}

		sn.close();
	}

}
