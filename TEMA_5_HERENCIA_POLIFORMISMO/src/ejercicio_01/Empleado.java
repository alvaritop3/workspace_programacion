package ejercicio_01;

public class Empleado {

	// Atributos encapsulados
	private String nombre;

	// Constructor por defecto
	public Empleado() {

	}

	// Constructor con parametro
	public Empleado(String nombre) {

		this.nombre = nombre;
	}

	// Setter and getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodo to String
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
