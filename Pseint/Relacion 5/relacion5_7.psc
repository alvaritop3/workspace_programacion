Algoritmo relacion5_7
	
	
	//Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir sumando.
	//Cuando el usuario no quiera insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo, antes
	//de acabar, mostrar� la suma de los n�meros positivos introducidos anteriormente por el usuario
	//definir num,num2 Como Entero
	
	definir num, num2 Como Entero
	
	num=0
	
	Escribir "Dime un numero entero positivo."
	escribir "Cuando quiera finalizar, escribe un n�mero negativo."
	
	leer num
	
	Mientras num>=0 y num2>=0 Hacer
		
		leer num2
		num=num+num2
		escribir "El resultado de la suma es " num
		
	Fin Mientras
	
	escribir "El resultado de la suma de todos sus numeros anteriores es" num
	
	//Se puede hacer con un repetir 
	
	
FinAlgoritmo

