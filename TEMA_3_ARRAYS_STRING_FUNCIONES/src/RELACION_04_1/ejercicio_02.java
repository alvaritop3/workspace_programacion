package RELACION_04_1;

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] simbolo = new char[10];

		simbolo[0] = 'a';
		simbolo[2] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';

		for (int i = 0; i < 10; i++) {
			System.out.print(simbolo[i] + " ");
		}

		// donde no hay valores pinta espacios
	}

}
