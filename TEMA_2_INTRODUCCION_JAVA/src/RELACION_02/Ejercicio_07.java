package RELACION_02;

import java.util.Scanner; //Esto se pone para que podamos pedir datos al usuario

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in); // Con esto dejamos que el usuario introduzca datos
		int contrasena = 1234;
		int cont = 1;
		int intento;

		do {
			System.out.print("Dime una combinación de 4 cifras para la contraseña: ");
			intento = sn.nextInt(); // Entrada del usuario
			cont = cont + 1;
			if (intento != contrasena) {
				System.out.println("No has acertado la contraseña");
			}
		} while (cont <= 4 && (intento != contrasena)); // (!=) quiere decir diferente

		if (cont == 5) {
			System.out.println("Has terminado todas tus oportunidades");
		}

		if (intento == contrasena) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		}
		sn.close(); /* Con esto hago que al terminar el programa se elimine el objeto Scanner */

	}
}
