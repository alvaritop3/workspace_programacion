//Crea una funci�n CantidadDeDivisores, que reciba un n�mero entero y devuelva la cantidad 
//de divisores (por ejemplo, para el n�mero 16, sus divisores son 1, 2, 4, 8, 16, 
//por lo que la respuesta deber�a ser 5).

SubProceso   resultado=CantidadDeDivisores(n) 
	
	cont=0
	
	para i=1 hasta n Hacer
		
		si n%i=0 Entonces
			
			cont=cont+1
		FinSi
	FinPara
	
	resultado=cont
FinSubProceso


Algoritmo Ejercicio12_2
	
	definir n Como Entero
	
	
	escribir "Dime un n�mero entero"
	leer n
	
	escribir sin saltar "El n�mero tiene: " CantidadDeDivisores(n) " divisores."
	escribir ""
	
	
	
	
	
	
FinAlgoritmo
