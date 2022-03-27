Algoritmo Ejercicio9_6
	
// Haz un programa que pida al usuario 7 números enteros y 
//calcule (y muestre) cuál es el mayor de ellos.
//Nota:para calcular el mayor valor de una matriz, 
//hay que comparar cada uno de los valores que tiene 
//almacenados con el que hasta ese momento es el máximo provisional.
//El valor inicial de este máximo provisional no debería ser cero 
//(porque el resultado sería incorrecto si todos los números son 
//negativos), sino el primer elemento de la matriz.

	dimension datos[7]
	

	
	Escribir "Dime siete valores"
	
	para n=1 hasta 7 Hacer
		
		leer datos[n]
		
	FinPara
	
	mayor=datos[1]
	
	para n=2 hasta 7 Hacer
	
		si mayor<datos[n] Entonces
			mayor=datos[n]	
			
		FinSi
		
	FinPara
	
	escribir "El número mayor de los introducidos es " mayor
	
FinAlgoritmo
