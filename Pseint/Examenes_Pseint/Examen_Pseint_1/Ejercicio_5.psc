Algoritmo Ejercicio_5_2
	
	
	definir su, ant Como Entero
	
	Escribir "Indique a continuaci�n su sueldo"
	leer su
	
	Escribir "Indique a continuaci�n su antig�edad"
	leer ant
	
	
	Si su>=500 Entonces
		Escribir "No recibir� ninguna modificaci�n, su sueldo seguir� siendo " su
	SiNo
		si su<500 y ant>=10 Entonces
			Escribir "Le aumentaremos el sueldo en un 20%, por lo que cobrar� "  (su*0.2)+su
		sino
			Escribir "Le aumentaremos el sueldo en un 5%, por lo que cobrar� " (su*0.05)+su
		Fin Si
	Fin si
	
FinAlgoritmo
