Algoritmo Ejercicio9_1
	
	//Crea un programa que pida un n�mero 
	//al usuario un n�mero de mes (por ejemplo, el 4) y diga cu�ntos d�as tiene (por ejemplo, 30). 
	//Debes usar una matriz.
	
	dimension datos[12]
	
	datos[1]=31
	datos[2]=28
	datos[3]=31
	datos[4]=30
	datos[5]=31
	datos[6]=30
	datos[7]=31
	datos[8]=31
	datos[9]=30
	datos[10]=31
	datos[11]=30
	datos[12]=31
	
	mientras i>12 o i<=0 Hacer
		Escribir "Dime un n�mero que corresponda a un mes"
		leer i
	FinMientras
	
	escribir "El mes " n " tiene " datos[i] " d�as"
	
	
FinAlgoritmo
