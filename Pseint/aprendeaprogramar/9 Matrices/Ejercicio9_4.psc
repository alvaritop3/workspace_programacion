Algoritmo Ejercicio9_4
	
	//Si has estudiado lo que es un vector, crea un programa que reserve espacio 
	//para dos vectores de 3 componentes, pida al usuario sus valores y calcule 
	//la suma de ambos vectores (su primera componente será x1+y1, la segunda será x2+y2 y así sucesivamente).
	
	definir datos1 , datos2, suma como numerico
	
	dimension datos1[3] , datos2[3], suma[3]
	
	escribir "Introduce el primer vector (3 componentes)"
	para i=1 hasta 3 
		
		leer datos1[i]
		
	FinPara
	
	escribir "Introduce el segundo vector (3 componentes)"
	para i=1 hasta 3 
	
		leer datos2[i]
		
	FinPara
	
	escribir "La suma de los dos vectores es:"
	
	para i=1 hasta 3 
		
		suma[i]=datos1[i]+datos2[i]
		
		escribir  suma[i] 
		
		
	FinPara
	
	Escribir""
	
	
	
	
FinAlgoritmo
