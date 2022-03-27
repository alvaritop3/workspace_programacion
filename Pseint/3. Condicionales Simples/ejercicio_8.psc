Algoritmo ejercicio_8
	
	definir b , h , r como real
	
	escribir "dime una base"
	leer b
	Escribir "Dime una altura"
	leer h
	Escribir "Dime un radio"
	leer r
	
	si (b*h)>(2*pi*r)
		escribir "El área del triángulo es mayor que el del círculo"
	sino 
		si (2*pi*r)>(b*h) Entonces
			
		escribir "El área del círculo es mayor que el del triángulo"
		sino 
			escribir "El área del círculo y el triángulo son iguales"
		finsi
	FinSi
	
	
FinAlgoritmo
