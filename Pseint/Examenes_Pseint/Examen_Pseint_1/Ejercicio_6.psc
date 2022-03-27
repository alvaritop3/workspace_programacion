Algoritmo Ejercicio_2
	
	definir p,c Como Entero
	
	escribir "Indica la cantidad total de preguntas que se realizaron"
	leer p
	escribir "Indica la cantidad total de respuestas contestadas correctamente"
	leer c
	
	porcentaje=c*100/p
	
	si porcentaje<50 Entonces
		Escribir "Fuera de nivel"
		
		SiNo
			si porcentaje>=90 Entonces
			escribir "Nivel máximo"
			SiNo
				si porcentaje>=75 y porcentaje<90 Entonces
				escribir "Nivel medio"	
				Sino 
					si porcentaje>=50 y porcentaje<75 Entonces
					escribir "Nivel regular"
				FinSi
			FinSi
		Finsi
FinSi

	
	


FinAlgoritmo
