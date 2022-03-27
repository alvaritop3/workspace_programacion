Algoritmo ejercicio_9
	
	definir n1, n2, n3 Como Real
	
	escribir "Dime un número entero"
	leer n1
	Escribir "Dime otro número entero"
	leer n2
	escribir "Dime otro numero entero"
	leer n3
	
	si n1=n2+n3
		escribir n3 " es la suma de los otros dos anteriores"
	FinSi
	
	si n2=n1+n3
		Escribir  n2 " es la suma de los otros dos números"
	FinSi
	
	si n3=n1+n2
		escribir n3 " es la suma de los otros dos números"
	FinSi
	
	si n1<>n2+n3 o n2<>n1+n3 o n3<>n1+n2
		escribir "ningún número es la suma de los otros dos"
	FinSi
	
FinAlgoritmo
