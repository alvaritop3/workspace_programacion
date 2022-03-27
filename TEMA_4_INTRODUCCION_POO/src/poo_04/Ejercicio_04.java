package poo_04;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Creamos el objeto libro1 con parametros
		Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);

		// creamos libro2 con el constructor por defecto
		Libro libro2 = new Libro();

		// Introducimos los datos por teclado
		System.out.println("LIBRO 2:");
		System.out.println("---------");
		System.out.print("Nombre del libro: ");
		libro2.setTitulo(sc.nextLine());
		System.out.print("Autor: ");
		libro2.setAutor(sc.nextLine());
		System.out.print("Numero total de ejemplares: ");
		libro2.setNumEjem(sc.nextInt());
		System.out.print("Numero de ejemplares prestados: ");
		libro2.setEjemPres(sc.nextInt());

		// mostrar datos del libro 1
		System.out.println(" ");
		System.out.println(libro1);

		// Hacemos un prestamo al libro 1
		System.out.println("\nVamos a realizar un prestamo en el libro 1:");
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado correctamente, hay " + libro1.getEjemPres()
					+ " ejemplar/es prestado/s");
		} else {
			System.out.println("No se ha podido realizar el prestamo");
		}

		// hacemos una devolucion del libro 1
		System.out.println("\nAhora vamos a realizar una devolucion en el libro 1:");
		if (libro1.devolucion()) {
			System.out.println("La devolucion se ha realizado correctamente, hay " + libro1.getEjemPres()
					+ " ejemplar/es prestado/s");
		} else {
			System.out.println("No se ha podido realizar la devolucion");
		}

		// Hacemos otro prestamo al libro 1
		System.out.println("\nVamos a realizar un prestamo en el libro 1:");
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado correctamente, hay " + libro1.getEjemPres()
					+ " ejemplar/es prestado/s");
		} else {
			System.out.println("No se ha podido realizar el prestamo");
		}
		// Hacemos otro prestamo al libro 1
		System.out.println("\nVamos a realizar un prestamo en el libro 1:");
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado correctamente, hay " + libro1.getEjemPres()
					+ " ejemplar/es prestado/s");
		} else {
			System.out.println("No se ha podido realizar el prestamo");
		}
		
		System.out.println("\nLIBRO 1:");
		System.out.println("---------");
		System.out.println(libro1);
		System.out.println("\nLIBRO 2:");
		System.out.println("---------");
		System.out.println(libro2);
	}

}
