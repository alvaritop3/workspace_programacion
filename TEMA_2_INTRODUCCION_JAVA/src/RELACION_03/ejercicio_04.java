package RELACION_03;
//Muestra 20 numeros enteros aleatorios entre 0 y 10 (ambos incluidos) separados por

//espacios.

import java.util.Scanner;

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		System.out.print("Introduce cualquier caracter para darte 20 numeros aleatorios entre 0 y 10.");
		String cadena = sn.next();

		for (int i = 0; i < 20; i++) {
			int num = (int) Math.floor(Math.random() * 11);
			System.out.print(num + " ");
		}

		sn.close();
	}

}
