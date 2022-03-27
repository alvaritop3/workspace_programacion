Algoritmo Ejercicio_5_2
	
	
	definir su, ant Como Entero
	
	Escribir "Indique a continuación su sueldo"
	leer su
	
	Escribir "Indique a continuación su antigüedad"
	leer ant
	
	
	Si su>=500 Entonces
		Escribir "No recibirá ninguna modificación, su sueldo seguirá siendo " su
	SiNo
		si su<500 y ant>=10 Entonces
			Escribir "Le aumentaremos el sueldo en un 20%, por lo que cobrará "  (su*0.2)+su
		sino
			Escribir "Le aumentaremos el sueldo en un 5%, por lo que cobrará " (su*0.05)+su
		Fin Si
	Fin si
	
FinAlgoritmo
