Algoritmo Modificaciones
		
		//Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de cuatro filas por cinco columnas. El
		//usuario intentará averiguar dónde está el tesoro de la siguiente forma.
		//- En cada tirada se pide la coordenada x y la coordenada y.
		//- Si en esa ubicación no se encuentra ni la mina ni el tesoro, se marcará en el cuadrante una X.
		//- Si en esa ubicación se encuentra la mina, el programa mostrará un mensaje indicando al jugador que ha
		// perdido y dibujará en el cuadrante el tesoro (con un simbolo de ?) y la mina ( con un símbolo de *).
		//- Si en esa ubicación se encuentra el tesoro, el programa mostrará un mensaje indicando al jugador que
		// ha ganado y dibujará en el cuadrante el tesoro (con un simbolo de ?) y la mina ( con un símbolo de *).
		//-El juego finaliza cuando el jugador ha encontrado la mina o el tesoro
		
		dimension mapa[4,5]
		

		escribir "      - - - - - - - - - - - - - - - - - - - - - -"
		escribir "      | E N C U E N T R A    E L    T E S O R O |"
		escribir "      - - - - - - - - - - - - - - - - - - - - - -"
		escribir ""
		escribir "                 Normas del Juego:" 
		escribir "El mapa es una tabla 4x5, si no encuentras las coordenadas "
		escribir "de la mina o el tesoro, volverás a introducir los datos"
		//relleno la matriz del mapa con espacios
		
		para i=1 hasta 4 Hacer
			para j=1 hasta 5 Hacer
				mapa[i,j]= "  " // modificar esto, quitar a poner espacio
			FinPara
			escribir ""
		FinPara
		
		xtesoro=azar(4)+1 //genero las coordenadas al azar de tesoro. 
		ytesoro=azar(5)+1
		
		xmina=azar(4)+1 //genero las coordenadas al azar de la mina. 
		ymina=azar(5)+1
		
		
		Mientras xtesoro=xmina y ytesoro=ymina Hacer    //con este bucle conseguimos que la mina nunca esté en la coordenada del tesoro.
			xmina=azar(4)+1
			ymina=azar(5)+1
		Fin Mientras
		
		escribir "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
		escribir ""
		
		// pintar la matriz vacía en pantalla pero tiene los datos dentro
		
		para i=4 hasta 1 Hacer
			
			escribir sin saltar  i "|" //con esto me pinta los números del lateral.
			
			para j=1 hasta 5 Hacer
				
				escribir sin saltar   mapa[i,j] "  "
				
			FinPara
			
			escribir " "
		FinPara
		
		para j=1 hasta 5 Hacer
			escribir sin saltar "  -"  //con esto me pinta las líneas de abajo.
		FinPara
		
		escribir  " "
		
		para j=1 hasta 5 Hacer
			
			escribir sin saltar "  " j  //con esto me pinta los números de abajo.
			
		FinPara
		
		escribir " "
		escribir " "
		encontrado=falso	//condición para que salga del repetir
		
		Repetir
			escribir ""
			escribir "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
			escribir "Dime una cordenada X"
			leer usux
			escribir "Dime una cordenada Y"
			leer usuy
			escribir "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
			
			
			si (usux>5 o usux<=0) y (usuy>4 o usuy<=0) entonces 
				escribir "Las coordenadas escritas no coinciden con las coordenadas del juego"	//Asegurarnos de que no se sale del rango"
			sino
			// Encuentra la mina
			
			si usux=xmina y usuy=ymina Entonces
				
				escribir "¡¡Has perdido!!  ¡¡Has encontrado la mina!!"
				escribir ""
				mapa[xtesoro,ytesoro]="$ "
				mapa[xmina,ymina]="* "
				
				encontrado=verdadero
				
				para i=4 hasta 1 Hacer
					
					escribir sin saltar  i "| " 
					
					para j=1 hasta 5 Hacer
						
						escribir sin saltar mapa[i,j] "  "
						
					FinPara
					
					escribir " "
				FinPara
				escribir sin saltar " "
				para j=1 hasta 5 Hacer
					escribir sin saltar "   -"  
				FinPara
				
				escribir  " "
				escribir sin saltar " "
				para j=1 hasta 5 Hacer
					
					escribir sin saltar "   " j  
					
				FinPara
				escribir ""
			FinSi
			
			//Encuentra el tesoro
			
			si usuy=xtesoro y usux=ytesoro Entonces
				
				escribir "¡¡Has ganado!!  ¡¡Has encontrado el tesoro!!"
				
				mapa[xtesoro,ytesoro]="$"
				mapa[xmina,ymina]="*"
				
				encontrado=verdadero
				
				para i=4 hasta 1 Hacer
					
					escribir sin saltar  i "| " 
					
					para j=1 hasta 5 Hacer
						
						escribir sin saltar   mapa[i,j] "  "
						
					FinPara
					
					escribir " "
				FinPara
				
				para j=1 hasta 5 Hacer
					escribir sin saltar "   -"  
				FinPara
				
				escribir  " "
				
				para j=1 hasta 5 Hacer
					
					escribir sin saltar "   " j  
				FinPara
				escribir " "
				
			FinSi
			
			
			//Cuando no acierta y se pone la X
			
			si no encontrado Entonces
				
				mapa[usuy,usux]="X"
				
				escribir "¡¡No has acertado, sigue probando!!"
				escribir ""
				
				para i=4 hasta 1 Hacer
					
					escribir sin saltar  i "| " 
					
					para j=1 hasta 5 Hacer
						
						escribir sin saltar  mapa[i,j] "  "
						
					FinPara
					
					escribir " "
				FinPara
				
				para j=1 hasta 5 Hacer
					escribir sin saltar "   -"  
				FinPara
				
				escribir  " "
				
				para j=1 hasta 5 Hacer
					
					escribir sin saltar "   " j  
				FinPara
				escribir ""
			Finsi
			
		FinSi
		
		Hasta que encontrado
		
		
		
		
		
		escribir " " 
	

FinAlgoritmo
