package com.ob.practicasJava;

public class sesion3Clases {

	public static void main(String[] args) {
		
		SmartPhone telefono = new SmartPhone();
		
		System.out.println(telefono);
		
		SmartPhone telefono2 = new SmartPhone("Model-22XD", "8gb", "SnapDragon");
		
		System.out.println(telefono2);

		
		SmartWath reloj = new SmartWath();
		
		System.out.println(reloj);
		
		SmartWath reloj2 = new SmartWath("NNXD", "rojo");
		
		System.out.println(reloj2);
	}

}
