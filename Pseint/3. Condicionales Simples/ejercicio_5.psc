Algoritmo ejercicio_5
	
	definir n1, n2, n3 Como Caracter
	Escribir "Dime tres caracteres"
	leer n1
	leer n2
	leer n3
	
	si n1>=n2 y n1>=n3 y n2>=n3
		escribir n1 " , " n2 " , " n3
		
	FinSi
	
	si n1>=n2 y n1>=n3 y n3>=n2
		escribir  n1 " , " n2 " , " n3
	FinSi
	
	si n2>=n1 y n2>=n3 y n1>=n3
		escribir n2 " , " n1 " , " n3
	FinSi
	
	si n2>=n1 y n2>=n3 y n3>=n1
		escribir n2 " , " n3 " , " n1
	FinSi
	
	si n3>=n1 y n3>=n2 y n1>=n2
		escribir n3 " , " n1 " , " n2
	FinSi
	
	si n3>=n1 y n3>=n2 y n2>=n1
		escribir n3 " , " n2 " , " n1
	FinSi
	
FinAlgoritmo
