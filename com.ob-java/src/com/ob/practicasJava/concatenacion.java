package com.ob.practicasJava;

public class concatenacion {
	
	public static void main(String[] args) {
		
		String[] textos = { "Hola", "Mundo" , "!!!" };
		String resultado = "";
		
		for(String texto : textos) {
			
			resultado = resultado + " " +texto;
		}
		
		System.out.println(resultado);
	}

}