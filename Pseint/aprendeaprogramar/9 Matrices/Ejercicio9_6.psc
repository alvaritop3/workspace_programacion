Algoritmo Ejercicio9_6
	
// Haz un programa que pida al usuario 7 n�meros enteros y 
//calcule (y muestre) cu�l es el mayor de ellos.
//Nota:para calcular el mayor valor de una matriz, 
//hay que comparar cada uno de los valores que tiene 
//almacenados con el que hasta ese momento es el m�ximo provisional.
//El valor inicial de este m�ximo provisional no deber�a ser cero 
//(porque el resultado ser�a incorrecto si todos los n�meros son 
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
	
	escribir "El n�mero mayor de los introducidos es " mayor
	
FinAlgoritmo
