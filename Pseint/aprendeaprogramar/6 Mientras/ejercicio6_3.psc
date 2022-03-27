Algoritmo ejercicio6_3
	
	Definir n1, n2, r Como Real
	
	n1=AZAR(101)
	n2=AZAR(101)
	
	Escribir Sin Saltar "Dado los numeros elegidos al azar ",n1, " y " ,n2
	escribir " , calcula su suma."
	leer r
	Mientras r<>n1+n2 Hacer
		escribir "La respuesta es incorrecta, vuelve a intentarlo"
		leer r
	Fin Mientras
	
	escribir "La respuesta es correcta"
FinAlgoritmo
