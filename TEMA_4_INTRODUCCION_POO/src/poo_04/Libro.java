package poo_04;

public class Libro {

	//atributos encapsulados
	private String titulo;
	private String autor;
	private int numEjem;
	private int ejemPres;
	
	
	//constructor sin parametros
	public Libro() {
		
	}

	//constructor por defecto
	public Libro(String titulo, String autor, int numEjem, int ejemPres) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjem = numEjem;
		this.ejemPres = ejemPres;
	}

	//metodos setters/getters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjem() {
		return numEjem;
	}

	public void setNumEjem(int numEjem) {
		this.numEjem = numEjem;
	}

	public int getEjemPres() {
		return ejemPres;
	}

	public void setEjemPres(int ejemPres) {
		this.ejemPres = ejemPres;
	}
	
	//metodo prestamo
	public boolean prestamo() {
		if ((numEjem-ejemPres)<=0) {
			return false;
		}else {
			ejemPres++;
			return true;
		}
	}
	
	//metodo devolucion
	public boolean devolucion() {
		if (ejemPres<=0) {
			return false;
		}else {
			ejemPres--;
			return true;
		}
	}

	@Override
	public String toString() {
		return "Libro:\n-El Titulo es " + titulo + " \n-El autor es " + autor + "\n-El numero de ejemplar/es es/son " + numEjem + "\n-Los ejemplares prestados son/es " + ejemPres + ".";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
