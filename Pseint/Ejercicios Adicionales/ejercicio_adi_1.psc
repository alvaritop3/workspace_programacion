Algoritmo Ejercicio_adi_1
	
//Hacer un programa que introduzca por teclado 
//un n�mero total de segundos y que luego pueda
//mostrar la cantidad de horas, minutos y segundos 
//que existen en el valor introducido.
	
	definir n Como Entero
	
	Escribir "Dime un n�mero positivo"
	leer n
	
	Mientras n<0 Hacer
		Escribir "El n�mero no puede ser negativo"
		leer n
	Fin Mientras
	
	min= n/60
	hora= n/3600
	
	escribir "Su numero corresponde a " TRUNC(min) " minuto/s"
	escribir "Su numero corresponde a " TRUNC(hora) " hora/s" 
	
FinAlgoritmo
