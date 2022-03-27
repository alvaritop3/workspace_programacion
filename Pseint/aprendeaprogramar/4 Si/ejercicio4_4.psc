Algoritmo ejercicio4_4
	
	//definir primerNumero como real
	//definir segundoNumero como real
	
	escribir "Inserta un numero"
	leer primerNumero
	Escribir "Inserta otro numero"
	leer segundoNumero
	
	Si primerNumero>=0 y segundoNumero>=0 Entonces
		
		Escribir "tus dos numeros son positivos"
	Sino
		Si primerNumero>=0 y segundoNumero<0 Entonces
			
			escribir "el primer numero es positivo"
		SiNo
			si primerNumero<0 y segundoNumero>=0 Entonces
				
				Escribir "el segundo numero es positivo"
			SiNo
				Escribir "los dos son negativos"
			Finsi
		FinSi
	
	Fin Si
	
FinAlgoritmo
