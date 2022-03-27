package trimestre_2_poo;

import java.util.Scanner;

public class Ejercicio3 {

	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
	

	// establecemos el maximo de vehiculos a introducir
	static int N = 50;
	static int indice=0;
	// Creamos el array de vehiculos
	public static Vehiculos[] concesionario = new Vehiculos[N];
	
	
	public static void main(String[] args) {

		int opcion = 0;

		// rellenamos con objetos vacios
		for (int i = 0; i < concesionario.length; i++) {
			concesionario[i] = new Vehiculos();
		}
		
		do {

			imprimeMenu();
			// Pedimos la opcion
			System.out.println("Selecciona una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				if (insertarVehiculo()==0) {
					System.out.println("El vehiculo se ha insertado correctamente");
				}else {
					System.out.println("No se ha podido introducir el vehiculo");
				}
				
				break;
			case 2:
				System.out.println("\n*Lista de Vehiculos*\n");
				
				listarVehiculo();
				
				break;
			case 3:
				System.out.println("\n*Buscar vehiculo*");
				System.out.println("Introduce una matricula");
				String mat=sn.nextLine();
				Vehiculos auxiliar=buscarVehiculo(mat);
				
				if(auxiliar==null) {
					System.out.println("\nEl vehiculo no se ha encontrado en la lista");
				}else {
					System.out.println("EL vehiculo ha sido encontrado: ");
					System.out.println(auxiliar);
				}
				
				break;
			case 4:
				System.out.println("\nModificar Kms del vehiculo");
				
				System.out.println("Dime la matricula");
				String matri=sn.nextLine();
				System.out.println("Dime los nuevos kilometros");
				int nuevKm=sn.nextInt();
				
				if (actualizaKms(matri, nuevKm)) {
				System.out.println("Los km se han introducido correctamente");
				}else {
					System.out.println("No se ha podido actualizar");
				}
				
				break;
			case 5:
				System.out.println("Saliendo del programa.");
				break;

			default:
				System.out.println("No ha seleccionado una opcion valida.");
				break;
			}
		} while (opcion != 5);
		
		System.out.println("Fin del programa.");
	}

	// metodo para mostrar el menu
	public static void imprimeMenu() {
		System.out.println("\nMENU DE CONCESIONARIO");
		System.out.println("1. Nuevo Vehiculo");
		System.out.println("2. Lista de Vehiculos");
		System.out.println("3. Buscar Vehiculo");
		System.out.println("4. Actualizar Km");
		System.out.println("5. Salir\n");

	}
	
	public static Vehiculos buscarVehiculo(String matricula) {
		int num;
		for (int i = 0; i < indice; i++) {
			if (matricula.equalsIgnoreCase(concesionario[i].getMatricula())) {
				num=i;
				return concesionario[num];
			}	
		}
		return null;
	}
	
	public static int insertarVehiculo() {
		
		if (indice==50) {
			return -2;
		}else {
			System.out.println("*Nuevo Vehiculo*");
			System.out.print("Introduzca la marca:");
			String marca = sn.nextLine();

			System.out.print("Introduzca la matricula:");
			String matricula = sc.nextLine();

			// Comprobar si la matricula es correcta

			System.out.print("Introduzca los Kilometros:");
			int kilometros = sc.nextInt();
			boolean fechaCorrecta = false;
			//Bucle para que la fecha introducida sea correcta
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
			concesionario[indice].setDescripcion(descripcion);
			concesionario[indice].setDni(dni);
			concesionario[indice].setKilometros(kilometros);
			concesionario[indice].setMatricula(matricula);
			concesionario[indice].setMarca(marca);
			concesionario[indice].setNombreProp(nombreProp);
			concesionario[indice].setPrecio(precio);
			
			//aumentamos el indice
			indice++;
			return 0;
		}
		//me falta la opcion de que la matricula haya sido introducida
	}
	
	//metodo para mostrar la lista de vehiculos
	public static void listarVehiculo() {
		for (int i = 0; i < indice; i++) {
			System.out.println(concesionario[indice]);
			System.out.println(" ");
		}
	}
	
	public static boolean actualizaKms(String matric, int kms) {
		
		for (int i = 0; i < indice; i++) {
			if (concesionario[i].getMatricula().equalsIgnoreCase(matric)) {
				if (concesionario[i].getKilometros()<kms) {
					concesionario[i].setKilometros(kms);
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
		
	}
}
