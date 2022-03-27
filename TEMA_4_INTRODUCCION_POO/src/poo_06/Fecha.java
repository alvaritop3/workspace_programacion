package poo_06;

public class Fecha {

	// atributos encapsulados
	private int dia;
	private int mes;
	private int anio;

	// Constructor vacio
	public Fecha() {

	}

	// Constructor por defecto
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	// Getters and Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	// metodo toString
	@Override
	public String toString() {
		if ((dia < 10) && (mes < 10)) {
			return dia + "-0" + mes + "-" + anio;
		} else if (dia < 10) {
			return dia + "-" + mes + "-" + anio;
		} else if (mes < 10) {
			return dia + "-0" + mes + "-" + anio;
		} else {
			return dia + "-" + mes + "-" + anio;
		}

	}

	// metodo privado para año bisiesto
	private boolean esBisiesto() {
		if ((anio % 4 == 0) && (anio % 100 == 0) && (anio % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean fechaCorrecta() {
		boolean anioCorrecto, mesCorrecto, diaCorrecto;

		anioCorrecto = anio >= 0;
		mesCorrecto = (mes > 0) && (mes < 13);
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = (dia > 0) && (dia < 30);
			} else {
				diaCorrecto = (dia > 0) && (dia < 29);
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diaCorrecto = (dia > 0) && (dia < 32);
			break;
		default:
			diaCorrecto = (dia > 0) && (dia < 31);
			break;
		}

		if (diaCorrecto && mesCorrecto && anioCorrecto) {
			return true;
		} else {
			return false;
		}
	}

	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
		}

		if (!fechaCorrecta()) {
			mes = 1;
			anio++;
		}
	}
}
