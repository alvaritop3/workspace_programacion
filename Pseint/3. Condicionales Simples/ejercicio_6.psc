Algoritmo ejercicio_6
	
	definir n1 Como Real
	Escribir "Dime un número entre 0 y 9999"
	leer n1
	
	si n1>=0 y n1<=9
		escribir "Su número tiene una cifra"
	FinSi
	
	si n1>=10 y n1<=99
		escribir "Su número tiene dos crifras"
	FinSi
	
	si n1>=100 y n1<=999
		escribir "Su número tiene tres crifras"
	FinSi
	
	si n1>=1000 y n1<=9999
		escribir "Su número tiene cuatro cifras"
	FinSi
	
	Si n1<0 o n1>9999
		escribir "Este número no es valido"
	FinSi
FinAlgoritmo
