//Crea un programa que pida dos número enteros al usuario 
//y diga si alguno de ellos es múltiplo del otro. 
//Crea una función EsMultiplo que te ayude a que 
//el proceso principal sea legible.

SubProceso  EsMultiplo(n1,n2)
	
	si n1%n2=0 entonces 
		escribir n1 " es múltiplo de " n2
	FinSi
	
	si n2%n1=0 Entonces
		escribir n2 " es múltiplo de " n1
	FinSi
	
	si n2%n1<>0 y n1%n2<>0 Entonces
		escribir " No son múltiplos entre ellos"
	FinSi
Finsubproceso


Algoritmo Ejercicio12_3
	
	escribir "Dime un número"
	leer n1
	escribir "Dime otro número"
	leer n2
	
	EsMultiplo(n1,n2)
	
	
FinAlgoritmo
