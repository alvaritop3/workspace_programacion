Algoritmo ejercicio_adi_4
	
	//Dise�e un algoritmo que lea un n�mero 
	//de tres cifras y determine si es o no capic�a
	
	definir n Como Entero
	
	Escribir "Dime un n�mero de tres cifras"
	leer n
	
	mientras n<99 o n>1000 Hacer
		escribir "El n�mero seleccionado no es de tres cifras"
		leer n
	FinMientras
	
	centena=trunc(n/100)
	decena=trunc((n-centena*100)/10)
	unidad=trunc(n-(centena*100+decena*10))
	
	si unidad<>centena Entonces
		escribir "El n�mero introducido no es capicuo"
	SiNo
		Escribir "El n�mero " n " es capicuo"
	FinSi
	
	
FinAlgoritmo
