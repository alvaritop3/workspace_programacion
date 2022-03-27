package RELACION_01;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.print("Escribe tu nombre:");
		String nombre = sn.next();
		System.out.println("Su nombre es " + nombre);

		System.out.print("Escribe tu direccion:");
		String direccion = sn.next();
		System.out.println("Su direccion es " + direccion);

		System.out.print("Escribe tu telefono");
		String telefono = sn.next();
		System.out.println("Su telefono es: " + telefono);

		sn.close();

	}

}
