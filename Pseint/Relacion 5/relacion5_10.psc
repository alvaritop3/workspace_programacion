Algoritmo Relacion5_10
	
	//Escribe un algoritmo que vaya pidiendo n�meros al usuario y vaya mostrando por pantalla si el n�mero
	//introducido es par o impar (indistintamente que sea positivo o negativo). El algoritmo terminar� cuando el
	//usuario introduzca el n�mero cero.
	
	definir i Como Entero
	i=0
	
	Repetir
		escribir "dame un n�mero y te dir� si es par o impar e introduce 0 para terminar"
		leer i
		
		si i%2=0 y i<>0 Entonces
			escribir "es par"
		SiNo
			si i%2=1 
				escribir "Es impar"
				
			FinSi
		FinSi
		
	Hasta Que i=0
	
	
FinAlgoritmo
