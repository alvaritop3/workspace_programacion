
//Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" o "falso" 
//seg�n si el n�mero que se indique como par�metro es par o no lo es.

subproceso resultado=EsPar(n1)
	
	si n1%2=0 Entonces
		resultado=Verdadero
	sino
		resultado=falso
	FinSi
	
	
FinSubProceso

Algoritmo Ejercicio12_6
	
	Escribir "Dime un n�mero"
	leer n1 
	escribir "�Es par tu n�mero? " EsPar(n1)
	
	escribir " "
	
FinAlgoritmo
