Algoritmo ejercicio9_2
	
	//Haz un programa que pida al usuario 5 datos,
	//los guarde en una matriz y luego muestre su media 
	//(la suma de los 5 datos, dividida entre 5).
	
	dimension datos[5]
	
	
	escribir "Dime tus �ltimas cinco notas de tus ex�menes"
	
	leer datos[1]
	
	leer datos[2]
	
	leer datos[3]
	
	leer datos[4]
	
	leer datos[5]
	
	suma=0

	
	Para i=1 Hasta 5 Con Paso 1 Hacer
		suma=suma+datos[i]
		
	Fin Para
	
	escribir sin saltar "La media de tus ex�menes es de " suma/5
	
	
	
	
FinAlgoritmo
