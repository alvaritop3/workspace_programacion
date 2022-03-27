package hundir_la_flota;

import java.util.Scanner;

public class hundir_final {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		boolean ganaJug = false;
		boolean ganaComp = false;
		int puntosComp;
		int puntosJug;

		// en primer lugar generamos los tableros
		int[][] tableroComp = generaTablero();
		int[][] tableroJug = generaTablero();

		bienvenida();

		// ordenador rellena con portaaviones
		rellenaTablero(tableroComp, 5, 2);
		// ordenador rellena acorazados
		rellenaTablero(tableroComp, 3, 3);
		// ordenador rellena con submarinos
		rellenaTablero(tableroComp, 1, 5);

		// mostramos el tablero relleno
		System.out.println("REGISTRO DEL MAPA DEL ORDENADOR\n");

		// Nos muestra el registro del tablero del ordenador
		muestraRegistro(tableroComp);
		puntosComp = puntos(tableroComp);
		System.out.println("PUNTOS RESTANTES DEL ORDENADOR: " + puntosComp);
		System.out.println(" ");

		// rellenamos el tablero del jugador manualmente
		for (int i = 0; i < 10; i++) {
			System.out.print("Dime coordenadas para colocar tus *portaaviones*:\n");
			String coordenadaJug = sn.next();
			rellenaUsuario(coordenadaJug, tableroJug, 5);
			System.out.println("MAPA DEL USUARIO");
			muestraTablero(tableroJug);
			System.out.println(" ");
		}
		for (int i = 0; i < 9; i++) {
			System.out.print("Dime coordenadas para colocar tus *acorazados*:\n");
			String coordenadaJug = sn.next();
			rellenaUsuario(coordenadaJug, tableroJug, 3);
			System.out.println("MAPA DEL USUARIO");
			muestraTablero(tableroJug);
			System.out.println(" ");
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("Dime coordenadas para colocar tus *submarinos*:\n");
			String coordenadaJug = sn.next();
			rellenaUsuario(coordenadaJug, tableroJug, 1);
			System.out.println("MAPA DEL USUARIO");
			muestraTablero(tableroJug);
			System.out.println(" ");
		}
		puntosJug = puntos(tableroJug);
		System.out.println("PUNTOS RESTANTES DEL JUGADOR: " + puntosJug);

		// Ahora comenzar�a el juego

		do {
			System.out.println("\nTURNO DEL JUGADOR");
			System.out.print("Introduzca la casilla (por ejemplo b4): ");
			String ataqueJug = sn.next();
			comprobacionAtaque(ataqueJug, tableroComp);

			System.out.println("REGISTRO DEL MAPA DEL ORDENADOR:");
			muestraRegistro(tableroComp);
			puntosComp = puntos(tableroComp);
			System.out.println("Puntos restantes del ordenador: " + puntosComp);
			System.out.println(" ");

			System.out.println("TURNO DEL ORDENADOR.");
			generaAtaque(tableroJug);
			System.out.println("MAPA DEL USUARIO.");
			muestraTablero(tableroJug);
			puntosJug = puntos(tableroJug);
			System.out.println("Puntos restantes del jugador: " + puntosJug);

			// condicion de victoria
			if (puntosComp == 0) {
				ganaJug = true;
			}
			if (puntosJug == 0) {
				ganaComp = true;
			}
		} while (!ganaJug && !ganaComp);

		if (ganaJug) {
			System.out.println("Enhorabuena, el jugador ha ganado la partida.");
		} else {
			System.out.println("Mala suerte, ha ganado el ordenador, la proxima vez sera.");
		}
		System.out.println("El juego ha finalizado.");

