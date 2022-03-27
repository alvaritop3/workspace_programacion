package poo_08;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		
		crud();
	}

	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	public static void imprimeMenu() {
		System.out.println("\nCOLECCION DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Disco.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.\n");

	}

	public static void crud() {
		// Creamos el array de objetos
		Disco[] crud = new Disco[100];

		// rellenamos con objetos vacios
		for (int i = 0; i < crud.length; i++) {
			crud[i] = new Disco();
		}

		String opcion;
		int contCod = 0;

		do {
			// Imprimimos el menu
			imprimeMenu();
			// Pedimos un numero para que seleccione la opcion
			System.out.print("Selecciona una opcion: ");
			opcion = sc.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("\nHa seleccionado: Listado.");

				int indice = 0;
				for (int i = 0; i < crud.length; i++) {
					if (!crud[i].getCodigo().equals("LIBRE")) {
						indice = indice + 1;
						System.out.println("Disco " + indice + ":");
						System.out.println(crud[i]);
					}
				}

				// introducir algo para decir que no se han encontrado discos
				break;
			case "2":
				// Con esto vemos si todas las posiciones están ocupadas

				int contLleno = 99;
				for (int i = 0; i < crud.length; i++) {
					if (!crud[i].getCodigo().equals("LIBRE")) {
						contLleno--;
					}
				}
				if (contLleno == 0) {
					System.out.println("Todos los huecos de discos estan ocupados, elimine o modifique alguno. ");
				}

				// esto se va a hacer mientras que haya huecos disponibles
				while (contLleno != 0) {
					// Con esto encontramos la primera posicion libre para introducir el disco
					boolean primerLibre = false;

					for (int i = 0; i < crud.length && !primerLibre; i++) {
						if (crud[i].getCodigo().equals("LIBRE")) {
							contCod = i;
							primerLibre = true;
						}
					}
					System.out.println("\nHa seleccionado: Nuevo Disco.");
					crud[contCod].setCodigo(Integer.toString(contCod));
					System.out.print("Autor: ");
					crud[contCod].setAutor(sn.nextLine());
					System.out.print("Titulo: ");
					crud[contCod].setTitulo(sn.nextLine());
					System.out.print("Genero: ");
					crud[contCod].setGenero(sn.nextLine());
					System.out.print("Duracion: ");
					crud[contCod].setDuracion(sc.nextInt());

					contCod++;
				}

				break;
				
			case "3":

				System.out.println("\nIntroduzca el codigo del disco que desea modificar");
				int eleccion = sc.nextInt();
				System.out.println("A continuacion, introduzca los nuevos datos:");
				System.out.print("Autor: ");
				crud[eleccion].setAutor(sn.nextLine());
				System.out.println("Titulo: ");
				crud[eleccion].setTitulo(sn.nextLine());
				System.out.println("Genero: ");
				crud[eleccion].setGenero(sn.nextLine());
				System.out.println("Duracion: ");
				crud[eleccion].setDuracion(sc.nextInt());
				break;

			case "4":

				System.out.println("\n¿Qué disco desea eliminar?");
				int borrar = sc.nextInt();
				System.out.println("Eliminando disco " + borrar);
				crud[borrar].setCodigo("LIBRE");
				break;
				
			case "5":
				System.out.println("\nSaliendo del programa.");
				break;
				
			default:
				System.out.println("\n*La opcion no es correcta*");
				break;
			}

		} while (!opcion.equals("5"));		

		System.out.println("\nEl programa ha finalizado.");
	}
}
