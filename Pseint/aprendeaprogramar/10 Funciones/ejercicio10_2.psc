Algoritmo ejercicio10_2
	
	//Haz un programa que calcule ra�ces cuadradas: 
	//el usuario introducir� un n�mero y se le mostrar� 
	//su ra�z cuadrada. Se repetir� hasta que introduzca 
	//el n�mero 0 (para el que no se deber� mostrar su ra�z). 
	//Si introduce un valor negativo, se deber� mostrar un aviso en vez de intentar calcular su ra�z
	
	definir n Como Entero
	
	
	Repetir
		
		escribir "Dime un n�mero"
		leer n
		
		si n<0 Entonces
			escribir "El n�mero tiene que ser positivo"
		SiNo
			si n>0 entonces
			escribir " "
			escribir "La ra�z cuadrada de " n " es " RC(n)
		FinSi
	FinSi
	
		
	Hasta Que n=0
	
	escribir "Fin del programa"
	escribir " "
	
	
FinAlgoritmo
