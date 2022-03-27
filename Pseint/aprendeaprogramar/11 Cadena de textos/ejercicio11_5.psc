Algoritmo ejercicio11_5
	
	//Crea un programa que pida una frase al usuario y diga cuántas palabras contiene 
	//(pista: puedes contar los espacios, prestando atención en que no estén repetidos).
	
	definir n como cadena 
	cont=1
	
	escribir "Dime una frase"
	leer n
	
	para i=1 hasta longitud(n) Hacer
		
		si subcadena(n, i,i)=" " y subcadena(n, i+1,i+1)<>" "
		
		cont=cont+1
		
		FinSi
		
	FinPara
	
	escribir "En tu frase hay " cont " palabras"
	
FinAlgoritmo
