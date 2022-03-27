Algoritmo ejercicio11_6
	
	//Crea un programa que pida al usuario su nombre y apellidos 
	//y los muestre con las mayúsculas y minúsculas correctas 
	//(aparecerán en mayúsculas la primera letra y la que haya 
	//tras cada espacio; las demás aparecerán en minúsculas. 
	//Por ejemplo, si introduce "nAcho cabaNes", es escribirá "Nacho Cabanes").
	
	definir n como cadena 
	escribir "Dime tu nombre y apellidos"
	leer n
	
	n=Minusculas(n)
	
	escribir sin saltar Mayusculas(subcadena(n, 1,1))
	
	para i=1 hasta longitud(n) Hacer
		
		m=subcadena(n, i,i)
		
		si m=" " Entonces
			escribir sin saltar " " Mayusculas(subcadena(n, i+1,i+1))
		SiNo
			escribir sin saltar subcadena(n, i+1,i+1)
		FinSi
	FinPara
	
	escribir " "
	
FinAlgoritmo
