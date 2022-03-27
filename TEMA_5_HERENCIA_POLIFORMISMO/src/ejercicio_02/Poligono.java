package ejercicio_02;

public abstract class Poligono {

	//atributos
	protected int numeroLados;
	
	//Constructor por defecto
	public Poligono() {
		
	}
	
	//Constructor con parametros
	public Poligono(int numerolados) {
		this.numeroLados = numerolados;
	}
	
	//Getters and Setters
	public int getNumerolados() {
		return numeroLados;
	}

	public void setNumerolados(int numerolados) {
		this.numeroLados = numerolados;
	}

	//Metodo to String
	@Override
	public String toString() {
		return "Numero de lados: " + numeroLados;
	}
	
	public abstract double area();
	
}
