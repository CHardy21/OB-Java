package com.obchardy.ejercicios;


public class functionsEjercicio4 {

	public static void main(String[] args) {
	
	/*
	 En este ejercicio practicarás las estructuras de control, para ello deberás crear:
	 
	 1.- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
	 	 Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
	 2.- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
	  	 el bloque de código que tendrá el bucle deberá:
	  	 	* Incrementar el valor de la variable en uno cada vez que se ejecute.
	  	 	* Mostrarlo por pantalla cada vez que se ejecute.
	 3.- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
	 4.- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición 
	 	 será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y 
	 	 deberá mostrarse por pantalla.
	 5.- Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
	  	 Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación 
	  	 en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.	
	 */
	
		
	System.out.println("==============================");
	System.out.println("  Punto 1.- IF");
	System.out.println("==============================");
	
	Integer numeroIf = 0;
	
	if (numeroIf > 0) {
		System.out.println("numeroIf es "
				+ "Positivo.");
	}else if(numeroIf<0) {
		System.out.println("numeroIf es Negativo.");
	}else {
		System.out.println("numeroIf es 0.");
	}
		
	
	System.out.println("==============================");
	System.out.println("  Punto 2.-  WHILE");
	System.out.println("==============================");
	
	int numeroWhile =0;
	
	while(numeroWhile < 3) {
		numeroWhile++;
		System.out.println("numeroWhile vale:"+ numeroWhile);
	}

	System.out.println("==============================");
	System.out.println("  Punto 3.- DO... WHILE");
	System.out.println("==============================");
	
	numeroWhile =0;
	do {
		numeroWhile++;
		System.out.println("numeroWhile vale:"+ numeroWhile);
		
	} while(numeroWhile < 1);
	
	System.out.println("==============================");
	System.out.println("  Punto 4.- FOR");
	System.out.println("==============================");
	
	//int numeroFOR = 0;

	for ( int numeroFOR =0; numeroFOR <= 3;numeroFOR++) {
		//numeroFOR=i;
		System.out.println("numeroFOR: "+ numeroFOR);
		
	}
	
	
	System.out.println("==============================");
	System.out.println("  Punto 5.- SWICH");
	System.out.println("==============================");
	
	String estacion = "PRIMAVERA";
	
	switch (estacion){
		case "VERANO":
			System.out.println("Es VERANO");
			break;
			
		case "OTOÑO":
			System.out.println("Es OTOÑO");
			break;
			
		case "INVIERNO":
			System.out.println("Es INVIERNO");
			break;
			
		case "PRIMAVERA":
			System.out.println("Es PRIMAVERA");
			break;
			
		default:
			System.out.println("El dato ingresado no es una Estación del año.");
			
			
			
			
			
			
			
	
	}
	
	
}
	
	



}
