package RELACION_02;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {

		int numeroIntroducido;
		Scanner s = new Scanner(System.in);

		// Lee un número mayor o igual que 0
		do {
			System.out.print("Por favor, introduzca un número entero: ");
			numeroIntroducido = s.nextInt();

			if (numeroIntroducido < 0) {
				System.out.println("El número introducido no es correcto.");
			}
		} while (numeroIntroducido < 0);

		int factorial = numeroIntroducido;

		if (numeroIntroducido == 0) {
			System.out.println("El factorial del " + numeroIntroducido + " es 1.");
		} else {
			for (int i = 1; i < numeroIntroducido; i++) {
				factorial *= i;
			}

			System.out.println(numeroIntroducido + "! = " + factorial);
		}
		s.close();
	}
}