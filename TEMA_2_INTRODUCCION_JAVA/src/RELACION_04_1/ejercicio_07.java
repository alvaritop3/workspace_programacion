package RELACION_04_1;

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] array = new int[100];

		for (int i = 0; i < 100; i++) {
			array[i] = (int) Math.floor(Math.random() * 21);
			System.out.printf("|%3d ", array[i]);
		}
		System.out.println(" ");
		System.out.print("Dime un numero: ");
		int num1 = sn.nextInt();
		System.out.print("Dime otro numero: ");
		int num2 = sn.nextInt();

		for (int i = 0; i < 100; i++) {
			if (array[i] == num1) {
				System.out.printf("|%3d ", num2);
			} else {
				System.out.printf("|%3d ", array[i]);
			}

		}
	}
}
