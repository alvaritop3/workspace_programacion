Algoritmo ejercicio_7
	
	definir n Como Real
	
	escribir "Dime tu nota del tu último exámen"
	leer n
	
	si n>=0 y n<5
		escribir "Tu nota es insuficiente"
	FinSi
	
	si n=5
		escribir "Tu nota es suficiente"
	FinSi
	
	si n=6
		escribir "Tu nota es bien"
	FinSi
	
	si n=7 o n=8
		escribir "Tu nota es notable"
	FinSi
	
	si n=9 o n=10
		escribir "Tu nota es un sobresaliente"
	FinSi
	
	si n<0 o n>10
		Escribir  "Esta nota no es válida"
	FinSi
	
	
FinAlgoritmo
