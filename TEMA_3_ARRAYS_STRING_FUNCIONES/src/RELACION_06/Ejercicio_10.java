package RELACION_06;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] tabla1 = "eikmpqrstuv".toCharArray();
		char[] tabla2 = "pviumterkqs".toCharArray();
		System.out.println("Introduzca la cadena a codificar");
		String cadena = sc.nextLine();
		// Codificamos la cadena original
		String codificada = codificaCadena(tabla1, tabla2, cadena);
		// La mostramos codificada
		System.out.println("La cadena codificada es: " + codificada);
		// Decodificamos la cadena codificada (invirtiendo las tablas)
		String decodificada = codificaCadena(tabla2, tabla1, codificada);
		// Y la mostramos
		System.out.println("La cadena decodificada es " + decodificada);
		sc.close();

	}

	// si un carácter está en el array 1 lo pasa al array 2 de la misma posición

	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
		char resultado = Character.toLowerCase(c);
		boolean encontrado = false;
		for (int i = 0; i < conjunto1.length && !encontrado; i++) {
			if (resultado == conjunto1[i]) {
				resultado = conjunto2[i];
				encontrado = true;
			}
		}
		return resultado;
	}

	// pasa un string a otro string usando la codificación

	public static String codificaCadena(char[] conjunto1, char[] conjunto2, String cadena) {
		String codificada = "";
		for (int i = 0; i < cadena.length(); i++) {
			codificada += codifica(conjunto1, conjunto2, cadena.charAt(i));
		}
		return codificada;
	}
}
