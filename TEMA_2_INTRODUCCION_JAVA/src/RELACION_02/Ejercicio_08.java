package RELACION_02;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {

		int num;
		int oper;
		System.out.print("Dime un numero y se mostrara \nsu tabla de multiplicar:");
		Scanner sn = new Scanner(System.in); // \n es para saltar de linea
		num = sn.nextInt();

		for (oper = 0; oper <= 10; oper++) {

			System.out.println(num + " X " + oper + " = " + num * oper);
		}
		sn.close();
	}

}
