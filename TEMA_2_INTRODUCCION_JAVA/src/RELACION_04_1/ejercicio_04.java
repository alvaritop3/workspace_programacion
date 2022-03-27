package RELACION_04_1;

public class ejercicio_04 {

	public static void main(String[] args) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) Math.floor(Math.random() * 99 + 1);
		}

		for (int i = 0; i < 20; i++) {
			cuadrado[i] = numero[i] * numero[i];
		}

		for (int i = 0; i < 20; i++) {
			cubo[i] = numero[i] * cuadrado[i];
		}

		System.out.println(" NUmero  Cuadrado    Cubo");
		System.out.println("--------------------------");
		for (int j = 0; j < 20; j++) {
			System.out.printf("%5d %7d %11d", numero[j], cuadrado[j], cubo[j]);
			System.out.println(" ");

		}

	}

}
