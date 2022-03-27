package RELACION_02;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca un n�mero entero positivo (relativamente grande): ");
		int numeroGrande = s.nextInt();

		System.out.print("Introduzca otro n�mero (relativamente peque�o): ");
		int numeroPequeno = s.nextInt();

		System.out.print("Los n�meros enteros positivos menores que " + numeroGrande);
		System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

		for (int i = 1; i < numeroGrande; i++) {
			if ((i % numeroPequeno) != 0) {
				System.out.print(i + " ");
			}
			s.close();
		}
	}
}