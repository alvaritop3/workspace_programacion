Algoritmo relacion5_8
	
	
	//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir contando.
	//Cuando el usuario no quiera insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo, antes
	//de acabar, mostrar� cuantos n�meros positivos ha introducido anteriormente el usuario.
	//definir num, cont Como Entero
	
	definir cont Como Entero
	
	cont=0
	
	Escribir "Dime un numero entero positivo."
	escribir "Cuando quiera finalizar, escribe un n�mero negativo."
	
	leer num
	Si num>=0 
		
	Mientras num>=0 Hacer
		
		cont=cont+1
		leer num
		
	Fin Mientras
	
	escribir "Ha introducido " cont " n�meros"
	
sino 
	Escribir "Fin del programa"
	
FinSi

	
FinAlgoritmo
