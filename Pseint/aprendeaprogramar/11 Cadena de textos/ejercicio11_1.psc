Algoritmo ejercicio11_1
	
//Crea un programa que pida su nombre al usuario y lo escriba 
//al revés (de la última letra a la primera: a partir de "Nacho" escribiría "ohcaN")
	
	definir nombre como cadena
	
	Escribir "Dime tu nombre"
	leer nombre
	
	//n=longitud(nombre)
	// otra opción es: para i=n hasta 1....
	
	
	para i=longitud(nombre) hasta 1 con paso -1 Hacer
		escribir sin saltar subcadena(nombre, i,i)
	FinPara
	
	escribir " "
	
	
FinAlgoritmo
