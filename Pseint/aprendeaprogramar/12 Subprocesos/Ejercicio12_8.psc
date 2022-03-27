//Crea una función Iniciales, que devuelva una cadena formada por las 
//iniciales de la frase que se indique como parámetro (primera letra 
//y la letra que haya tras cada espacio; por ejemplo, para "Nacho Cabanes" devolvería "NC").

subproceso resultado=Iniciales(frase)
	
	resultado<- Mayusculas(subcadena(frase,1,1))
	
	para i=1 hasta longitud(frase) Hacer
		
		si subcadena(frase,i,i) == " " Entonces
			resultado1<-Mayusculas(subcadena(frase,i+1,i+1))
			
			resultado<-Concatenar(resultado,resultado1)
			
		FinSi
	FinPara
	
FinSubProceso
Algoritmo Ejercicio12_8
	
	definir frase como cadena
	
	escribir "Dime una frase"
	leer frase
	
	escribir "Las iniciales de las palabras de tu frase son " Iniciales(frase)
	
FinAlgoritmo
