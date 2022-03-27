package RELACION_02;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {

		long num;
		int cont;

		Scanner sn = new Scanner(System.in);

		System.out.print("Dime un numero :");
		num = sn.nextLong();
		cont = 0;

		do {
			num = num / 10; // Esta division tambien se puede representar como num/=10
			cont = cont + 1;
		} while (num > 0);

		System.out.print("Tu numero tiene  " + cont + " cifras");

		sn.close();
	}

}
