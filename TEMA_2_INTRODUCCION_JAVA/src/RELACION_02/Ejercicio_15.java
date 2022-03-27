package RELACION_02;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("Dime una base:");

		int base = sn.nextInt();

		System.out.println("Dime un exponente:");
		int exponente = sn.nextInt();

		int elevado = base;
		int incremento = base;

		for (int i = 1; i <= exponente; i++) {

			System.out.println("El numero " + base + " elevado a " + i + " es igual a: " + elevado);
			elevado = elevado * incremento;
		}
		sn.close();
	}
}
