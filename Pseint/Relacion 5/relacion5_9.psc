Algoritmo Relacion5_9
	
	
	//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos. Cuando el usuario no quiera
	//insertar más números, introducirá un número negativo y el algoritmo, antes de acabar, mostrará la media
	//de los números positivos que ha introducido anteriormente el usuario.
	
	
	definir n Como Entero
	
	escribir "Dime un número entero positivo"
	
	cont=-1
	suma=0
	
	Mientras n>=0 Hacer
		
		cont=cont+1
		suma=suma+n
		leer n
		
	Fin Mientras
	
	media=suma/cont
	escribir media
	
FinAlgoritmo
