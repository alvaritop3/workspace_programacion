package trimestre_2_Java;

import java.util.Scanner;

public class Juego_tres_en_raya {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		// En primer lugar generamos el tablero
		int[] tablero = new int[9];
		int o1, o2, o3, x1, x2, x3;
		boolean repetirJuego = false;

		do {
			limpiarTablero(tablero);

			System.out.println("¡Juguemos al tres en raya!");
			// imprimimos el tablero
			imprimeTablero(tablero);
//PRIMERA JUGADA
			// pedimos posicion al usuario
			System.out.println("\nElige donde quieres colocar tu ficha");
			String posicionJug1 = sn.nextLine();

			if (usuarioMueveFicha(tablero, posicionJug1)) {
				o1 = conviertePosicionMovimiento(posicionJug1);
				tablero[o1] = 1;
			} else {
				System.out.println("No se puede colocar en esa posicion");
			}

			// el ordenador da una posicion
			x1 = mueveFichaAleatoria(tablero);
			if (x1 == -1) {
				System.out.println("No se ha podido colocar la ficha de la maquina.");
			} else {
				tablero[x1] = 2;
			}
			imprimeTablero(tablero);
//SEGUNDA JUGADA
			// pedimos posicion al usuario
			System.out.println("\nElige donde quieres colocar tu ficha");
			String posicionJug2 = sn.nextLine();

			if (usuarioMueveFicha(tablero, posicionJug2)) {
				o2 = conviertePosicionMovimiento(posicionJug2);
				tablero[o2] = 1;
			} else {
				System.out.println("No se puede colocar en esa posicion");
			}

			// el ordenador da una posicion
			x2 = mueveFichaAleatoria(tablero);
			if (x2 == -1) {
				System.out.println("No se ha podido colocar la ficha de la maquina.");
			} else {
				tablero[x2] = 2;
			}
			imprimeTablero(tablero);
//TERCERA JUGADA
			// pedimos posicion al usuario
			System.out.println("\nElige donde quieres colocar tu ficha");
			String posicionJug3 = sn.nextLine();

			if (usuarioMueveFicha(tablero, posicionJug3)) {
				o3 = conviertePosicionMovimiento(posicionJug3);
				tablero[o3] = 1;
			} else {
				System.out.println("No se puede colocar en esa posicion");
			}

			// el ordenador da una posicion
			x3 = mueveFichaAleatoria(tablero);
			if (x3 == -1) {
				System.out.println("No se ha podido colocar la ficha de la maquina.");
			} else {
				tablero[x3] = 2;
			}
			imprimeTablero(tablero);
			// comprobamos si gana el programa
			if (ganaPrograma(tablero)) {

				System.out.println("\nGana el Programa");
			}
			// comrpobamos si gana el usuario
			if (ganaUsuario(tablero)) {
				System.out.println("\nGana el Usuario");
			}

			System.out.println("¿Quieres jugar otra partida? Responde S o N");
			String respuesta = sn.nextLine();
			respuesta = respuesta.toUpperCase();
			if (respuesta.equals("S")) {
				repetirJuego = true;
			} else {
				repetirJuego = false;
			}

		} while (repetirJuego);

		System.out.println("Fin de Juego");
		sn.close();

	}

//metodo para mostrar tablero
	public static void imprimeTablero(int x[]) {
		for (int i = 0; i < 9; i++) {
			if (i == 3) {
				System.out.println(" ");
			}
			if (i == 6) {
				System.out.println(" ");
			}
			switch (x[i]) {
			case 0:
				System.out.printf("%3s", "-");
				break;
			case 1:
				System.out.printf("%3s", "O");
				break;
			case 2:
				System.out.printf("%3s", "X");
				break;

			default:
				break;
			}
		}
	}

	// metodo para mover ficha
	public static int mueveFichaAleatoria(int x[]) {
		int numAleat;
		boolean bienColocado = false;
		int contadorVeces = 0;
		do {
			numAleat = (int) Math.floor(Math.random() * 9);
			if (x[numAleat] == 0) {
				bienColocado = true;
			} else {
				contadorVeces++;
			}
		} while (!bienColocado || contadorVeces == 9);
		if (bienColocado) {
			return numAleat;
		} else {
			return -1;
		}
	}

	// metodo para transformar a posicion
	public static int conviertePosicionMovimiento(String x) {
		x = x.toUpperCase();
		int resultado = 0;

		switch (x) {
		case "ARRIBA IZQUIERDA":
			resultado = 0;
			break;
		case "ARRIBA CENTRO":
			resultado = 1;
			break;
		case "ARRIBA DERECHA":
			resultado = 2;
			break;
		case "CENTRO IZQUIERDA":
			resultado = 3;
			break;
		case "CENTRO CENTRO":
			resultado = 4;
			break;
		case "CENTRO DERECHA":
			resultado = 5;
			break;
		case "ABAJO IZQUIERDA":
			resultado = 6;
			break;
		case "ABAJO CENTRO":
			resultado = 7;
			break;
		case "ABAJO DERECHA":
			resultado = 8;
			break;
		default:
			resultado = -1;
			break;
		}
		return resultado;
	}

	public static boolean usuarioMueveFicha(int x[], String b) {
		int posicion = conviertePosicionMovimiento(b);

		if (x[posicion] != 0) {
			return false;
		} else {
			return true;
		}
	}

	// metodo para limpiar el tablero
	public static void limpiarTablero(int x[]) {
		for (int i = 0; i < 9; i++) {
			x[i] = 0;
		}
	}

	// metodo para comprobar si gana el programa
	// Lo he hecho de esta manera para el metodo compruebe de una manera mas eficaz
	public static boolean ganaPrograma(int x[]) {

		if (x[0] + x[1] + x[2] == 6) {
			return true;
		} else if (x[3] + x[4] + x[5] == 6) {
			return true;
		} else if (x[6] + x[7] + x[8] == 6) {
			return true;
		} else if (x[0] + x[3] + x[6] == 6) {
			return true;
		} else if (x[1] + x[4] + x[7] == 6) {
			return true;
		} else if (x[2] + x[5] + x[8] == 6) {
			return true;
		} else if (x[0] + x[4] + x[8] == 6) {
			return true;
		} else if (x[2] + x[4] + x[6] == 6) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ganaUsuario(int x[]) {

		if (x[0] + x[1] + x[2] == 3) {
			return true;
		} else if (x[3] + x[4] + x[5] == 3) {
			return true;
		} else if (x[6] + x[7] + x[8] == 3) {
			return true;
		} else if (x[0] + x[3] + x[6] == 3) {
			return true;
		} else if (x[1] + x[4] + x[7] == 3) {
			return true;
		} else if (x[2] + x[5] + x[8] == 3) {
			return true;
		} else if (x[0] + x[4] + x[8] == 3) {
			return true;
		} else if (x[2] + x[4] + x[6] == 3) {
			return true;
		} else {
			return false;
		}
	}
}
