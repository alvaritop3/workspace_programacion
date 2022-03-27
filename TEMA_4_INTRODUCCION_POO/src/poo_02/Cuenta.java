package poo_02;



public class Cuenta {

	private String nombre_cliente;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo;

	// Constructor sin parametros
	public Cuenta() {

	}

	// Constructor con parametros (los pedimos por teclado)
	public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}

	// GETTER generado automaticamente con click derecho, source>generate setters
	// and getters)
	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public double getTipo_interes() {
		return tipo_interes;
	}

	public double getSaldo() {
		return saldo;
	}

	// SETTER generado automaticamente
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// SETTER
	public void cambia_nombre() {
		nombre_cliente = "Manolo";
	}

	// GETTER
	public String dime_nombre() {
		return "El nombre del cliente es " + nombre_cliente;
	}

	// metodo de ingreso
	public boolean ingreso(double cantidad) {

		if (cantidad >= 0) {
			saldo = saldo + cantidad;
			return true;
		} else {
			return false;
		}
	}

	// metodo de reintegro

	public boolean reintegro(double cantidad) {

		if (cantidad >= 0 && cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		} else {
			return false;
		}

	}

	// metodo de transferencia

	public boolean transferencia(Cuenta x, double importe) {

		if (reintegro(importe)) {
			x.ingreso(importe);
			return true;
		} else {
			System.out.println("No se ha podido hacer la transferencia");
			return false;
		}

	}

	// metodo para mostrar los datos de la cuenta

	public void muestraDatos() {
		System.out.println("Datos de la CUENTA : ");
		System.out.println("---------");
		System.out.println("Nombre: " + nombre_cliente);
		System.out.println("Numero cuenta: " + numero_cuenta);
		System.out.println("Tipo interes: " + tipo_interes);
		System.out.println("Saldo: " + saldo);
		System.out.println(" ");
	}

	@Override
	public String toString() {
		return "Cuenta [nombre_cliente=" + nombre_cliente + ", numero_cuenta=" + numero_cuenta + ", tipo_interes="
				+ tipo_interes + ", saldo=" + saldo + "]";
	}

}
