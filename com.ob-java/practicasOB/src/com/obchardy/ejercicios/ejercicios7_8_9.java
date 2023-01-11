package com.obchardy.ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ejercicios7_8_9 {

	public static void main(String[] args) {
		
		// Dada la función:
		// public static String reverse(String texto) { }
		// Escribe el código que devuelva una cadena al revés.
		
		String cadena = "Hola Mundo";
		System.out.println(cadena+" - Ahora alreves -> "+reverse(cadena));
		
		
		// Crea un array unidimensional de Strings y recórrelo, 
		// mostrando únicamente sus valores.
		
		System.out.println("=======================");
		
		String arrayUni[] = {"Pedro", "Juan", "Christian","David"};
		
		for(String elemento : arrayUni ) {
			System.out.println(elemento);
			}
		
		// Crea un array bidimensional de enteros y recórrelo, 
		// mostrando la posición y el valor de cada elemento en ambas dimensiones.
		
		System.out.println("=======================");
		
		int arrayBiDim[][] = new int [2][4];
		arrayBiDim[0][0] = 2;
		arrayBiDim[0][1] = 4;
		arrayBiDim[0][2] = 6;
		arrayBiDim[0][3] = 8;
		
		arrayBiDim[1][0] = 10;
		arrayBiDim[1][1] = 20;
		arrayBiDim[1][2] = 30;
		arrayBiDim[1][3] = 40;
		

		for (int i=0; i < arrayBiDim.length;i++) {

			for (int j=0; j < arrayBiDim[i].length;j++){				
				System.out.println("["+i+"]["+j+"] => "+arrayBiDim[i][j]);
			}
		}
		
		// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
		// Elimina el 2o y 3er elemento y muestra el resultado final.
		System.out.println("=======================");
		
		Vector<String> myVector = new Vector<String>();
		
		myVector.add("Armando");
		myVector.add("Esteban");
		myVector.add("Susana");
		myVector.add("Elba");
		myVector.add("Rogelio");

		System.out.println("vector:");
		System.out.println(myVector);
		
		myVector.remove("Esteban");
		myVector.remove(1);
		
		System.out.println("vector luego de eliminar 2do y 3er elemento:");
		System.out.println(myVector);
		
		// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
		/*
		 * El problema es el costo computacional que tiene al tener q esta duplicando su capacidad.
		*/
		
		// Crea un ArrayList de tipo String, con 4 elementos. 
		// Cópialo en una LinkedList. 
		// Recorre ambos mostrando únicamente el valor de cada elemento.
		System.out.println("=======================");
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		
		LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
		
		System.out.println("Elementos del ArrayList:");
		for(String elemento : lista) {
			System.out.println(" * "+elemento);
		}
		System.out.println("Elementos del LinkedList:");
		for(String elemento : listaEnlazada) {
			System.out.println(" * "+elemento);
		}
	
		
		// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
		// A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
		// Por último, vuelve a recorrerlo y muestra el ArrayList final. 
		// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
		System.out.println("=======================");
		
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		for(int i=1;i<11;i++) {
			listaEnteros.add(i);
		}
		
		System.out.println("ListaEnteros: ");
		System.out.println(listaEnteros);
		
		for(int i=0;i<listaEnteros.size(); i++) {
			if(listaEnteros.get(i) %2 == 0) {
				listaEnteros.remove(i);
			}
		}
		System.out.println("ListaEnteros sin Números pares: ");
		System.out.println(listaEnteros);
		
		
		// Crea una función DividePorCero. 
		// Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). 
		// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
		// Finalmente, mostraremos en cualquier caso: "Demo de código".
		System.out.println("=======================");
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingresa 2 números enteros.(Dividendo y Divisor)");
			
			int num1= scanner.nextInt();
			int num2= scanner.nextInt();
			
			try {
				Double resultado = DividePorCero(num1, num2);
				System.out.println("Resultado: "+ resultado);
				
			} catch (ArithmeticException e) {
				System.out.println("Esto no puede hacerse.");
				
			} catch (Exception e) {
				System.out.println(e.getClass());
				
			}finally {
				System.out.println("Demo de código");
				scanner.close();
			}


		// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
		// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
		System.out.println("=======================");	
		
		try {
			
			InputStream fichero = new FileInputStream("D:\\CHardyE-Projects\\Java\\Practicas\\OpenBootcamp-Java\\com.ob-java\\practicasOB\\src\\com\\obchardy\\ejercicios\\input_texto.txt");
					
			try{
				byte[] datos = fichero.readAllBytes();
				for(byte dato : datos) {
					System.out.print((char) dato);
				}
				
			} catch (IOException e){
				System.out.println("Ups! No puedo leer los datos. msg: "+ e.getMessage());
			}
			
		} catch(FileNotFoundException e){
			
			System.out.println("Ups! ha ocurrido un problema. msg: "+e.getLocalizedMessage());
		} 
			
			
	
		
		
		

		// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
		
	}
	
	public static String reverse(String texto) { 
		String textoAlreves="";
		for(int i=texto.length(); i >0; i--) {
			 textoAlreves = textoAlreves + texto.charAt(i-1);
		}
		return textoAlreves;
	}
	
	public static Double DividePorCero(int num1 , int num2) throws ArithmeticException {
		return (double) (num1/num2);
	}
	
	
}

/*
Enunciado del ejercicio:












*/