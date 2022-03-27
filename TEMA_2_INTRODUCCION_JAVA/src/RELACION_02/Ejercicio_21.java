package RELACION_02;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int num;
		int sumaimp = 0; // esto nos sirve para ir sumando los numeros impares
		int cont = -1; // este contador es para saber cuantos numeros se han introducido
		int contimp = 0; // este contador es para calcular la media de los impares
		int maypar = 0; // este contador es para ver cual es el mayor de los pares
		int mediaimp;
		int contpar = 0;

		do {
			System.out.print("Dime un numero:");
			num = sn.nextInt();
			cont = cont + 1;

			if (num % 2 != 0 && num >= 0) { // comprobamos si es impar y si es mayor que cero
				contimp = contimp + 1; // si es impar (y mayor que cero) sumamos uno al contador
				sumaimp = sumaimp + num; // sumamos el numero a los anteriores impares introducidos
				System.out.println("***contimp=" + contimp); // coomprobacion de que el contador sube con los impares
				System.out.println("***sumaimp=" + sumaimp); // comprobacion de la suma de los impares imp
			}
			if (num % 2 == 0) { // comprobamos si es par y si es mayor que cero
				contpar = contpar + 1;
				if (num >= maypar) { // si el numero par es mayor o igual que el mayor,
					maypar = num; // este numero se guardara como mayor de los pares
				}
			}

		} while (num >= 0);

		mediaimp = sumaimp / contimp; // para calcular la media de los impares

		System.out.println("- Has introducido " + cont + " numeros."); // esto nos va a imprimir la cantidad de números
																		// que hemos introducido
		if (contimp > 0) {
			System.out.println("- La media de los impares que has introducido es : " + (mediaimp)); // esto nos va a
																									// hacer la media de
																									// los impares
																									// introducidos
		}
		if (contpar > 0) {
			System.out.println("- El numero mayor de los pares introducidos es  : " + maypar); // esto nos muestra el
																								// mayor de los pares
																								// introducidos
		}

		sn.close();
	}

}
