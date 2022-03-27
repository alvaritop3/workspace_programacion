package RELACION_01;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		final double IVA = 0.21; /*
									 * El "final" establece que es una variable que no se puede modificar, es
									 * inamovible
									 */
		System.out.print("Dime la base imponible de la factura:");
		double baseImponible = sn.nextDouble();
		double iva = baseImponible * IVA;
		double precioFinal = baseImponible + (iva);
		System.out.println("El precio con iva es  " + precioFinal);

		sn.close();
	}

}
