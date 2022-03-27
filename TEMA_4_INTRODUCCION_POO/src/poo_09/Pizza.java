package poo_09;

public class Pizza {
//Atributos encapsulados
	private String tamano;
	private String tipo;
	private String estado;
	static int totalPedida;
	static int totalServida;

	// Constructor vacio

	public Pizza() {

	}

	// Constructor por defecto
	public Pizza(String tipo, String tamano) {
		super();
		this.tamano = tamano;
		this.tipo = tipo;
		estado = "pedida";
		totalPedida++;
	}

	// metodos setter and getter

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getTotalPedida() {
		return totalPedida;
	}

	public static void setTotalPedida(int totalPedida) {
		Pizza.totalPedida = totalPedida;
	}

	public static int getTotalServida() {
		return totalServida;
	}

	public static void setTotalServida(int totalServida) {
		Pizza.totalServida = totalServida;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamano + "," + estado + ".";
	}

	public void sirve() {
		if (estado.equals("servida")) {
			System.out.println("Esa pizza ya se ha servido.");
		}else {
			estado="servida";
			totalServida++;
			
		}
		//cuando se hace, el estado es "servida"
	}

}
