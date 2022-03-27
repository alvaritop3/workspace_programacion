Algoritmo Ejercicio9_8
	
	//Crea un programa que pida al usuario dos bloques 
	//de 10 números cada uno (usando un array de dos 
	//dimensiones). Después deberá mostrar el mayor 
	//dato que se ha introducido en cada uno de esos dos bloques.
	
	dimension datos[10,2]
	
	


	Escribir "Dime 10 valores para cada bloque del primer array."
	
	Para i=1 hasta 10 hacer
		leer datos[i,1]
		
	fin para
	
	mayor1=datos[1,1]
	
	para i=2 hasta 10 Hacer
		si mayor1<datos[i,1] Entonces
			mayor1=datos[i,1]
		FinSi	
	FinPara
	
	
	Escribir "Dime 10 valores para cada bloque del segundo array."
	
	para i=1 hasta 10 hacer 
		leer datos[i,2]
		
	FinPara
	
	mayor2=datos[1,2]
	
	para i=2 hasta 10 Hacer
		si mayor2<datos[i,2] Entonces
			mayor2=datos[i,2]
		FinSi	
	FinPara
	
	Escribir "El número mayor del primer bloque es " mayor1 " y el del segundo bloque es " mayor2
	
FinAlgoritmo
