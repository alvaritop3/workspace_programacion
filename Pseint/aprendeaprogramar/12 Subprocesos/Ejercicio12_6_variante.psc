
//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" 
//según si el número que se indique como parámetro es par o no lo es.

subproceso EsPar(n1)
	
	si n1%2=0 Entonces
		escribir "Verdadero"
	sino
		escribir "Falso"
	FinSi
		
FinSubProceso

Algoritmo Ejercicio12_6_variante
	
	Escribir "Dime un número"
	leer n1 
	escribir sin saltar "¿Es par tu número? "
	EsPar(n1)
	
	escribir " "
	
FinAlgoritmo
