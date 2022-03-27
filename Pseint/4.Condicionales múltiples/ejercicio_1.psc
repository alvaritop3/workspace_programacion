Algoritmo Ejercicio_1
	definir n Como Entero
	
	escribir "Dime tu nota del último exámen"
	leer n
	
	Segun n Hacer
		0,1,2,3,4:
			escribir "Tu nota es insuficiente"
		5:
			escribir "Tu nota es suficiente"
		6,7:
			escribir "Tu nota es bien"
		8:
			escribir "Tu nota es notable"
		9,10:
			escribir "tu nota es sobresaliente"
		De Otro Modo:
			escribir "el numero indicado no pertenece a una nota"
	Fin Segun
	
FinAlgoritmo
