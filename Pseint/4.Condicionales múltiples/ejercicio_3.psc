Algoritmo ejercicio_3
	
	definir t1,t2 Como Caracter
	definir suma Como Entero
	suma=0
	
	Escribir "Dime cuanto has sacado en la primera tirada con caracteres"
	leer t1
	
	Segun t1 Hacer
		"uno", "Uno", "UNO":
			suma=suma+1
		"dos", "Dos", "DOS":
			suma=suma+2
		"tres", "Tres", "TRES":
			suma=suma+3
		"cuatro", "Cuatro", "CUATRO":
			suma=suma+4
		"cinco", "Cinco", "CINCO":
			suma=suma+5
		"seis", "Seis", "SEIS":
			suma=suma+6
		
		De Otro Modo:
			escribir "Los caracteres dados no corresponden con la tirada del dado"
	Fin Segun

	
	Escribir "Dime cuanto has sacado en la segunda tirada con caracteres"
	leer t2
	
	Segun t2 Hacer
		"uno", "Uno", "UNO":
			suma=suma+1
		"dos", "Dos", "DOS":
			suma=suma+2
		"tres", "Tres", "TRES":
			suma=suma+3
		"cuatro", "Cuatro", "CUATRO":
			suma=suma+4
		"cinco", "Cinco", "CINCO":
			suma=suma+5
		"seis", "Seis", "SEIS":
			suma=suma+6
			
		De Otro Modo:
			escribir "Los caracteres dados no corresponden con la tirada del dado"
	Fin Segun
	
	escribir suma
	
FinAlgoritmo
