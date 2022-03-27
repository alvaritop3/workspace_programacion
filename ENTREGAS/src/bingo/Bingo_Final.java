package bingo;

import java.util.Scanner;

public class Bingo_Final {

	public static void presentacion() {
		System.out.println(" -----------");
		System.out.println("| B I N G O |");
		System.out.println(" -----------");
		System.out.println("PREMIOS");
		System.out.println("LINEA 100$");
		System.out.println("BINGO 500$");
		System.out.println(" ");
	}

	public static int dameBola() {

		int bola = (int) Math.floor((Math.random() * 49 + 1));
		System.out.println("**Ha salido la bola " + bola + "**");
		System.out.println(" ");
		return bola;
	}

	public static void main(String[] args) { // INICIAMOS EL PROGRAMA

		Scanner sn = new Scanner(System.in);
		int dinero1 = 0;
		int dinero2 = 0;
		boolean haylinea = false;
		
//presentamos el juego
		presentacion();

// declaramos la matriz del carton 1

		int[][] carton1 = new int[3][5];

// rellenamos el primer carton
		int imp1 = 1;
		for (int col = 0; col <= 4; col++) {
			for (int fil = 0; fil <= 2; fil++) {
				int valorEntero = (int) Math.floor((Math.random() * 9 + imp1));
				carton1[fil][col] = valorEntero;
			}
			imp1 = imp1 + 10;
		}
		
// declaramos la matriz del carton 2
		int[][] carton2 = new int[3][5];
		
// rellenamos el segundo carton
		int imp2 = 1;
		for (int col = 0; col <= 4; col++) {
			for (int fil = 0; fil <= 2; fil++) {
				int valorEntero = (int) Math.floor(Math.random() * 9 + imp2);
				carton2[fil][col] = valorEntero;
			}
			imp2 = imp2 + 10;
		}
		
// Ya tenemos los dos cartones rellenos
// Mostramos el carton del jugador 1

		System.out.println("    -----------");
		System.out.println("   | JUGADOR 1 |");
		System.out.println("    -----------");

		for (int fil = 0; fil < 3; fil++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("|"+carton1[fil][col] + " ");
			}
			System.out.print("|");
			System.out.println(" ");
		}
// Mostramos el carton del jugador 2
		System.out.println("    -----------");
		System.out.println("   | JUGADOR 2 |");
		System.out.println("    -----------");

		for (int fil = 0; fil < 3; fil++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("|"+carton2[fil][col] + " ");
			}
			System.out.print("|");
			System.out.println(" ");
		}
		System.out.println(" ");

// creamos el bucle para que se repita la acción

		boolean ganador1 = false;
		boolean ganador2 = false;

		do {
			System.out.println(" ");
			System.out.print("Introduce cualquier caracter, número o letra para sacar la bola:");
			String cadena = sn.next();
			System.out.println(" ");

// sacamos la bola aleatoria entre 1 y 100

			int bola = dameBola();

// imprimimos el carton 1 con las casillas marcadas con X si coincide con la bola
			
			System.out.println(" -----------");
			System.out.println("| JUGADOR 1 |");
			System.out.println(" -----------");
			for (int fil = 0; fil < 3; fil++) {
				for (int col = 0; col < 5; col++) {
					if (carton1[fil][col] == bola) {
						carton1[fil][col] = 0;
						System.out.print("| X ");
					} else {
						if (carton1[fil][col] == 0) {
							System.out.print("| X ");
						} else {
							System.out.print("|"+carton1[fil][col] + " ");
						}
					}
				}
				System.out.print("|");
				System.out.println(" ");
			}
			System.out.println(" ");

// imprimimos el carton 2 con las casillas marcadas con X si coincide con la bola
			
			System.out.println(" -----------");
			System.out.println("| JUGADOR 2 |");
			System.out.println(" -----------");
			for (int fil = 0; fil < 3; fil++) {
				for (int col = 0; col < 5; col++) {
					if (carton2[fil][col] == bola) {
						carton2[fil][col] = 0;
						System.out.print("| X ");
					} else {
						if (carton2[fil][col] == 0) {
							System.out.print("| X ");
						} else {
							System.out.print("|"+carton2[fil][col] + " ");
						}
					}
				}
				System.out.print("|");
				System.out.println(" ");
			}
// comprobamos si el carton 1 tiene fila

			if (!haylinea) {
				for (int fil = 0; fil < 3; fil++) {
					int sumalinea = 0;
					for (int col = 0; col < 5; col++) {
						if (carton1[fil][col] == 0) {
							sumalinea = sumalinea + 1;
						}
					}
					if (sumalinea == 5) {
						haylinea = true;
						dinero1 = dinero1 + 100;
						System.out.println("¡El jugador 1 ha conseguido línea!");
					}
				}
			}

// comprobamos si el carton 2 tiene fila
			
			if (!haylinea) {
				for (int fil = 0; fil < 3; fil++) {
					int sumalinea = 0;
					for (int col = 0; col < 5; col++) {
						if (carton2[fil][col] == 0) {
							sumalinea = sumalinea + 1;
						}
					}
					if (sumalinea == 5) {
						haylinea = true;
						dinero2 = dinero2 + 100;
						System.out.println("¡El jugador 2 ha conseguido línea!");
					}
				}
			}

// mostramos el dinero acumulado de cada jugador

			System.out.println(" ");
			System.out.println(" ----------------");
			System.out.println("|Dinero acumulado|");
			System.out.println(" ----------------");
			System.out.println("- Jugador 1: " + dinero1 + " $");
			System.out.println("- Jugador 2: " + dinero2 + " $");

// comprobamos si el carton 1 tiene bingo para salir del bucle

			int bingo1 = 0;
			for (int fil = 0; fil < 3; fil++) {
				for (int col = 0; col < 5; col++) {
					if (carton1[fil][col] == 0) {
						bingo1 = bingo1 + 1;
					}
				}

			}
// el contador bingo1, al llegar a 15 quiere decir que todas las casillas han
// salido en las bolas del carton 1

			if (bingo1 == 15) {
				ganador1 = true;
			}

// comprobamos si el carton 2 tiene bingo para salir del bucle

			int bingo2 = 0;
			for (int fil = 0; fil < 3; fil++) {
				for (int col = 0; col < 5; col++) {
					if (carton2[fil][col] == 0) {
						bingo2 = bingo2 + 1;
					}
				}

			}
// el contador bingo2, al llegar a 15 quiere decir que todas las casillas han
			// salido en las bolas del carton 2

			if (bingo2 == 15) {
				ganador2 = true;
			}

		} while ((!ganador1) && (!ganador2));

// anunciamos el ganador

		if (ganador1) {
			System.out.println("¡¡TENEMOS GANADOR!!ENHORABUENA JUGADOR 1");
			dinero1 = dinero1 + 500;
		} else {
			System.out.println("¡¡TENEMOS GANADOR!!ENHORABUENA JUGADOR 2");
			dinero2 = dinero2 + 500;
		}

		System.out.println(" ");
		System.out.println(" ----------------");
		System.out.println("|Dinero acumulado|");
		System.out.println(" ----------------");
		System.out.println("- Jugador 1: " + dinero1 + " $");
		System.out.println("- Jugador 2: " + dinero2 + " $");
		System.out.println(" ");

		sn.close();

	}

}
