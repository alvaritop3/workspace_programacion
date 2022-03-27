package poo_03;

public class Contador {
	
	//atributos encapsulados
	private int cont;
	
	
	//Constructor sin parametros
	public Contador() {
		
	}

	//Constructor por defecto
	public Contador(int cont) {
		
		this.cont = cont;
		
		if (cont<0) {
			cont=0;
		}	
	}
	
	//Contador copia
	public Contador(final Contador c) {
		cont=c.cont;
	}
	
	//Getter
	public int getCont() {
		return cont;
	}
	//Setter
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//metodo incrementar 
	public void incrementar() {
		cont++;
	}
	
	//metodo para incrementar con el entero que le metamos 
//	public void incrementar2(int x) {
//		cont=cont+x;
//	}
	
	//metodo decrementar 
	public void decrementa() {
		if (cont-1<0) {
			cont=0;
		}else {
			cont--;
		}
	}
	
	
	
}
