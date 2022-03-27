package poo_05;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// se crean 4 fracciones
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);
		Fraccion f3 = new Fraccion();
		Fraccion f4 = new Fraccion(4);

		// pruebas de los metodos
//		System.out.println("Vamos a sumar f1 + f2");
//		System.out.println(f1.sumar(f2));
//		
//		System.out.println("Vamos a restar f2-f1");
//		System.out.println(f2.restar(f1));
//		
//		System.out.println("Vamos a multiplicar f1*f2");
//		System.out.println(f1.multiplicar(f2));
//		
//		System.out.println("Vamos a dividir f2/f1");
//		System.out.println(f2.dividir(f1));

		// operaciones aritmeticas con estas fracciones
		Fraccion suma = f1.sumar(f2);
		Fraccion resta = f1.restar(f3);
		Fraccion producto = f1.multiplicar(f4);
		Fraccion cociente = f1.dividir(f2);

		// mostramos los resultados
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + producto);
		System.out.println(f1 + " / " + f2 + " = " + cociente);
		System.out.println(" ");
		
		Fraccion prueba= new Fraccion(10,20);
		System.out.println(prueba);

	
	}

}
