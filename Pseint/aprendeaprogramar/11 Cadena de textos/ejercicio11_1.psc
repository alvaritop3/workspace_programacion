Algoritmo ejercicio11_1
	
//Crea un programa que pida su nombre al usuario y lo escriba 
//al rev�s (de la �ltima letra a la primera: a partir de "Nacho" escribir�a "ohcaN")
	
	definir nombre como cadena
	
	Escribir "Dime tu nombre"
	leer nombre
	
	//n=longitud(nombre)
	// otra opci�n es: para i=n hasta 1....
	
	
	para i=longitud(nombre) hasta 1 con paso -1 Hacer
		escribir sin saltar subcadena(nombre, i,i)
	FinPara
	
	escribir " "
	
	
FinAlgoritmo
