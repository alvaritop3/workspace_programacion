package RELACION_02;

public class Ejercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numeros primos entre 2 y 100: ");

		boolean esPrimo = true;

		for (int n = 2; n <= 100; n++) {

			// comprueba si n es primo
			esPrimo = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					esPrimo = false;
				}
			}

			// si n es primo, se muestra por pantalla
			if (esPrimo) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}
