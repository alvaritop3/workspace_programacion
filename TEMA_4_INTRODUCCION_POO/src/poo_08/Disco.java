package poo_08;

public class Disco {

	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

	// Constructor vacio
	public Disco() {
	}

	// Constructor por defecto
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	// Constructor copia
	public Disco(final Disco c) {

		codigo = c.codigo;
		autor = c.autor;
		titulo = c.titulo;
		genero = c.genero;
		duracion = c.duracion;
	}

	// Setters and Getters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// Metodo to String
	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nAutor: " + autor + "\nTitulo: " + titulo + "\nGenero: " + genero
				+ "\nDuracion: " + duracion + " minutos\n";
	}

}
