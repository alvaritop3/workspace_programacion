package poo_07;

public class Empleado {

	// Atributos encapsulados

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horaExtra;
	private double irpf;
	private boolean casado;
	private int numeroHijos;
	static double impExtra;

	// Constructor vacio

	public Empleado() {

	}

	// Constructor por defecto
	public Empleado(String nif, String nombre, double sueldoBase, int horaExtra, double tipoIrpf, boolean casado,
			int numeroHijos) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horaExtra = horaExtra;
		this.irpf = tipoIrpf;
		this.casado = casado;
		this.numeroHijos = numeroHijos;
	}

	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	// Metodos getter and setters
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double tipoIrpf) {
		this.irpf = tipoIrpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public static double getImpExtra() {
		return impExtra;
	}

	public static void setImpExtra(double impExtra) {
		Empleado.impExtra = impExtra;
	}

	// Metodos

	public double calculoComplemento() {
		return horaExtra * impExtra;
	}

	public double calculoBruto() {
		return sueldoBase + calculoComplemento();
	}

	public double calculoIrpf() {
		double resultado = irpf;
		if (casado) {
			resultado = resultado - 2;
		}
		resultado = resultado - numeroHijos;

		return resultado;
	}
	
	public double calculoSueldoTotal() {
			return calculoBruto() - ((calculoIrpf() / 100) * calculoBruto());
	}
	
	// metodo to string
	@Override
	public String toString() {
		if (casado) {
			return nif + " " + nombre + "\nSueldoBase: " + sueldoBase + "€" + "\nHoras extra: " + horaExtra + "horas "
					+ "\nTipo Irpf: " + irpf + "% \nCalculo Irpf final: "+calculoIrpf()+" % \nCasado: Si\nNumero de hijos: " + numeroHijos + " hijos\n";
		} else {
			return nif + " " + nombre + "\nSueldoBase: " + sueldoBase + "€" + "\nHoras extra: " + horaExtra
					+ "horas \nTipo Irpf: " + irpf +"% \nCalculo Irpf final: "+calculoIrpf()+" % \nCasado: No\nNumero de hijos: " + numeroHijos + " hijos\n";
		}
	}

	

}
