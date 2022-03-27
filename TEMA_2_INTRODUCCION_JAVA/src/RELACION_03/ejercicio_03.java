package RELACION_03;

//Igual que el ejercicio anterior pero con la baraja espa�ola. Se utilizar� la baraja de 40 cartas:
//2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
import java.util.Scanner;

public class ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		System.out.print("Introduce cualquier caracter para darte una carta aleatoria de la baraja espa�ola.");
		String cadena = sn.next();

		System.out.print("Ha salido el/la ");
		int carta = (int) Math.floor(Math.random() * 10 + 1);
		switch (carta) {
		case 1:
			System.out.print("As ");
			break;
		case 2:
			System.out.print("2 ");
			break;
		case 3:
			System.out.print("3 ");
			break;
		case 4:
			System.out.print("4 ");
			break;
		case 5:
			System.out.print("5  ");
			break;
		case 6:
			System.out.print("6 ");
			break;
		case 7:
			System.out.print("7 ");
			break;
		case 8:
			System.out.print("Sota ");
			break;
		case 9:
			System.out.print("Caballo ");
			break;
		case 10:
			System.out.print("Rey ");
			break;

		}

		System.out.print("de ");

		int palo = (int) Math.floor(Math.random() * 4 + 1);

		switch (palo) {
		case 1:
			System.out.print("Oro");
			break;
		case 2:
			System.out.print("Espadas ");
			break;
		case 3:
			System.out.print("Bastos ");
			break;
		case 4:
			System.out.print("Copas ");
			break;
		}
		sn.close();
	}

}
