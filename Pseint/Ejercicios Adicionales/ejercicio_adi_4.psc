Algoritmo ejercicio_adi_4
	
	//Se requiere saber la edad de una persona cualquiera a partir de su fecha de nacimiento con todos
	//sus datos; d�a, mes y a�o de nacimiento. Lo anterior, a partir de la fecha actual; d�a, mes y a�o
	//actual. Todos los datos de ambas fechas, debe proporcionarlos el usuario introduciento los datos por
	//teclado
	
	escribir "Dime el d�a en que naciste"
	leer dia
	escribir "Dime el mes en el que naciste"
	leer mes
	escribir "Dime el a�o en el que naciste"
	leer ano
	
	escribir "Dime que d�a es hoy"
	leer dia2
	escribir "Dime el mes en el que estamos"
	leer mes2
	escribir "Dime en que a�o estamos"
	leer ano2
	
	resultado=ano2-ano
	
	si dia>dia2 y mes>mes2 Entonces
		
		escribir "tienes " resultado-1 " a�os" 
	sino 
		escribir "tienes " resultado " a�os"
	FinSi
	
FinAlgoritmo
