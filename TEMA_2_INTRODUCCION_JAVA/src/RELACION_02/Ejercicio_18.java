package RELACION_02;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		int num2;

		{
			System.out.print("Dime un numero:");
			int num1 = sn.nextInt();

			do {
				System.out.print("Dime otro numero diferente:");
				num2 = sn.nextInt();

			} while (num2 == num1);
			// System.out.print("num1= "+num1+" num2="+num2); para comprobar que los dos
			// numeros son diferentes.
			for (int i = num1; i <= num2; i += 7) {
				System.out.print(i + " ");
			}

			sn.close();
		}
	}
}
