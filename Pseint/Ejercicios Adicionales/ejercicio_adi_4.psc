Algoritmo ejercicio_adi_4
	
	//Se requiere saber la edad de una persona cualquiera a partir de su fecha de nacimiento con todos
	//sus datos; día, mes y año de nacimiento. Lo anterior, a partir de la fecha actual; día, mes y año
	//actual. Todos los datos de ambas fechas, debe proporcionarlos el usuario introduciento los datos por
	//teclado
	
	escribir "Dime el día en que naciste"
	leer dia
	escribir "Dime el mes en el que naciste"
	leer mes
	escribir "Dime el año en el que naciste"
	leer ano
	
	escribir "Dime que día es hoy"
	leer dia2
	escribir "Dime el mes en el que estamos"
	leer mes2
	escribir "Dime en que año estamos"
	leer ano2
	
	resultado=ano2-ano
	
	si dia>dia2 y mes>mes2 Entonces
		
		escribir "tienes " resultado-1 " años" 
	sino 
		escribir "tienes " resultado " años"
	FinSi
	
FinAlgoritmo
