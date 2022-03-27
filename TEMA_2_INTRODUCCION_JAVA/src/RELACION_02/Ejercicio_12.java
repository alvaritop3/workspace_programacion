package RELACION_02;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("Te mostrara la serie de Fibonacci hasta el numero que introduzca: ");
		int num = sn.nextInt();
		int i = 0;

		for (i = 1; i <= num; i++) {

			System.out.println(); // i+(i+=1)+(i+=2)
		}

		sn.close();
	}

}