		sn.close();
		// FIN DE MAIN
	}

	// metodo para generar numeros aleatorios entre un maximo (excluido) y un minimo
	// (incluido)
	public static int randomizer(int max, int min) {

		int resultado = (int) Math.floor(Math.random() * (max - min)) + min;
		return resultado;
	}

	// metodo para generar tablero con un array bidimensional de 10x10
	public static int[][] generaTablero() {
		int[][] x = new int[10][10];

		return x;
	}

	// metodo de bienvenida al juego
	public static void bienvenida() {
		System.out.println(" -------------------------------");
		System.out.println("| H U N D I R   L A   F L O T A |");
		System.out.println(" -------------------------------");
		System.out.println("Funcionamiento del juego:");
		System.out.println("-En primer lugar el Ordenador rellenar� su tablero aleatoriamente.");
		System.out.println(
				"-En segundo lugar, le pediremos las coordenadas para colocar sus barcos (portaaviones, acorazados y submarinos).");
		System.out.println(
				"-Comenzar� el juego diciendo unas coordenadas de ataque, en caso de no acertar, aparecer� un mensaje de 'Agua', en caso de impactar, un mensaje 'Tocado'.");
		System.out.println(
				"-Cada uno dispondr� al comienzo de 24 puntos, ganar� el que hunda todos los barcos del contrario.\n");
	}

	// con esta funcion rellenamos el tablero con todos los barcos,
	// las variables son: matriz a rellenar, el numero de casillas que ocupa el
	// barco y el numero de veces que queremos que se genere
	public static void rellenaTablero(int x[][], int barco, int veces) {

		int cuantasVeces = 0;

		do {
			// creamos una variable para que aleatoriamente decida si se coloca en
			// horizontal o en vertical
			// si genera un 0, se colocara en horizontal, si genera un 1 se colocara en
			// vertical
			int horVer = randomizer(2, 0);

			if (horVer == 0) {
				// hara esto si sale que se generen de forma horizontal
				int filRan = 0;
				int colRan = 0;
				boolean bienColocado = false;

				do {
					filRan = randomizer(10, 0);
					colRan = randomizer((11 - barco), 0);
					int cont = 0;
					for (int i = colRan; i < colRan + barco; i++) {
						if (x[filRan][i] != 0) {
							cont++;
						}
					}
					if (cont == 0) {
						bienColocado = true;
					}
				} while (!bienColocado);
				// cuando comprobamos que las casillas estan vacias, cambiamos el valor
				for (int i = colRan; i < colRan + barco; i++) {
					x[filRan][i] = barco;
				}
			} else {
				// esto es lo que har� si el resultado es 1, colocar� el barco en vertical
				int filRan = 0;
				int colRan = 0;
				boolean bienColocado = false;

				do {
					filRan = randomizer((barco + 1), 0);
					colRan = randomizer(10, 0);
					int cont = 0;
					for (int i = filRan; i < filRan + barco; i++) {
						if (x[i][colRan] != 0) {
							cont++;
						}
					}
					if (cont == 0) {
						bienColocado = true;
					}
				} while (!bienColocado);
				// cuando comprobamos que las casillas estan vacias, cambiamos el valor
				for (int i = filRan; i < filRan + barco; i++) {
					x[i][colRan] = barco;
				}
			}
			cuantasVeces++;
		} while (cuantasVeces < veces);

	}

	// metodo para mostrar el registro de impactos que hemos hecho sobre el tablero
	// del ordenador
	public static void muestraRegistro(int x[][]) {
		// con esto mostramos el indice de arriba horizontal
		System.out.print("    ");
		for (int col = 0; col < 10; col++) {
			System.out.print("[" + col + "]");
		}
		System.out.println("  ");
		// con esto mostramos el indice lateral
		for (int fil = 0; fil < 10; fil++) {

			switch (fil) {
			case 0:
				System.out.print("[A]|");
				break;
			case 1:
				System.out.print("[B]|");
				break;
			case 2:
				System.out.print("[C]|");
				break;
			case 3:
				System.out.print("[D]|");
				break;
			case 4:
				System.out.print("[E]|");
				break;
			case 5:
				System.out.print("[F]|");
				break;
			case 6:
				System.out.print("[G]|");
				break;
			case 7:
				System.out.print("[H]|");
				break;
			case 8:
				System.out.print("[I]|");
				break;
			case 9:
				System.out.print("[J]|");
				break;
			default:
			}
			// pintamos una T cuando es tocado
			// pintamos una A cuando es agua
			// pintamos . cuando hay agua o un barco del ordenador
			for (int col = 0; col < 10; col++) {
				if (x[fil][col] == 0) {
					System.out.print(" . ");
				} else if (x[fil][col] == 8) {
					System.out.print(" T ");
				} else if (x[fil][col] == 9) {
					System.out.print(" A ");
				} else {
					System.out.print(" . ");
				}
			}
			System.out.println(" ");
		}
	}

