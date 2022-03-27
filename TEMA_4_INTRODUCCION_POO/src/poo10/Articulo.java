package poo10;

public class Articulo {
	// Atributos encapsulados

	private String codigo = "LIBRE";
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	// Constructor vacio
	public Articulo() {

	}

	// Constructor por vacio
	public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;

	}

	// metodos setters and getters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "\n Articulo: \nCodigo: " + codigo + "\nDescripcion: " + descripcion + ".\nPrecioCompra: " + precioCompra
				+ " €\nPrecioVenta: " + precioVenta + " €\nStock: " + stock + " unidades.";
	}

}
