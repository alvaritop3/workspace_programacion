package poo10;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gestisimal();
	}

	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	public static void imprimeMenu() {
		System.out.println("\n    GESTISIMAL");
		System.out.println("=====================");
		System.out.println("1. Listado.");
		System.out.println("2. Alta");
		System.out.println("3. Baja.");
		System.out.println("4. Modificación.");
		System.out.println("5. Entrada de mercancía.");
		System.out.println("6. Salida de mercancía.");
		System.out.println("7. Salir.\n");
	}

	public static void gestisimal() {
		// Creamos el array de objetos
		Articulo[] gestisimal = new Articulo[100];

		// rellenamos con objetos vacios
		for (int i = 0; i < gestisimal.length; i++) {
			gestisimal[i] = new Articulo();
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
				for (int i = 0; i < gestisimal.length; i++) {
					if (!gestisimal[i].getCodigo().equals("LIBRE")) {
						indice = indice + 1;
						System.out.println("Articulo " + indice + ":");
						System.out.println(gestisimal[i]);
					}
				}

				// introducir algo para decir que no se han encontrado discos
				break;
			case "2":
				// Con esto vemos si todas las posiciones están ocupadas

				int contLleno = 99;
				for (int i = 0; i < gestisimal.length; i++) {
					if (!gestisimal[i].getCodigo().equals("LIBRE")) {
						contLleno--;
					}
				}
				if (contLleno == 0) {
					System.out.println("Todos los huecos de articulos estan ocupados, elimine o modifique alguno. ");
				}

				// esto se va a hacer mientras que haya huecos disponibles
				while (contLleno != 0) {
					// Con esto encontramos la primera posicion libre para introducir el disco
					boolean primerLibre = false;

					for (int i = 0; i < gestisimal.length && !primerLibre; i++) {	//IMPORTANTE
						if (gestisimal[i].getCodigo().equals("LIBRE")) {			//PARAR EL FOR
							contCod = i;
							primerLibre = true;
						}
					}
					System.out.println("\nHa seleccionado: Alta.");
					gestisimal[contCod].setCodigo(Integer.toString(contCod));
					System.out.print("Descripcion: ");
					gestisimal[contCod].setDescripcion(sn.nextLine());
					System.out.print("Precio Compra: ");
					gestisimal[contCod].setPrecioCompra(sn.nextDouble());
					System.out.print("Precio Venta: ");
					gestisimal[contCod].setPrecioVenta(sn.nextDouble());

					contCod++;
				}

				break;

			case "3":
				System.out.println("\n¿Qué articulo desea dar de baja?");
				int borrar = sc.nextInt();
				System.out.println("Eliminando articulo " + borrar);
				gestisimal[borrar].setCodigo("LIBRE");
				break;

			case "4":

				System.out.println("\nIntroduzca el codigo del articulo que desea modificar");
				int eleccion = sc.nextInt();
				System.out.println("A continuacion, introduzca los nuevos datos:");
				System.out.print("Descripcion: ");
				gestisimal[eleccion].setDescripcion(sn.nextLine());
				System.out.print("Precio Compra: ");
				gestisimal[eleccion].setPrecioCompra(sn.nextDouble());
				System.out.print("Precio Venta: ");
				gestisimal[eleccion].setPrecioVenta(sn.nextDouble());
				break;

			case "5":
				System.out.print("Ha seleccionado entrada de mercancia, indique el codigo del articulo: ");
				int entrada = sn.nextInt();
				if (gestisimal[entrada].getCodigo().equals("LIBRE")) {
					System.out.println("No se pueden añadir unidades a articulos que no existen.");
				} else {
					int incremento;
					do {
						System.out.print("Señale el numero de unidades que quiere añadir: ");
						incremento = sn.nextInt();
					} while (incremento >= 0);

					gestisimal[entrada].setStock(gestisimal[entrada].getStock() + incremento);
				}

				break;
			case "6":
				System.out.print("Ha seleccionado salida de mercancia, indique el codigo del articulo: ");
				break;

			case "7":

				System.out.println("\nSaliendo del programa.");

				break;
			default:

				System.out.println("\n*La opcion no es correcta*");

				break;
			}

		} while (!opcion.equals("7"));

		System.out.println("\nEl programa ha finalizado.");
	}
}
