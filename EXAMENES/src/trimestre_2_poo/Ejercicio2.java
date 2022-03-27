package trimestre_2_poo;

import java.util.Scanner;

public class Ejercicio2 {

	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
	// En primer lugar asignamos los valores de la fecha actual
	public static Fecha fechaActual = new Fecha(16, 3, 2022);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;

		// Creamos el objeto coche vacio
		Vehiculos coche1 = new Vehiculos();

		
		// comenzamos con el bucle de la ejecucion del programa
		do {
			// Mostramos el menu principal
			imprimeMenu();

			// Pedimos la opcion
			System.out.println("Selecciona una opcion: ");
			opcion = sc.nextInt();
			
			//limpiar el scanner 
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("*Nuevo Vehiculo*");
				System.out.print("Introduzca la marca:");
				String marca = sn.nextLine();

				System.out.print("Introduzca la matricula:");
				String matricula = sc.nextLine();

				// Comprobar si la matricula es correcta

				System.out.print("Introduzca los Kilometros:");
				int kilometros = sc.nextInt();
				boolean fechaCorrecta = false;
				do {
					System.out.print("Introduzca la fecha de matriculacion\n");
					System.out.print("Año:");
					int anio = sc.nextInt();
					System.out.print("Mes:");
					int mes = sc.nextInt();
					System.out.print("Dia:");
					int dia = sc.nextInt();
					Fecha fechaMat = new Fecha(dia, mes, anio);

					if (fechaMat.fechaCorrecta()) {
						fechaCorrecta = true;
					}

				} while (!fechaCorrecta);

				System.out.print("Introduzca la descripcion: ");
				String descripcion = sn.nextLine();

				System.out.print("Introduzca el precio: ");
				double precio = sc.nextDouble();

				System.out.print("Introduzca el nombre del propietario: ");
				String nombreProp = sn.nextLine();

				System.out.print("Introduzca el dni");
				String dni = sn.nextLine();
				// Comprobar si el dni es correcto

				// Creamos el coche a través de los datos introducidos por pantalla
				coche1.setDescripcion(descripcion);
				coche1.setDni(dni);
				coche1.setKilometros(kilometros);
				coche1.setMatricula(matricula);
				coche1.setMarca(marca);
				coche1.setNombreProp(nombreProp);
				coche1.setPrecio(precio);

				break;
			case 2:
				System.out.println("*Ver matricula*");
				if (coche1.getMatricula() == "") {		//He probado con las comillas e igualandolo a null pero no me sale
					System.out.println("Aun no se ha registrado el vehiculo");
				} else {
					System.out.println("La matricula del coche es " + coche1.getMatricula());
				}

				break;
			case 3:
				System.out.println("*Ver Kilometros*");
				if (coche1.getKilometros() == 0) {
					System.out.println("Aun no se ha registrado el vehiculo");
				} else {
					System.out.println("El coche tiene " + coche1.getKilometros() + " Km");
				}

				break;
			case 4:
				System.out.println("*Actualizar km*");
				int kmNuevo = 0;
				do {
					System.out.print("Introduce cuantos km tiene actualmente:");
					kmNuevo = sc.nextInt();
				} while (kmNuevo <= coche1.getKilometros());

				coche1.setKilometros(kmNuevo);
				break;
			case 5:
				System.out.println("*Ver anios de antiguedad:");
				// terminarlo
				break;
			case 6:
				System.out.println("*Mostrar propietario");
				if (coche1.getNombreProp() == "null") {
					System.out.println("Aun no se ha registrado el vehiculo");
				} else {
					System.out.println("El propietario se llama " + coche1.getNombreProp());
				}

				break;
			case 7:
				System.out.println("*Mostrar descripcion");
				if (coche1.getDescripcion() == "null") {
					System.out.println("Aun no se ha registrado el vehiculo");
				} else {
					System.out.println("La descripcion del vehiculo es " + coche1.getDescripcion());
				}

				break;
			case 8:
				System.out.println("*Precio del vehiculo");
				if (coche1.getPrecio() == 0) {
					System.out.println("Aun no se ha registrado el vehiculo");
				} else {
					System.out.println("El precio del coche es de " + coche1.getPrecio() + " euros.");
				}
				
				break;

			default:
				System.out.println("No ha seleccionado una opcion valida.");
				break;
			}

			// Limpiamos el Scanner
			// sc.nextLine();

		} while (opcion != 9);

		System.out.println("Fin del programa.");
	}

	// metodo para mostrar el menu
	public static void imprimeMenu() {
		System.out.println("\nMENU DE VEHICULOS");
		System.out.println("===================");
		System.out.println("1. Nuevo Vehiculo");
		System.out.println("2. Ver Matricula");
		System.out.println("3. Ver numero de Km");
		System.out.println("4. Actualizar Km");
		System.out.println("5. Anios de Antiguedad");
		System.out.println("6. Mostrar Propietario");
		System.out.println("7. Mostrar Descripcion");
		System.out.println("8. Mostrar Precio");
		System.out.println("9. Salir\n");
	}

	public static int calculoAnios(Fecha f) {
		int resultado = 0;

		if (f.getAnio() < fechaActual.getAnio()) {

		}

		return resultado;
	}
}
