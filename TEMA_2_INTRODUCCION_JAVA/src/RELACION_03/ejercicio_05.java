package RELACION_03;

//Muestra 50 numeros enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
//espacios. Muestra tambien el maximo, el minimo y la media de esos numeros.

import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("Introduce cualquier caracter para comenzar el programa");
		String cadena = sn.next();
		System.out.println(" ");

		int maximo = 100;
		int minimo = 199;
		int media;
		int sumador = 0;

		for (int i = 0; i < 50; i++) {
			int num = (int) Math.floor(Math.random() * 100 + 100);
			sumador = sumador + num;
			if (num > maximo) {
				maximo = num;
			}
			if (num < minimo) {
				minimo = num;
			}
			System.out.print(num + " ");
		}
		media = sumador / 50;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("La media de todos los n�meros es " + media);
		System.out.println("El n�mero mayor ha sido " + maximo);
		System.out.println("El n�mero menor ha sido " + minimo);

		sn.close();
	}

}
