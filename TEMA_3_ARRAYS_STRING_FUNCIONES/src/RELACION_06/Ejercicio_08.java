package RELACION_06;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		if (esPalindroma(frase)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}
		sc.close();
	}

	// Comprueba si una frase es palindroma

	public static boolean esPalindroma(String cadena) {
		String sinEspacios = "";
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c != ' ') {
				sinEspacios += c;
			}
		}
		sinEspacios = sinEspacios.toLowerCase();
		String invertida = invertir(sinEspacios);
		return sinEspacios.equals(invertida);
	}

	// Invierte la cadena de caracteres

	public static String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}

}
