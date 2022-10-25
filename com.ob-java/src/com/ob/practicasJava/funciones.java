package com.ob.practicasJava;

public class funciones {

	public static void main(String[] args) {
			
		double precio = 100.1;
		
		System.out.println("El precio Neto es:        " + precio);
		System.out.println("El precio + Iva (21%) es: " + precioMasIva(precio));
	}
		
	public static double precioMasIva(double precio) {
		return precio*1.21;
	}
		
}
