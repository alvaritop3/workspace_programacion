package RELACION_02;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.print("Dime un número:");
		int num = sn.nextInt();
		int cont = 0;
		// for (int i = 0; i < args.length; i++) {
		for (int i = 1; i < num; i++) {
			if (num % i != 0) {
				cont = cont + 1;
			}
		}

		if (cont != 0) {
			System.out.print("El numero " + num + " es primo.");
		} else {
			System.out.print("El numero " + num + " no es primo.");
		}

		sn.close();
	}
}
