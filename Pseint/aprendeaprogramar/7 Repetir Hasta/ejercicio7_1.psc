Algoritmo Ejercicio7_1
	
	definir cod , cont Como Entero
	
	escribir "Escribe tu c�digo de usuario y contrase�a"
	
	leer cod
	leer cont
	
	Repetir
		escribir "Introducir tu c�digo"
		leer cod
		escribir "Introduce tu contrase�a"
		leer cont
		si cod<>0 o cont<>1234
			entonces 
			escribir "Contrase�a y/o c�digo incorrecto"
		FinSi
	Hasta Que cod=1 y cont=1234
	
	escribir "Codigo y contrase�a correcta"
	
FinAlgoritmo
