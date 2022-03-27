package RELACION_02;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("Dime un numero: ");
		int num = sn.nextInt();

		for (int i = num; i < num + 5; i++) {
			System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);	//con esto pintamos con formato
		}

		sn.close();

	}
}
