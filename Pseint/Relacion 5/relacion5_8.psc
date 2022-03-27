Algoritmo relacion5_8
	
	
	//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir contando.
	//Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes
	//de acabar, mostrará cuantos números positivos ha introducido anteriormente el usuario.
	//definir num, cont Como Entero
	
	definir cont Como Entero
	
	cont=0
	
	Escribir "Dime un numero entero positivo."
	escribir "Cuando quiera finalizar, escribe un número negativo."
	
	leer num
	Si num>=0 
		
	Mientras num>=0 Hacer
		
		cont=cont+1
		leer num
		
	Fin Mientras
	
	escribir "Ha introducido " cont " números"
	
sino 
	Escribir "Fin del programa"
	
FinSi

	
FinAlgoritmo
