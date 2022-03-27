package RELACION_03;

public class ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;

		for (int i = 0; i < 20; i++) {
			int azar = (int) Math.floor(Math.random() * 9 + 1);

			switch (azar) {
			case 1:
				suspenso = suspenso + 1;
				break;
			case 2:
				suspenso = suspenso + 1;
				break;
			case 3:
				suspenso = suspenso + 1;
				break;
			case 4:
				suspenso = suspenso + 1;
				break;
			case 5:
				suficiente = suficiente + 1;
				break;
			case 6:
				bien = bien + 1;
				break;
			case 7:
				notable = notable + 1;
				break;
			case 8:
				notable = notable + 1;
				break;
			case 9:
				sobresaliente = sobresaliente + 1;
				break;
			case 10:
				sobresaliente = sobresaliente + 1;
				break;
			}
		}
		System.out.println("En total ha habido " + suspenso + " suspensos, " + suficiente + " sufiecientes, " + bien
				+ " bien, " + notable + " notables y " + sobresaliente + " sobresalientes.");
	}

}
