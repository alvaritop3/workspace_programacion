package ejercicio_03;

public class Repartidor extends Empleados {

	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + "Repartidor.\nZona: " + zona+"\n";
	}
	
	@Override
	public void plus() {

		if (edad < 25 && zona == "3") {
			salario = salario + plus;

		}

	}

}
