Algoritmo ejercicio_adi_2
	
//Introducir la fecha actual y mostrar el n�mero total de d�as transcurridos
//desde el inicio de este a�o, considerando que todos los meses tienen 30 d�as.	
	
	definir dia, mes Como Real
	
	escribir "Dime en qu� d�a estamos hoy"
	
	mientras dia>30 o dia<=0 Hacer
		
			leer dia
		si dia>30 o dia<=0 entonces
			Escribir "No se corresponde al d�a de hoy"
		FinSi
	
	FinMientras
	
	escribir "Dime en que mes estamos hoy"
	
	mientras mes>12 o mes<=0 Hacer
		
		leer mes
		si mes>12 o mes<=0 entonces
			Escribir "No se corresponde al mes de hoy"
		FinSi
		
	FinMientras
	
	
	fecha= dia+((mes-1)*30)
	
	escribir "han pasado " fecha " d�as"
	
FinAlgoritmo
