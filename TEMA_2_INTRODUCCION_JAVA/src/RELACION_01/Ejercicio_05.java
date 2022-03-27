package RELACION_01;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.print("Dime cuantas pesetas tienes:");
		double peseta = sn.nextDouble();
		double conversor = peseta / 166.386;
		System.out.println("En total tienes " + conversor + " euros.");

		sn.close();
	}

}
