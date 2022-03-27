package poo_02;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		String nombre, num_cuenta;
		double tipo, saldo, imp_ing, importe;

		// Creamos la cuenta 1
		System.out.println("CUENTA 1:");
		System.out.println("---------");
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Numero de cuenta: ");
		num_cuenta = sc.nextLine();
		System.out.print("Tipo de interes: ");
		tipo = sc.nextDouble();
		System.out.print("Saldo de la cuenta: ");
		saldo = sc.nextDouble();

		// Utilizamos los Setter
		cuenta1.setNombre_cliente(nombre);
		cuenta1.setNumero_cuenta(num_cuenta);
		cuenta1.setTipo_interes(tipo);
		cuenta1.setSaldo(saldo);
		
		System.out.println(" ");
		// Creamos la cuenta 2
		System.out.println("CUENTA 2:");
		System.out.println("---------");
		// Cuenta cuenta2 = new Cuenta();
		System.out.print("Nombre : ");
		nombre = sn.nextLine();
		System.out.print("Numero cuenta: ");
		num_cuenta = sn.nextLine();
		System.out.print("Tipo de interes: ");
		tipo = sn.nextDouble();
		System.out.print("Saldo de la cuenta: ");
		saldo = sn.nextDouble();

		// forma de crear una cuenta introduciendole los datos por teclado
		Cuenta cuenta2 = new Cuenta(nombre, num_cuenta, tipo, saldo);

		// forma de crear una cuenta con los datos ya dados
		Cuenta cuenta3 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);

		System.out.println(" ");
		// mostramos los datos de las cuentas
//		System.out.println("PRUEBA DE IMPRIMIR DATOS");
//		cuenta1.muestraDatos();
//		cuenta2.muestraDatos();
//		cuenta3.muestraDatos();
		System.out.println("Muestro el metodo to string");
		System.out.println(cuenta1);
		System.out.println(" ");

		// comprobaciones de los metodos:
		System.out.println("Introduce una cantidad para sumarle a la cuenta 1 ");
		importe = sc.nextDouble();
		// metodo ingreso
		cuenta1.ingreso(importe);
		System.out.println("El saldo de la cuenta 1 es " + cuenta1.getSaldo() + "€");

		System.out.println("Introduce una cantidad para restarle a la cuenta 1 ");
		importe = sc.nextDouble();
		// metodo reintegro
		cuenta1.reintegro(importe);
		System.out.println("El saldo de la cuenta 1 es " + cuenta1.getSaldo() + "€\n");

		System.out.println("Introduce que cantidad quieres transferir de la cuenta 2 a la cuenta 1 ");
		imp_ing = sc.nextDouble();
		// metodo transferencia
		cuenta2.transferencia(cuenta1, imp_ing);
		System.out.println("El saldo de la cuenta 2 es " + cuenta2.getSaldo() + "€\n");
		System.out.println("El saldo de la cuenta 1 es " + cuenta1.getSaldo() + "€\n");

		sn.close();
		sc.close();
	}

}
