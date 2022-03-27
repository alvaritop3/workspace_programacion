Algoritmo Examen_2
	
	//procedimiento o funciones
	
	
	escribir "MENÚ PRINCIPAL"
	escribir "---------------"
	escribir "1. Operaciones básicas"
	escribir "2. Operaciones variadas"
	escribir "0. SALIR"
	escribir ""
	escribir "Introduce una opción:"
	leer opprincipal				//opcion 1principal
	

	
	
	
	Mientras opprincipal<>0 Hacer
		
		si opprincipal=1 entonces
			
			basicas
			leer opbasica
			
			mientras opbasica<>0 hacer
			Segun opbasica Hacer
						
				1:
					escribir "SUMA"
					escribir "Dime dos numeros"
					leer n1
					leer n2
					escribir "Resultado:" suma(n1,n2)
					escribir ">"
							
				2:
					escribir "RESTA"
					escribir "Dime dos numeros"
					leer n1
					leer n2
					escribir "Resultado:" resta(n1,n2)
					escribir ">"
							
				3:
					escribir "MULTIPLICACIÓN"
					escribir "Dime dos numeros"
					leer n1
					leer n2
					escribir "Resultado:" multiplicacion(n1,n2)
					escribir ">"
							
				4:
					escribir "DIVISIÓN"
					escribir "Dime dos numeros"
					leer n1
					leer n2
					escribir "Resultado:" dividir(n1,n2)
					escribir ">"
							
			Fin Segun
			fin mientras
		FinSi
		
		si opprincipal=2 entonces
			
			escribir "MENU DE OPCIONES VARIADAS"
			Escribir "1. Número y Día"
			escribir "2. Suma los primeros números n naturales"
			escribir "3. Número primo"
			escribir "4. Invertir un número de 4 cifras"
			escribir "0. REGRESAR"
			leer opvariadas
			
			mientras opvariadas<>0 hacer
				
			Segun opvariadas Hacer
				1:
					escribir "CONVIERTE NUMERO A DIA"
					escribir "Introduce el número de día:"
					leer n3 
					conversorDia(n3)
				2:
					escribir "SUMA DE LOS PRIMEROS N NUMEROS"
					leer n3
					escribir "La suma de los primeros n números es" sumanprimos(n3)
				3:
					escribir "Número primo"
					escribir "Dime un número"
					leer n3
					escribir "¿Es primo el número que has introducido?" primo(n3)
					
				4:
					escribir "INVERTIR NÚMERO DE 4 CIFRAS"
					escribir "Dime un númerode 4 cifras"
					leer n3 
					escribir sin saltar "Tu número invertido es "
					invertir(n3)
					escribir ""
					
			Fin Segun
			FinMientras
		fin si
		
	FinMientras
	
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

subproceso conversorDia(n3)
	Segun n3 Hacer
		1:
			escribir "Lunes"
		2:
			escribir "Martes"
		3:
			escribir "Miércoles"
		4:
			escribir "Jueves"
		5:
			escribir "Viernes"
		6:
			escribir "Sábado"
		7:
			escribir "Domingo"
	Fin Segun
FinSubProceso

funcion resultado<-sumanprimos(n3)
	cont=0
	para i=1 hasta n3 Hacer
		cont=cont+i
	FinPara
	escribir cont
FinFuncion

SubAlgoritmo resultado <- primo(n3)
    cantidadDivisores <- 0
    Para i <- 1 Hasta n3 Hacer
        Si n3 % i = 0 Entonces
            cantidadDivisores <- cantidadDivisores + 1
        FinSi
    FinPara
    Si cantidadDivisores <= 2 Entonces
        resultado <- verdadero
    Sino
        resultado <- falso
    FinSi
FinSubAlgoritmo

subproceso invertir(n3)
	para i=Longitud(n3) hasta 1  hacer
		escribir sin saltar subcadena(n3, i,i)
	FinPara
Finsubproceso

subproceso basicas
	escribir "MENU DE OPCIONES BÁSICAS"
	Escribir "1. Sumar dos numeros"
	escribir "2. Restar dos numeros"
	escribir "3. Multiplicar dos numeros"
	escribir "4. Dividir dos numeros"
	escribir "0. REGRESAR"	
FinSubProceso
	