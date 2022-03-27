Algoritmo Ejercicio7_1
	
	definir cod , cont Como Entero
	
	escribir "Escribe tu código de usuario y contraseña"
	
	leer cod
	leer cont
	
	Repetir
		escribir "Introducir tu código"
		leer cod
		escribir "Introduce tu contraseña"
		leer cont
		si cod<>0 o cont<>1234
			entonces 
			escribir "Contraseña y/o código incorrecto"
		FinSi
	Hasta Que cod=1 y cont=1234
	
	escribir "Codigo y contraseña correcta"
	
FinAlgoritmo
