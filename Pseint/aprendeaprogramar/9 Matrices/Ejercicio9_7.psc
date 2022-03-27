Algoritmo Ejercicio9_7
	
	//Crea un programa que prepare un array con 10 datos prefijados,
	//luego pregunte al usuario qué dato desea buscar, 
	//avise si ese dato no aparece, y que en caso contrario 
	//diga cuántas veces se ha encontrado.
	
	dimension datos[10]
	definir n Como Entero
	
	datos[1]=5
	datos[2]=10
	datos[3]=8
	datos[4]=9
	datos[5]=12
	datos[6]=15
	datos[7]=12
	datos[8]=32
	datos[9]=58
	datos[10]=49
	
	escribir "Digame un número entero"
	leer n
	
	cont=0
	
	para i=1 hasta 10 Hacer
		si n=datos[i] Entonces
			cont=cont+1
			escribir "El número se encuentra en la posición " i
		FinSi
	FinPara
	
	escribir "El número " n " ha aparecido en " cont " ocasiones"
	
FinAlgoritmo
