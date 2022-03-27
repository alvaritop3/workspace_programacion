//Crea un procedimiento EscribirEspaciado, que reciba como parámetro un 
//texto y lo escriba con un espacio adicional tras cada letra. 
//Por ejemplo, "Hola, tú" se escribiría "H o l a , t ú ".

subproceso EscribirEspaciado(texto)
	
	para i=1 hasta longitud(texto) Hacer
		Escribir Sin Saltar Subcadena(texto, i, i) " "
        Escribir Sin Saltar " "
	FinPara
	
FinSubProceso


Algoritmo ejercicio12_4
	
	
	
	escribir "Escribeme una frase"
	leer texto
	
	EscribirEspaciado(texto)
	
	escribir " "
FinAlgoritmo
