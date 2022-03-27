//Crea una función CantidadDeDivisores, que reciba un número entero y devuelva la cantidad 
//de divisores (por ejemplo, para el número 16, sus divisores son 1, 2, 4, 8, 16, 
//por lo que la respuesta debería ser 5).

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
	
	
	escribir "Dime un número entero"
	leer n
	
	escribir sin saltar "El número tiene: " CantidadDeDivisores(n) " divisores."
	escribir ""
	
	
	
	
	
	
FinAlgoritmo
