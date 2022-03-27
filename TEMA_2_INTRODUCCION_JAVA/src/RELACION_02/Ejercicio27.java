package RELACION_02;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca un numero entero mayor que 1: ");
		int numeroIntroducido = s.nextInt();

		int cuenta = 0;
		int suma = 0;

		for (int i = 1; i < numeroIntroducido; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
				cuenta++;
				suma += i;
			}
		}

		System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
		System.out.println(" m�ltiplos de 3 y suman " + suma);
		s.close();
	}
}