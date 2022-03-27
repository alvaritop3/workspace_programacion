Algoritmo Ejercicio9_3
	
	//Crea una versión ampliada del ejercicio 9.2, 
	//en la que se pida al usuario 5 datos, se guarden en una matriz 
	//y finalmente se calcule su media, se muestre ésta y se muestren también los valores mayores que la media).

	dimension datos[5]
	
	escribir "Dime tus últimas cinco notas de tus exámenes"
	
	leer datos[1]
	
	leer datos[2]
	
	leer datos[3]
	
	leer datos[4]
	
	leer datos[5]
	
	suma=0
	
	
	Para i=1 Hasta 5 Con Paso 1 Hacer
		suma=suma+datos[i]
		
	Fin Para
	
	media=suma/5
	
	escribir "La media de tus exámenes es de " media
	
	Para i=1 Hasta 5 Con Paso 1 Hacer
		si datos[i]>media entonces 
			escribir datos[i] " Es mayor que la media"
		FinSi
		
	Fin Para
	
	
	
	
	
	
FinAlgoritmo
