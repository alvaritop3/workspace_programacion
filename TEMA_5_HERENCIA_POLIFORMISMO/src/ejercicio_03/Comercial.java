package ejercicio_03;

public class Comercial extends Empleados {

	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + "Comercial.\nComision: " + comision;
	}
	
	@Override
	public void plus() {

		if (edad > 30 && comision > 200) {
			salario = salario + plus;
		}
	}
}
