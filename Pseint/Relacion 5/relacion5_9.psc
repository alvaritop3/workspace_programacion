Algoritmo Relacion5_9
	
	
	//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos. Cuando el usuario no quiera
	//insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo, antes de acabar, mostrar� la media
	//de los n�meros positivos que ha introducido anteriormente el usuario.
	
	
	definir n Como Entero
	
	escribir "Dime un n�mero entero positivo"
	
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
