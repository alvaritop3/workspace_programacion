Algoritmo Ejercicio12_1
	
	//Crea un procedimiento EscribirCentrado, 
	//que reciba como par�metro un texto y lo 
	//escriba centrado en pantalla (suponiendo
	//una anchura de 80 columnas; pista: deber�s
	//escribir 40 - longitud/2 espacios antes del texto).
	definir txt como cadena
	
	escribir "Dime alguna palabra"
	leer txt
	
	
	EscribirCentrado(txt)
	
FinAlgoritmo

Subproceso EscribirCentrado(texto)
	para x=1 hasta 40-(longitud(texto)/2) hacer
		escribir sin saltar" "
		
	FinPara
	
	escribir texto
	
    
	
FinSubproceso