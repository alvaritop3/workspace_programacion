Algoritmo Ejercicio9_3
	
	//Crea una versi�n ampliada del ejercicio 9.2, 
	//en la que se pida al usuario 5 datos, se guarden en una matriz 
	//y finalmente se calcule su media, se muestre �sta y se muestren tambi�n los valores mayores que la media).

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
	
	media=suma/5
	
	escribir "La media de tus ex�menes es de " media
	
	Para i=1 Hasta 5 Con Paso 1 Hacer
		si datos[i]>media entonces 
			escribir datos[i] " Es mayor que la media"
		FinSi
		
	Fin Para
	
	
	
	
	
	
FinAlgoritmo
