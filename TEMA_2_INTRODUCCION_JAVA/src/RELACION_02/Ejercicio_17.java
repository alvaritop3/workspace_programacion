package RELACION_02;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		int suma = 0;
		int tope;
		int num;

		{
			System.out.print("Dime un numero:");
			num = sn.nextInt();

			while (num <= 0) {
				{
					System.out.print("Dime un numero positivo:");
					num = sn.nextInt();
				}

				tope = 100 + num;

				for (int i = num; i <= tope; i++) {
					suma = suma + i;
					System.out.println("el valor de num es: " + suma);
				}
				sn.close();
			}
		}
	}
}