//metodo para contar los puntos
	public static int puntos(int x[][]) {
		int cont = 24;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] == 8) {
					cont--;
				}
			}
		}
		return cont;
	}

	// con esta funcion rellenamos con las coordenadas que nos
	// dice el tablero de usuario con cada tipo de barco
	public static void rellenaUsuario(String x, int e[][], int b) {
		int coordY = CoordY(x);
		int coordX = CoordX(x);
		e[coordY][coordX] = b;
	}

	// metodo para mostrar los valores del array
	public static void muestraTablero(int x[][]) {
		// con esto mostramos el indice de arriba horizontal
		System.out.print("    ");
		for (int col = 0; col < 10; col++) {
			System.out.print("[" + col + "]");
		}
		System.out.println("  ");
		// con esto mostramos el indice lateral
		for (int fil = 0; fil < 10; fil++) {
			switch (fil) {
			case 0:
				System.out.print("[A]|");
				break;
			case 1:
				System.out.print("[B]|");
				break;
			case 2:
				System.out.print("[C]|");
				break;
			case 3:
				System.out.print("[D]|");
				break;
			case 4:
				System.out.print("[E]|");
				break;
			case 5:
				System.out.print("[F]|");
				break;
			case 6:
				System.out.print("[G]|");
				break;
			case 7:
				System.out.print("[H]|");
				break;
			case 8:
				System.out.print("[I]|");
				break;
			case 9:
				System.out.print("[J]|");
				break;
			default:
			}
			// pintamos una T cuando es tocado
			// pintamos una A cuando es agua
			for (int col = 0; col < 10; col++) {
				if (x[fil][col] == 0) {
					System.out.print(" . ");
				} else if (x[fil][col] == 8) {
					System.out.print(" T ");
				} else if (x[fil][col] == 9) {
					System.out.print(" A ");
				} else {
					System.out.print(" " + x[fil][col] + " ");
				}
			}
			System.out.println(" ");
		}
	}

	// Con esta funcion extraemos la coordenada X que el usuario introduce
	public static int CoordX(String x) {

		int coordX = 0;
		// Pasamos la respuesta a may�sculas
		x = x.toUpperCase();
		// Seleccionamos la segunda posicion de la cadena
		char num = x.charAt(1);
		switch (num) {
		case '0':
			coordX = 0;
			break;
		case '1':
			coordX = 1;
			break;
		case '2':
			coordX = 2;
			break;
		case '3':
			coordX = 3;
			break;
		case '4':
			coordX = 4;
			break;
		case '5':
			coordX = 5;
			break;
		case '6':
			coordX = 6;
			break;
		case '7':
			coordX = 7;
			break;
		case '8':
			coordX = 8;
			break;
		case '9':
			coordX = 9;
			break;
		default:
			break;
		}
		return coordX;
	}

	// Con esta funcion extraemos la coordenada Y que el usuario introduce
	public static int CoordY(String x) {

		int coordY = 0;
		// Pasamos la respuesta a may�sculas
		x = x.toUpperCase();
		// Seleccionamos la primera posicion de la cadena
		char letra = x.charAt(0);
		switch (letra) {
		case 'A':
			coordY = 0;
			break;
		case 'B':
			coordY = 1;
			break;
		case 'C':
			coordY = 2;
			break;
		case 'D':
			coordY = 3;
			break;
		case 'E':
			coordY = 4;
			break;
		case 'F':
			coordY = 5;
			break;
		case 'G':
			coordY = 6;
			break;
		case 'H':
			coordY = 7;
			break;
		case 'I':
			coordY = 8;
			break;
		case 'J':
			coordY = 9;
			break;

		default:
			break;
		}
		return coordY;
	}

	// con este metodo comprobamos si el ataque ha sido exitoso
	public static void comprobacionAtaque(String x, int t[][]) {

		int ataqueY = CoordY(x);
		int ataqueX = CoordX(x);

		if (t[ataqueY][ataqueX] == 0) {
			System.out.println("AGUA");
			// Los ataques a casillas con agua, cambiaran el valor de 0 a 9
			t[ataqueY][ataqueX] = 9;
		} else {
			System.out.println("HAS ALCANZADO ALGUN BARCO");
			// los ataques que impacten contra un barco cambiaran el valor del barco a 8
			t[ataqueY][ataqueX] = 8;
		}
	}

	// con este metodo generamos las coordenadas para que el ordenador ataque y
	// compruebe
	public static void generaAtaque(int t[][]) {

		int ataqueY = randomizer(10, 0);
		int ataqueX = randomizer(10, 0);

		if (t[ataqueY][ataqueX] == 0) {
			System.out.println("AGUA");
			t[ataqueY][ataqueX] = 9;
		} else {
			System.out.println("TE HA ALCANZADO UN BARCO");
			t[ataqueY][ataqueX] = 8;
		}
	}

}
