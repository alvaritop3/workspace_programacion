package RELACION_02;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int exponente;

		System.out.println("Dime una base:");
		int base = sn.nextInt();

		do { // Hacemos un buble do-while para que el exponente siempre sea positivo.
			System.out.println("Dime un exponente positivo:");
			exponente = sn.nextInt();

		} while (exponente < 0);

		System.out.println("El resultado de la base " + base + " elevado a " + exponente + " es:");
		System.out.println(Math.pow(base, exponente)); // Utilizamos el (Math.pow(num1,num2)) para calcular la potencia

		sn.close();
	}

}
