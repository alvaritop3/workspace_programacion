package poo_06;

import java.util.Scanner;

import poo_04.Libro;

public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Creamos el objeto fecha1
		Fecha fecha1 = new Fecha();

		// Pedimos los datos
		do {
			System.out.print("Dime un dia:");
			fecha1.setDia(sc.nextInt());
			System.out.print("Dime un mes:");
			fecha1.setMes(sc.nextInt());
			System.out.print("Dime un año:");
			fecha1.setAnio(sc.nextInt());

			if (fecha1.fechaCorrecta()) {
				System.out.println("La fecha que ha introducido es correcta");
			} else {
				System.out.println("La fecha que ha introducido es incorrecta");
			}
		} while (!fecha1.fechaCorrecta());

		System.out.println("Ha seleccionado la fecha " + fecha1);

		System.out.println("Vamos a incrementar la fecha en 10 ocasiones.");
		for (int i = 0; i < 10; i++) {
			fecha1.diaSiguiente();
			System.out.println(fecha1);
		}
		sc.close();
	}

}
