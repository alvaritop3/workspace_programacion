
//Crea una funci�n MayorDeTres, que reciba tres n�meros enteros y devuelva el valor 
//del mayor de ellos. Por ejemplo, para los n�meros 5, 7 y 5, devolver�a el valor 7.

SubProceso resultado<-MayorDeTres(n1,n2,n3)
	

	si n1>n2 y n1>n3 entonces
		mayor=n1
	FinSi
	
	si n2>n1 y n2>n3 Entonces
		mayor=n2
	FinSi
	
	si n3>n1 y n3>n2 Entonces
		mayor=n3
	FinSi
	
	resultado=mayor
	
FinSubProceso

Algoritmo Ejercicio12_5
	
	escribir "Dime tres n�meros"
	leer n1
	leer n2
	leer n3
	
	escribir "El n�mero mayor es " MayorDeTres(n1,n2,n3)
	
	escribir " "
FinAlgoritmo
