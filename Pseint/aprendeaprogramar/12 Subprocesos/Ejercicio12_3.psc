//Crea un programa que pida dos n�mero enteros al usuario 
//y diga si alguno de ellos es m�ltiplo del otro. 
//Crea una funci�n EsMultiplo que te ayude a que 
//el proceso principal sea legible.

SubProceso  EsMultiplo(n1,n2)
	
	si n1%n2=0 entonces 
		escribir n1 " es m�ltiplo de " n2
	FinSi
	
	si n2%n1=0 Entonces
		escribir n2 " es m�ltiplo de " n1
	FinSi
	
	si n2%n1<>0 y n1%n2<>0 Entonces
		escribir " No son m�ltiplos entre ellos"
	FinSi
Finsubproceso


Algoritmo Ejercicio12_3
	
	escribir "Dime un n�mero"
	leer n1
	escribir "Dime otro n�mero"
	leer n2
	
	EsMultiplo(n1,n2)
	
	
FinAlgoritmo
