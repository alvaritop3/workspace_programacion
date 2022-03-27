package RELACION_04_1;

import java.util.Scanner;

public class ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {
		System.out.print("Dime un número: ");
		int num = sn.nextInt();
		array[i] = num;
		}
		
		System.out.println("Los numeros que has introducido al revés es:");
		for (int i = 9; i >= 0; i--) {
			System.out.print(array[i]);
		}
		sn.close();
	}
}
