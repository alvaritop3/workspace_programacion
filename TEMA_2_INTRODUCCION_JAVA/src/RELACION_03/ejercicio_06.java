package RELACION_03;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int azar = (int) Math.floor(Math.random() * 101);

		System.out.println("El programa ya ha generado un numero al azar, tienes 5 oportunidades de adivinarlo.");

		int intentos = 0;
		boolean acertado = false;

		do {
			int num = sn.nextInt();

			if (num != azar) {
				intentos = intentos + 1;
				System.out.println("Has fallado, llevas " + intentos + " intentos");
				if (num > azar) {
					System.out.println("El n�mero es menor que el que has introducido");
				}
				if (num < azar) {
					System.out.println("El n�mero es mayor que el que has introducido");
				}
			} else {
				System.out.println("Enhorabuena, has acertado");
				acertado = true;
			}

		} while ((!acertado) && (intentos <= 4));

		if (!acertado) {
			System.out.println("Lo sentimos, ya no tienes m�s intentos, el n�mero era " + azar);
		}
		sn.close();
	}

}
