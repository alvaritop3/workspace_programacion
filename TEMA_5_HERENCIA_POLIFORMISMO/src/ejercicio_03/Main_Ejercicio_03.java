package ejercicio_03;

import java.util.Scanner;

public class Main_Ejercicio_03 {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	// Hacemos un indice para el array
	static int indice = 0;

	// Creamos el array de poligonos
	static Empleados[] empleado = new Empleados[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;

		do {
			imprimeMenu();
			System.out.print("Opcion:");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el nombre:");
				String nombre = sc.nextLine();
				System.out.println("Introduce su edad:");
				int edad = sn.nextInt();
				System.out.println("Introduce tu salario:");
				double salario = sn.nextDouble();
				System.out.println("Introduce la comision: ");
				double comision = sn.nextDouble();
				empleado[indice] = new Comercial(nombre, edad, salario, comision);
				empleado[indice].plus();
				indice++;

				break;
			case 2:
				System.out.println("Introduce el nombre:");
				String nombre1 = sc.nextLine();
				System.out.println("Introduce su edad:");
				int edad1 = sn.nextInt();
				System.out.println("Introduce tu salario:");
				double salario1 = sn.nextDouble();
				System.out.println("Introduce la zona: ");
				String zona = sc.nextLine();
				empleado[indice] = new Repartidor(nombre1, edad1, salario1, zona);
				
				indice++;
				break;
				
			case 3:
				
				for (int i = 0; i < indice; i++) {
					System.out.println(empleado[i]);
				}
				
				break;
			case 4:
				System.out.println("Saliendo del programa");
				break;

			default:
				System.out.println("La opcion no es correcta");
				break;
			}

		} while (opcion != 0);

	}

	public static void imprimeMenu() {
		System.out.println("\n-Selecciona una opcion:");
		System.out.println("1. Introducir un Comercial.");
		System.out.println("2. Introducir un Repartidor.");
		System.out.println("3. Mostrar el array.");
		System.out.println("4. Salir.\n");
	}
}
