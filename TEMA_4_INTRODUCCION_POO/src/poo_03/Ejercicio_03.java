package poo_03;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilizamos el contador por defecto
		Contador contador1 = new Contador();
		// Asignamos un valor al contador
		System.out.println("Vamos a asignarle un valor al contador ");
		contador1.setCont(5);
		System.out.println("El valor del contador es " + contador1.getCont());
		// Incrementamos el contador
		System.out.println("Ahora vamos a incrementar en uno el contador");
		contador1.incrementar();
		System.out.println("El valor del contador incrementado en uno es " + contador1.getCont());

		// Incrementamos dos veces el contador
		System.out.println("Ahora vamos a incrementar dos veces el contador");

		contador1.incrementar();
		contador1.incrementar();
		// contador1.incrementar2(2);

		System.out.println("El valor del contador incrementado en dos es " + contador1.getCont());
		System.out.println("Ahora vamos a restarle 1 al valor del contador");
		contador1.decrementa();
		System.out.println("El valor del contador tras restarle uno es " + contador1.getCont());

		// Creamos nuevo objeto contador con valor inicial 10
		Contador contador2 = new Contador(10);
		System.out.println("El segundo contador tiene un valor de " + contador2.getCont());
		// incrementamos y decrementamos el contador2
		contador2.incrementar();
		contador2.decrementa();
		System.out.println("Una vez incrementado y decrementado el valor es " + contador2.getCont());

		// Creamos un nuevo objeto contador utilizando el constructor COPIA
		Contador contador3 = new Contador(contador2);
		System.out.println("El valor del nuevo contador 3 (copia del contador 2) es " + contador3.getCont());

	}

}
