Algoritmo ejercicio_10
	
	definir j1, j2 Como Caracter
	
	escribir "El jugador uno elige entre piedra, papel o tijeras"
	leer j1
	escribir "El jugador dos elige entre piedra, papel o tijeras"
	leer j2
	
	si j1=j2
		escribir "Habeis sacado lo mismo, volved a intentarlo"
		
	sino 
		si (j1= "piedra" y j2="tijeras") o (j1="tijeras" y j2="papel") o (j1="papel" y j2="piedra") Entonces
			escribir "Gana el primer jugador"
			
		SiNo
			
		escribir "Gana el segundo jugador"
			
		FinSi
		
	FinSi
FinAlgoritmo
