Algoritmo ejercicio_adi_4
	
	//Diseñe un algoritmo que lea un número 
	//de tres cifras y determine si es o no capicúa
	
	definir n Como Entero
	
	Escribir "Dime un número de tres cifras"
	leer n
	
	mientras n<99 o n>1000 Hacer
		escribir "El número seleccionado no es de tres cifras"
		leer n
	FinMientras
	
	centena=trunc(n/100)
	decena=trunc((n-centena*100)/10)
	unidad=trunc(n-(centena*100+decena*10))
	
	si unidad<>centena Entonces
		escribir "El número introducido no es capicuo"
	SiNo
		Escribir "El número " n " es capicuo"
	FinSi
	
	
FinAlgoritmo
