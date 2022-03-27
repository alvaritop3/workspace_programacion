Algoritmo Relacion5_6
	
	
	//Escribe un algoritmo que muestre por pantalla la suma de los números pares desde el 1 hasta el 20 y
	//también la multiplicación de los números impares desde el 1 hasta el 20.
	
	
	definir x1,c1 Como Entero
	
	
	x1=0
	c1=0


	Mientras c1<=20 Hacer
		x1=x1+c1
		c1=c1+2
	Fin Mientras

	escribir "la suma de numeros pares desde el 1 hasta el 20 es " x1

	m=1
	p=1

	Mientras p<=20 Hacer
		m=m*p
		p=p+2
	Fin Mientras

	escribir "La multiplicación de los numeros impares desde el 1 hasta el 20 es " m
	
	
	//se puede hacer con un para y un si,sino; si i%2==0 entonces...
	
	
FinAlgoritmo
