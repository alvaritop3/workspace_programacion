package RELACION_06;

import java.util.Scanner;

public class Ejercicio_02_v2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);

			// Pedimos la contrase�a
			System.out.print("Jugador 1 escribe una contrase�a: ");
			String contra = sn.nextLine();

			// guardamos en variables el numero de caracteres, el primero y el ultimo
			int numCar = contra.length();
			char primCar = contra.charAt(0);
			char ultCar = contra.charAt(numCar-1);

			boolean acertado = false;
			do {
				System.out.print("Jugador 2 intenta adivinar la contrase�a:");
				String respuesta = sn.nextLine();
				if (respuesta.equals(contra)) {
					System.out.println("Enhorabuena, has acertado, la contrase�a era " + contra);
					acertado = true;
				} else {
					System.out.println("Pistas:");
					System.out.println("- La contrase�a tiene " + numCar + " caracteres");
					System.out.println("- La contrase�a empieza por la letra " + primCar);
					System.out.println("- La contrase�a termina por la letra " + ultCar);
					System.out.println(" ");
				}

			} while (!acertado);
			
			sn.close();
	}

}
