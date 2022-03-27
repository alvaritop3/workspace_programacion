package poo_07;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numEmp;

		do {
			System.out.println("¿Cuantos empleados quiere introducir?");
			numEmp = sc.nextInt();

			if ((numEmp <= 0) || (numEmp > 20)) {
				System.out.println("El numero minimo es 1 y el maximo 20");
			}
		} while ((numEmp < 1) || (numEmp > 20));

		// Creamos el array de objetos
		Empleado[] emp = new Empleado[numEmp];

		for (int i = 0; i < emp.length; i++) {
			sc.nextLine(); // para limpiar el escaner

			// Creamos el objeto en la posicion del array
			emp[i] = new Empleado();

			System.out.print("Dime el nif:");
			emp[i].setNif(sc.nextLine());
			System.out.print("Dime el nombre:");
			emp[i].setNombre(sc.nextLine());
			System.out.print("Dime el Sueldo Base:");
			emp[i].setSueldoBase(sc.nextDouble());
			System.out.print("Dime cuantas horas extras has echado:");
			emp[i].setHoraExtra(sc.nextInt());
			System.out.print("Dime tu Irpf:");
			emp[i].setIrpf(sc.nextDouble());
			System.out.print("Dime si estas casado, S es si, N es no:");
			String resCas = sc.next();
			if (resCas.equalsIgnoreCase("s")) {
				emp[i].setCasado(true);
			} else {
				emp[i].setCasado(false);
			}
			System.out.print("¿Cuantos hijos tienes?");
			emp[i].setNumeroHijos(sc.nextInt());
			
			// Imprimimos los empleados que introducimos
			int indice=i+1;
			System.out.println("\nTRABAJADOR Nº " + indice);
			System.out.println(emp[i]);
		}

		System.out.print("\nDime cual es el importe del pago por hora extra:\n");
		Empleado.setImpExtra(sc.nextDouble());

		// Comprobar quien cobra mas y quien cobra menos
		double aux = Double.MIN_VALUE;
		double aux1 = Double.MAX_VALUE;
		int trabajadorMasTotal = 0;
		int trabajadorMenosTotal = 0;
		for (int i = 0; i < emp.length; i++) {

			double cobroTotal = emp[i].calculoSueldoTotal();

			// Para registrar el que mas cobra
			if (cobroTotal > aux) {
				aux = cobroTotal;
				trabajadorMasTotal = i;
			}
			// Para registrar el que menos cobra
			if (cobroTotal < aux1) {
				aux1 = cobroTotal;
				trabajadorMenosTotal = i;
			}
		}
		System.out.println("El empleado que más cobra es :\n" + emp[trabajadorMasTotal]);
		System.out.println("Cobra en total " + aux + " €\n");

		System.out.println("El empleado que menos cobra es :\n" + emp[trabajadorMenosTotal]);
		System.out.println("Cobra en total " + aux1 + " €\n");

		// Comprobar el que mas cobra por horas extra y el que menos
		int maxHoras = Integer.MIN_VALUE;
		int minHoras = Integer.MAX_VALUE;
		int trabajadorMasHorasExtras = 0;
		int trabajadorMenosHorasExtras = 0;

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getHoraExtra() > maxHoras) {
				maxHoras = emp[i].getHoraExtra();
				trabajadorMasHorasExtras = i;
			}
		}
		System.out.println("El empleado que mas horas extra trabaja es :\n" + emp[trabajadorMasHorasExtras]);
		System.out.println("En total trabaja " + maxHoras + " horas extra.\n");

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getHoraExtra() < minHoras) {
				minHoras = emp[i].getHoraExtra();
				trabajadorMenosHorasExtras = i;
			}
		}
		System.out.println("El empleado que menos horas extra trabaja es :\n" + emp[trabajadorMenosHorasExtras]);
		System.out.println("En total trabaja " + minHoras + " horas extra.\n");

		// Ahora vamos a ordenar los trabajadores segun su sueldo total, del que menos
		// al que mas

		// Creamos un objeto empleado auxiliar
		Empleado empAux = new Empleado();

		// Utilizamos el metodo de ordenacion Algoritmo de la burbuja
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - i - 1; j++) {
				if (emp[j + 1].calculoSueldoTotal() < emp[j].calculoSueldoTotal()) {
					empAux = emp[j + 1];
					emp[j + 1] = emp[j];
					emp[j] = empAux;
				}
			}
		}
		// Imprimimos el array una vez que esta ordenado por sueldo total
		System.out.println("TRABAJADORES ORDENADOS DE MENOR A MAYOR SUELDO TOTAL:");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
			System.out.println("Su sueldo total es " + emp[i].calculoSueldoTotal() + " €");
		}
	}
}
