package ejercicio_02;

import java.util.Scanner;

public class Main_Ejercicio_02 {

	static Scanner sn = new Scanner(System.in);

	// Hacemos un indice para el array
	static int indice = 0;

	// Creamos el array de poligonos
	static Poligono[] poligonos = new Poligono[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llenarPoligono();
	}

	public static void llenarPoligono() {

		int opcion = 0;

		do {
			System.out.println("Selecciona una opcion:");
			System.out.println("1. Introducir un rectangulo");
			System.out.println("2. Introducir un triangulo");
			System.out.println("3. Mostrar poligonos");
			System.out.println("4. Salir\n");
			System.out.print("Indica la opcion: ");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Ha seleccionado introducir rectangulo");
				llenarRectangulo();
				break;
			case 2:
				System.out.println("Ha seleccionado introducir triangulo");
				llenarTriangulo();
				break;
			case 3: 
				System.out.println("Ha seleccionado mostrar la lista de poligonos\n");
				mostrarResultados();
				break;
			case 0:
				System.out.println("Saliendo del programa");
			break;
			
			default:
				System.out.println("\nLa opcion no es valida.");
				break;
			}
		} while (opcion != 0);
		System.out.println("Fin del programa.");
	}

	public static void llenarTriangulo() {
		System.out.println("Dime el primer lado del triangulo: ");
		double lado1 = sn.nextDouble();
		System.out.println("Dime el segundo lado del triangulo: ");
		double lado2 = sn.nextDouble();
		System.out.println("Dime el tercer lado del triangulo: ");
		double lado3 = sn.nextDouble();
		poligonos[indice] = new Triangulo(lado1, lado2, lado3);
		indice++;
	}

	public static void llenarRectangulo() {
		System.out.println("Dime el primer lado del rectangulo: ");
		double lado1 = sn.nextDouble();
		System.out.println("Dime el segundo lado del rectangulo: ");
		double lado2 = sn.nextDouble();

		poligonos[indice] = new Rectangulo(lado1, lado2);
		indice++;
	}

	public static void mostrarResultados() {
		for (int i = 0; i <indice; i++) {
			System.out.println("Poligono " + (i+1) + " :");
			System.out.println(poligonos[i]);
		}
	}
}
