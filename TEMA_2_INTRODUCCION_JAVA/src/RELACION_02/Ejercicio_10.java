package RELACION_02;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		int num;
		int cont = 0;
		int suma = 0;
		float media;

		System.out.println("  PROGRAMA PARA HACER MEDIAS:  ");
		System.out.println("---------------------------------");
		System.out.println("Introduce numeros positivos para calcularte la media.");
		System.out.println("Para salir del programa, introduce un numero negativo." + " ");

		do {
			num = sn.nextInt(); // Con esto pedimos el numero al usuario

			if (num >= 0) {
				cont = cont + 1;
				suma = suma + num;
			}

		} while (num >= 0);

		media = (float) suma / (float) cont;

		System.out.println("La media total de las notas introducidas es: " + media);

		sn.close();

	}

}
