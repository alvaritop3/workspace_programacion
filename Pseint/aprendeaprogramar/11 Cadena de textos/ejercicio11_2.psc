Algoritmo ejericio11_2
	
	//Crea un programa que pida su nombre al usuario y lo escriba 
	//alternando letras may�sculas y min�sculas (por ejemplo, "nAcho" se mostrar�a como "NaChO".
	
	definir nombre como cadena
	
	escribir "Dime tu nombre"
	leer nombre
	
	n=longitud(nombre)
	
	
	Para i=1 Hasta n Con Paso 1 Hacer
		
		si i%2<>0 Entonces
			escribir Sin Saltar mayusculas(subcadena(nombre, i,i))
		SiNo
			escribir sin saltar minusculas(subcadena(nombre, i, i))
		FinSi
		
		
	Fin Para
	
FinAlgoritmo
