//Crea un procedimiento EscribirEspaciado, que reciba como par�metro un 
//texto y lo escriba con un espacio adicional tras cada letra. 
//Por ejemplo, "Hola, t�" se escribir�a "H o l a , t � ".

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
