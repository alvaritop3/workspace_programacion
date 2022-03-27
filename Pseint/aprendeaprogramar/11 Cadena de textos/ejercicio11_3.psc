Algoritmo ejercicio11_3
	
	//Crea un programa que pida su nombre al usuario y 
	//diga cuántas vocales contiene (por ejemplo, "Aurora" tiene 4 vocales).
	
	definir n como cadena
	cont=0
	
	escribir "Dime tu nombre"
	leer n 
	
	n=Minusculas(n)
	
	Para i=1 Hasta longitud(n) Con Paso 1 Hacer
		
		si subcadena(n, i,i)="a" o subcadena(n, i,i)="e" o subcadena(n, i,i)="i" o subcadena(n, i,i)="o" o subcadena(n, i,i)="u" Entonces
				cont=cont+1
			FinSi
			
				
	FinPara
	
	escribir "Tu nombre tiene " cont " vocal/es "
	
	//Otra forma podría ser llamarle a subcadena(n , i,i) con cualquier nombre, por ejemplo p=subcadena(n , i,i)
	//De esa manera, en el bucle para encontrar las vocales sería: si p="a" o p="e" o p.....
	
	
	
	
FinAlgoritmo
