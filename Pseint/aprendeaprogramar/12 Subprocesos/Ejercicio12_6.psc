
//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" 
//según si el número que se indique como parámetro es par o no lo es.

subproceso resultado=EsPar(n1)
	
	si n1%2=0 Entonces
		resultado=Verdadero
	sino
		resultado=falso
	FinSi
	
	
FinSubProceso

Algoritmo Ejercicio12_6
	
	Escribir "Dime un número"
	leer n1 
	escribir "¿Es par tu número? " EsPar(n1)
	
	escribir " "
	
FinAlgoritmo
