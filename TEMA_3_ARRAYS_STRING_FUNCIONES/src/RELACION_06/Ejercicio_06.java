package RELACION_06;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena");
		String cadena = sc.nextLine();
		System.out.println(invertir(cadena));
		sc.close();
	}

	public static String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado+cadena.charAt(i);
		}
		return resultado;
	}
}