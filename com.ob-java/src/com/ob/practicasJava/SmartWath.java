package com.ob.practicasJava;

public class SmartWath extends SmartDevice {
	
	String modelo;
	String color;
	

	public SmartWath(){}


	public SmartWath(String modelo, String color) {

		this.modelo = modelo;
		this.color = color;
	}


	@Override
	public String toString() {
		return "SmartWath [modelo=" + modelo + ", color=" + color + ", fabricante=" + fabricante + ", paisOrigen="
				+ paisOrigen + ", anioFabricacion=" + anioFabricacion + "]";
	}
	
	
	 
}
