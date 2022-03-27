package RELACION_04_2;

public class Ejercicio_01 {
	public static void main(String[] args) {
		int [][] num= new int [3][6];
		
		num[0][0]=0;
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		
		for (int fil = 0; fil < 3; fil++) {
			for (int col = 0; col < 6; col++) {
				System.out.print("|"+num[fil][col]+" ");
			}
			System.out.print("|");
			System.out.println(" ");
		}
	}
}
