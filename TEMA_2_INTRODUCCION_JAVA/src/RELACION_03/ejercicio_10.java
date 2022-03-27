package RELACION_03;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				int num = (int) Math.floor(Math.random() * 94 + 32);
				char caracter = (char) num;
				System.out.print(caracter + " ");
			}
			System.out.println(" ");
		}
	}
}
