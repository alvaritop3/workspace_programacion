package RELACION_06;

import java.util.Scanner;

public class Ejercicio_02_v2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);

			// Pedimos la contraseņa
			System.out.print("Jugador 1 escribe una contraseņa: ");
			String contra = sn.nextLine();

			// guardamos en variables el numero de caracteres, el primero y el ultimo
			int numCar = contra.length();
			char primCar = contra.charAt(0);
			char ultCar = contra.charAt(numCar-1);

			boolean acertado = false;
			do {
				System.out.print("Jugador 2 intenta adivinar la contraseņa:");
				String respuesta = sn.nextLine();
				if (respuesta.equals(contra)) {
					System.out.println("Enhorabuena, has acertado, la contraseņa era " + contra);
					acertado = true;
				} else {
					System.out.println("Pistas:");
					System.out.println("- La contraseņa tiene " + numCar + " caracteres");
					System.out.println("- La contraseņa empieza por la letra " + primCar);
					System.out.println("- La contraseņa termina por la letra " + ultCar);
					System.out.println(" ");
				}

			} while (!acertado);
			
			sn.close();
	}

}
