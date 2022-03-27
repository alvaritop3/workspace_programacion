package RELACION_06;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Introduce una frase:");
		String frase = sn.nextLine();
		
		//Hacemos un contador de espacios
		int contEsp=0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)==' ') {
				contEsp++;
			}
		}
		System.out.println("La frase tiene "+contEsp+" espacios.");
		
		sn.close();
	}

}
