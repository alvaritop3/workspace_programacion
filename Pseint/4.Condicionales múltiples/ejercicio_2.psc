Algoritmo ejercicio_2
	
	definir n1,n2 Como Real
	definir op Como Caracter
	
	Escribir "Dime un numero"
	leer n1
	Escribir "Dime otro numero"
	leer n2
	
	Escribir "Elige una de las siguientes opciones"
	Escribir "A. Sumar los números"
	escribir "B. Restar los números"
	escribir "C. Multiplicar los números"
	escribir "D. Dividir los números"
	
	leer op
	
	Segun op Hacer
		"A","a":
			escribir n1+n2
		"B","b":
			escribir n1-n2
		"C","c":
			escribir n1*n2
		"D","d":
			Escribir n1/n2
		De Otro Modo:
			escribir "No has elegido una opcion correcta"
	Fin Segun
	
FinAlgoritmo
