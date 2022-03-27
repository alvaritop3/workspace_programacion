package RELACION_06;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		// Pedimos la contraseña
		System.out.print("Jugador 1 escribe una contraseña: ");
		String contra = sn.nextLine();

		// guardamos en variables el numero de caracteres, el primero y el ultimo
		

		boolean acertado = false;
		do {
			System.out.print("Jugador 2 intenta adivinar la contraseña:");
			String respuesta = sn.nextLine();
			if (respuesta.equals(contra)) {
				System.out.println("Enhorabuena, has acertado, la contraseña era " + contra);
				acertado = true;
			} else {
				int resultado = respuesta.compareTo(contra);
				
				if (resultado < 0) {
					System.out.println("La contraseña es mayor que la que has introducido\n");
				} else if (resultado == 0) {
					System.out.println("La contraseña coincide con la que has introducido\n");
				} else if (resultado > 0) {
					System.out.println("La contraseña es menor que la que has introducido\n");
				}
			}

		} while (!acertado);

		sn.close();
	}

}
