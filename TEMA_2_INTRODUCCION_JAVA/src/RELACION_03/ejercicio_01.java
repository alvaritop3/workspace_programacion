package RELACION_03;

//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar tambi�n la suma
//total (los puntos que suman entre los tres dados).

import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("Introduce cualquier caracter para tirar el primer dado.");
		String cadena1 = sn.next();

		int dado1 = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("En el primer dado ha salido " + dado1);
		System.out.println(" ");

		System.out.println("Introduce cualquier caracter para tirar el segundo dado.");
		String cadena2 = sn.next();

		int dado2 = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("En el segundo dado ha salido " + dado2);
		System.out.println(" ");

		System.out.println("Introduce cualquier caracter para tirar el tercer dado.");
		String cadena3 = sn.next();

		int dado3 = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("En el tercer dado ha salido " + dado3);
		System.out.println(" ");

		int suma = dado1 + dado2 + dado3;
		System.out.println("La suma de las tres tiradas es " + suma);

		sn.close();
	}

}