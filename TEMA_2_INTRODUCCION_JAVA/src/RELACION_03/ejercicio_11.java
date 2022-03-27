package RELACION_03;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		boolean finjuego = false;

		do {
			System.out.print("Introduce cualquier caracter para tirar el primer dado");
			String cadena1 = sn.next();
			int dado1 = (int) Math.floor(Math.random() * 6 + 1);
			System.out.println("Ha salido " + dado1 + " en el primer dado");
			System.out.println(" ");

			System.out.print("Introduce cualquier caracter para tirar el segundo dado");
			String cadena2 = sn.next();
			int dado2 = (int) Math.floor(Math.random() * 6 + 1);
			System.out.println("Ha salido " + dado2 + " en el segundo dado");
			System.out.println(" ");

			if (dado1 == dado2) {
				finjuego = true;
			} else {
				System.out.println("Los dados no han coincidido, sigue probando.");
				System.out.println(" ");
			}

		} while (!finjuego);
		System.out.println("Los dos dados han sacado el mismo valor!!");

		sn.close();

	}

}
