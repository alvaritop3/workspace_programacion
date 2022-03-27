Algoritmo Ejercicio9_5
	
	//Si has estudiado lo que es un vector, prepara un programa 
	//que reserve espacio para dos vectores de 3 componentes, 
	//pida al usuario sus valores y calcule su producto escalar (x1·y1+ x2·y2+x3·y3)	
	
	definir datios1, datos2, producto, sumatorio como numerico
	dimension datos1[3] , datos2[3], producto[3]
	
	escribir "Dime tres números para el primer vector (de tres componentes)"
	
	para i=1 hasta 3 con paso 1
		leer datos1[i]
	FinPara
	
	escribir "Dime tres números para el segundo vector (de tres componentes)"
	
	para i=1 hasta 3 con paso 1
		leer datos2[i]
	FinPara
	
	sumatorio=0
	
	escribir Sin Saltar "El producto escalar es "
	para i=1 hasta 3 con paso 1
		producto[i]=datos1[i]*datos2[i]
		sumatorio=producto[1]+producto[2]+producto[3]
		
	FinPara
	
	escribir sumatorio
	
	
FinAlgoritmo
