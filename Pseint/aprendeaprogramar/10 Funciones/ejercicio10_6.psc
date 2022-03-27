Algoritmo ejercicio10_6
	
	//Pide al usuario dos pares de números x1,y2 y x2,y2,
	//que representen dos puntos en el plano. Calcula y 
	//muestra la distancia entre ellos (raíz cuadrada de ((x1-x2)2 + (y1-y2)2).
	
	definir x1, y1, x2 , y2 Como Entero
	
	Escribir "Dime las coordenadas del primer punto (x,y)"
	leer x1
	leer y1
	
	escribir "Dime las coordenadas del segundo punto (x,y)"
	leer x2
	leer y2
	
	distancia=RC((x1-x2)^2+(y1-y2)^2)
	
	escribir "La distancia entre ellos es " distancia 
	
FinAlgoritmo
