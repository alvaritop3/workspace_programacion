Algoritmo Ejercicio9_10
	
//Si has estudiado álgebra matricial, prepara un programa 
//que calcule el determinante de una matriz de 3x3
	
	dimension datos[3,3]
	definir i como numerica
	
	Escribir "Dime los tres primeros valores de la matriz"
	
	para i=1 hasta 3 Hacer
		leer datos[i,1]
	FinPara
	
	Escribir "Dime los tres segundos valores de la matriz"
	
	para i=1 hasta 3 Hacer
		leer datos[i,2]
	FinPara
	
	Escribir "Dime los tres terceros valores de la matriz"
	
	para i=1 hasta 3 Hacer
		leer datos[i,3]
	FinPara
	
	
	determinante1=(datos[1,1]*datos[2,2]*datos[3,3])+(datos[2,1]*datos[3,2]*datos[1,3])+(datos[1,2]*datos[2,3]*datos[3,1])
	determinante2=(datos[1,3]*datos[2,2]*datos[3,1])+(datos[1,2]*datos[2,1]*datos[3,3])+(datos[2,3]*datos[3,2]*datos[1,1])
	resultado=determinante1-determinante2
	
	escribir "La determinante es " resultado
	
FinAlgoritmo
