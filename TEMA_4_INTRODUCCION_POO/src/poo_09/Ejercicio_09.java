package poo_09;

public class Ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza("margarita", "mediana");
		Pizza p2 = new Pizza("funghi", "familiar");
		p2.sirve();
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("Pedidas: " + Pizza.getTotalPedida());
		System.out.println("Servidas: " + Pizza.getTotalServida());

	}
}
