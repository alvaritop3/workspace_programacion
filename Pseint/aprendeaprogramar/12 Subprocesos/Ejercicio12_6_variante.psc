
//Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" o "falso" 
//seg�n si el n�mero que se indique como par�metro es par o no lo es.

subproceso EsPar(n1)
	
	si n1%2=0 Entonces
		escribir "Verdadero"
	sino
		escribir "Falso"
	FinSi
		
FinSubProceso

Algoritmo Ejercicio12_6_variante
	
	Escribir "Dime un n�mero"
	leer n1 
	escribir sin saltar "�Es par tu n�mero? "
	EsPar(n1)
	
	escribir " "
	
FinAlgoritmo
