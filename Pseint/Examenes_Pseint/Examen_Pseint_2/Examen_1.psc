Algoritmo Examen_1
	
	
	definir op,n1,n2 Como Entero
	
	escribir "MENU DE OPCIONES"
	Escribir "1. Sumar dos numeros"
	escribir "2. Restar dos numeros"
	escribir "3. Multiplicar dos numeros"
	escribir "4. Dividir dos numeros"
	escribir "0. Salir"
	escribir "Introduce una opci�n:"
	leer op
	
	Mientras op<>0 Hacer
		
	escribir "Introduce el primer n�mero"
	leer n1
	escribir "Introduce el segundo n�mero"
	leer n2
	
		Segun op Hacer
		
			1:
				escribir "Resultado:" suma(n1,n2)
				escribir ">"
			2:
				escribir "Resultado:" resta(n1,n2)
				escribir ">"
			3:
				escribir "Resultado:" multiplicacion(n1,n2)
				escribir ">"
			4:
				escribir "Resultado:" dividir(n1,n2)
				escribir ">"
			De Otro Modo:
				escribir "La n�mero escogido no est� dentro de las opciones, vuelve a escoger opci�n"
				escribir ">"
		Fin Segun
	
	escribir "MENU DE OPCIONES"
	Escribir "1. Sumar dos numeros"
	escribir "2. Restar dos numeros"
	escribir "3. Multiplicar dos numeros"
	escribir "4. Dividir dos numeros"
	escribir "0. Salir"
	escribir "Introduce una opci�n:"
	leer op
	
Fin Mientras
	
FinAlgoritmo

funcion resultado<-suma(n1,n2)
	resultado=n1+n2
	
FinFuncion

funcion resultado<-resta(n1,n2)
		resultado=n1-n2
FinFuncion

funcion resultado<-multiplicacion(n1,n2)
	resultado=n1*n2
FinFuncion

funcion resultado<-dividir(n1,n2)
	resultado=n1/n2
FinFuncion
	