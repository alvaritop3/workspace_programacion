Algoritmo ejercicio10_1
	
	//Crea un programa que genere un número al azar entre el 1 y el 100.
	//El usuario tendrá 7 oportunidades para adivinarlo. 
	//Tras cada intento, se le dirá si se ha pasado o se ha quedado corto.
	
	definir intento Como Entero
	
	n=azar(101)
	cont=0
	
	
	Repetir
		
		cont=cont+1
		escribir "Intento número " cont
		escribir "-----------------------------------------"
		escribir "Dime un numero del 1 al 100"
		leer intento
		
		si intento=n Entonces
			escribir "Has acertado"
		SiNo
			si intento>n Entonces
				escribir "El número es menor que el que has escrito"
				
			SiNo
				escribir "El número es mayor que el que has escrito"
				
			FinSi
			escribir " "
		FinSi
		
	Hasta Que intento=n o cont=7
	
	si cont=7 Entonces
		escribir "Has usado todos los intentos, el número era " n
	FinSi
	
	
FinAlgoritmo
