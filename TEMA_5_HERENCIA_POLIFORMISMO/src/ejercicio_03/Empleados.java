package ejercicio_03;

public abstract class Empleados {

	protected String nombre;
	protected int edad;
	protected double salario;
	protected final int plus = 300;

	// Constructor
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "\nEmpleado \nNombre: " + nombre + "\nEdad: " + edad + "\nSalario: " + salario + "€\n";
	}
	public abstract void plus();
		
	
}
