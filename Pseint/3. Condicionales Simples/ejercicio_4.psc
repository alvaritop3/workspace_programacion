Algoritmo ejercicio_4
	
	definir n1 , n2 Como Real
	
	Escribir "Dime un numero entero"
	leer n1
	Escribir "Dime otro numero entero"
	leer n2
	
	si n1%n2=0 Entonces
		escribir "El primer numero es multiplo del segundo"
	FinSi
	
	si n2%n1=0
		escribir "El segundo numero es multiplo del primero"
	FinSi
	
	si n1%n2<>0 Entonces
		escribir "No son multiplos entre ellos"
	FinSi
	
FinAlgoritmo
