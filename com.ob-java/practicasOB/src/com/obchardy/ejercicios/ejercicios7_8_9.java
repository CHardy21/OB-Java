package com.obchardy.ejercicios;

public class ejercicios7_8_9 {

	public static void main(String[] args) {
		
		// Dada la función:
		// public static String reverse(String texto) { }
		// Escribe el código que devuelva una cadena al revés.
		
		String cadena = "Hola Mundo";
		System.out.println(reverse(cadena));
		
	}
	
	public static String reverse(String texto) { 
		String textoAlreves="";
		for(int i=texto.length(); i >0; i--) {
			 textoAlreves = textoAlreves + texto.charAt(i-1);
		}
		return textoAlreves;
	}
	
	
	
	
}

/*
Enunciado del ejercicio:

Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
*/