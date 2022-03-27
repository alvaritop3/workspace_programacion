package RELACION_01;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.print("Dime cuantos euros tienes en el bolsillo:");
		double euro = sn.nextDouble();
		double conversor = euro * 166.386;
		System.out.println("En total tienes " + conversor + " pesetas.");

		sn.close();
	}

}
