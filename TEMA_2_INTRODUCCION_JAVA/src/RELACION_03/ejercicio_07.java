package RELACION_03;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("El programa va a generar n�meros aleatorios hasta que salga el 24.");

		boolean finprograma = false;
		int contador = 1;

		do {
			int azar = (int) Math.floor(Math.random() * 51) * 2;

			if (azar == 24) {
				finprograma = true;
			} else {
				contador = contador + 1;
			}

		} while (!finprograma);
		System.out.println("El programa ha encontrado el numero 24 y ha necesitado " + contador + " intentos");
	}

}
