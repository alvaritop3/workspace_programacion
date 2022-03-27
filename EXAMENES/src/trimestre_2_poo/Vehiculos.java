package trimestre_2_poo;



public class Vehiculos {

	// Atributos encapsulados
	private String marca;
	private String matricula;
	private int kilometros;
	private Fecha fechaMat;
	private String descripcion;
	private double precio;
	private String nombreProp;
	private String dni;
	
	
	//Constructor por defecto
		public Vehiculos() {
			
		}
	
		//Constructor con parametros
	public Vehiculos(String marca, String matricula, int kilometros, String descripcion, double precio,
			String nombreProp, String dni) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.kilometros = kilometros;
//		this.fechaMat = fechaMat;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombreProp = nombreProp;
		this.dni = dni;
	}
	
	//Constructor copia
		public Vehiculos(final Vehiculos c) {
			marca=c.marca;
			matricula=c.matricula;
			kilometros=c.kilometros;
			fechaMat=c.fechaMat;
			descripcion=c.descripcion;
			precio=c.precio;
			nombreProp=c.nombreProp;
			dni=c.dni;
			
		}
		
		//metodos setter y getters
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public int getKilometros() {
			return kilometros;
		}
		public void setKilometros(int kilometros) {
			this.kilometros = kilometros;
		}
		public Fecha getFechaMat() {
			return fechaMat;
		}
		public void setFechaMat(Fecha fechaMat) {
			this.fechaMat = fechaMat;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public String getNombreProp() {
			return nombreProp;
		}
		public void setNombreProp(String nombreProp) {
			this.nombreProp = nombreProp;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		
		
		@Override
		public String toString() {
			return "Vehiculo \nmarca:" + marca + "\nMatricula: " + matricula + "\nKilometros: " + kilometros+" Kms"
					+ "\nFecha de Matriculacion: " + fechaMat + "\nDescripcion: " + descripcion + "\nPrecio: " + precio + " €\nNombre del Propietario: "
					+ nombreProp + "\nDni: " + dni;
		}

		public int getAnios() {
			int anios;
			
			Fecha fechaActual = new Fecha(16,3,2022);
			anios=fechaActual.getAnio()-fechaMat.getAnio();
			
			//Falta completar la comparacion de meses y dias para ver los años
			
			return anios;
		}
	
}
