package RELACION_02;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int[] n; // Con esto creamos una array de una dimension
		n = new int[10]; // Con esto le damos la dimension de la array

		int contpos = 0; // Declaramos el contador de positivos
		int contneg = 0; // Declaramos el contador de negativos

		System.out.println("Dime diez numeros positivos y/o negativos:");
		for (int i = 0; i <= 9; i++) { // Gracias al bucle para:

			n[i] = sn.nextInt(); // Con esto le pedimos al usuario los numeros y se rellena la array.
			
			if (n[i] >= 0) { // Cada vez que el contenido sea positivo
				contpos = contpos + 1; // Suma uno al contador de positivos
			} else { // Cada vez que el contenido sea negativo
				contneg = contneg + 1; // Suma uno al contador de negativos
			}
		}
		

		System.out.println("Has introducido " + contpos + " numeros positivos");
		System.out.println("Has introducido " + contneg + " numeros negativos");

		sn.close();
	}
}
