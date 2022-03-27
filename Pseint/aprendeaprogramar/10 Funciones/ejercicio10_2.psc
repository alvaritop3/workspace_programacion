Algoritmo ejercicio10_2
	
	//Haz un programa que calcule raíces cuadradas: 
	//el usuario introducirá un número y se le mostrará 
	//su raíz cuadrada. Se repetirá hasta que introduzca 
	//el número 0 (para el que no se deberá mostrar su raíz). 
	//Si introduce un valor negativo, se deberá mostrar un aviso en vez de intentar calcular su raíz
	
	definir n Como Entero
	
	
	Repetir
		
		escribir "Dime un número"
		leer n
		
		si n<0 Entonces
			escribir "El número tiene que ser positivo"
		SiNo
			si n>0 entonces
			escribir " "
			escribir "La raíz cuadrada de " n " es " RC(n)
		FinSi
	FinSi
	
		
	Hasta Que n=0
	
	escribir "Fin del programa"
	escribir " "
	
	
FinAlgoritmo
