Algoritmo ejercicio_8
	
	definir b , h , r como real
	
	escribir "dime una base"
	leer b
	Escribir "Dime una altura"
	leer h
	Escribir "Dime un radio"
	leer r
	
	si (b*h)>(2*pi*r)
		escribir "El �rea del tri�ngulo es mayor que el del c�rculo"
	sino 
		si (2*pi*r)>(b*h) Entonces
			
		escribir "El �rea del c�rculo es mayor que el del tri�ngulo"
		sino 
			escribir "El �rea del c�rculo y el tri�ngulo son iguales"
		finsi
	FinSi
	
	
FinAlgoritmo
