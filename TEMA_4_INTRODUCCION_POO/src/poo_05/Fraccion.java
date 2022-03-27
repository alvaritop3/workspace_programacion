package poo_05;

public class Fraccion {

	// atributos encapsulados
	private int num;
	private int den;

	// Constructor sin parametros
	public Fraccion() {
		den = 1;
	}

	public Fraccion(int num) {
		super();
		this.num = num;
	}

	// Constructor por defecto
	public Fraccion(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	// metodo sumar
	public Fraccion sumar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.den + den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		
		return aux;
	}
	// metodo restar
	public Fraccion restar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.den - den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		
		return aux;
	}
	// metodo multiplicar
	public Fraccion multiplicar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		
		return aux;
	}
	
	// metodo dividir
	public Fraccion dividir(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = den * f.num;
		aux.den = num * f.den;
		aux.simplificar();
		
		return aux;
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	@Override
	public String toString() {
		Fraccion aux= new Fraccion(num,den);
		aux.simplificar();
		
		return aux.num + "/" + aux.den;
	}

	// calculo del maximo comun divisor
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	
	private void simplificar() {
		
		int mcd=mcd();
		
		this.num=num/mcd;
		this.den=den/mcd;
		
	}

}
