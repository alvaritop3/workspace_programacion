Algoritmo ejercicio4_6
	
	// definir n1 como real
	// definir n2 como real
	// definir n3 como real
	
	escribir "Dime un numero"
	leer n1
	Escribir "Dime otro numero"
	leer n2
	Escribir "Dime el ultimo numero"
	leer n3
	Si n1>n2 y n1>n3 Entonces
		Escribir "El primer numero elegido es el mayor" 
	SiNo 
		Si n2>n1 y n2>n3
			escribir "El segundo numero elegido es el mayor"
		SiNo
			//si (tercerNumero>PrimerNumero y tercerNumero>Segundonumero) no hace falta ponerlo por que es el ultimo caso posible.
			
			escribir "El tercer numero elegido es el mayor"
		Fin Si
	Fin Si
	
FinAlgoritmo
