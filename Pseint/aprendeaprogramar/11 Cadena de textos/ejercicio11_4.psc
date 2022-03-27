Algoritmo ejercicio11_4
	
	//Crea un programa que pida su nombre al usuario y diga 
	//qué vocales contiene (en orden y sin repetir: por ejemplo, para "Aurora" deberá responder "aou")
	
	definir n como cadena
	
	escribir "Dime tu nombre"
	leer n
	
	n=Minusculas(n)
	
	Para i=1 Hasta longitud(n) Con Paso 1 Hacer
		
		si subcadena(n, i,i)="a" o subcadena(n, i,i)="e" o subcadena(n, i,i)="i" o subcadena(n, i,i)="o" o subcadena(n, i,i)="u" Entonces
			escribir sin saltar subcadena(n, i,i) " "
		FinSi
		
		
	FinPara
	
	escribir " "
	
FinAlgoritmo
