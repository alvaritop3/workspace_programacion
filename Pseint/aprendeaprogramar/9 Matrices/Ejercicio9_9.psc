Algoritmo Ejercicio9_9
	
//Si has estudiado álgebra matricial, 
//haz un programa que calcule el determinante 
//de una matriz de 2x2, a partir de datos que 
//introduzca el usuario
	
dimension datos[2,2]	
definir i como numerico

escribir "Dime los dos valores primeros de la matriz"

para i=1 hasta 2
	leer datos[i,1]
FinPara

escribir "Dime dos valores segundos de la matriz"
para i=1 hasta 2
	leer datos[i,2]
FinPara

determinante=(datos[1,1]*datos[2,2])-(datos[2,1]*datos[1,2])

Escribir "El determinante de tu matriz es " determinante

FinAlgoritmo
