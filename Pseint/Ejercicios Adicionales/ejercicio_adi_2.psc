Algoritmo ejercicio_adi_2
	
//Introducir la fecha actual y mostrar el número total de días transcurridos
//desde el inicio de este año, considerando que todos los meses tienen 30 días.	
	
	definir dia, mes Como Real
	
	escribir "Dime en qué día estamos hoy"
	
	mientras dia>30 o dia<=0 Hacer
		
			leer dia
		si dia>30 o dia<=0 entonces
			Escribir "No se corresponde al día de hoy"
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
	
	escribir "han pasado " fecha " días"
	
FinAlgoritmo
