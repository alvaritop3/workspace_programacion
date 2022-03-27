package RELACION_04_1;

//Define un array de 12 n�meros enteros con nombre num y asigna los valores seg�n la tabla
//que se muestra a continuaci�n. Muestra el contenido de todos los elementos del array. �Qu�
//sucede con los valores de los elementos que no han sido inicializados?

public class ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[12];

		array[0] = 39;
		array[1] = -2;
		array[4] = 0;
		array[6] = 14;
		array[8] = 5;
		array[9] = 120;

		for (int i = 0; i < 12; i++) {
			System.out.print(array[i] + " ");
		}
		// Los valores de la array que no rellenamos aparecen con valor 0
	}

}
