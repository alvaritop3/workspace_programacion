package ejercicio_02;

public class Rectangulo extends Poligono{
	
	//atributos encapsulados
	private double lado1;
	private double lado2;
	
	//constructor por defecto 
	public Rectangulo() {	
	}
	//Constructor con parametros
	public Rectangulo(double lado1, double lado2) {
		super(2);		//Con esto le decimos que tiene 2 numero de lados
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Metodo para calcular el area de los rectangulos
	public double area() {
		
		double resultado=lado1*lado2;
		
		return resultado;
	}
	
	//getters and setters
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Rectangulo: \n"+super.toString()+"\nLado 1-> " + lado1 + "\nLado 2-> " + lado2+"\n";
	}
	
	
	
	
}
