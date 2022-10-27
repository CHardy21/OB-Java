package com.ob.practicasJava;

public class SmartPhone extends SmartDevice {
	
	String modelo;
	String capacidadRam;
	String procesador;
	
	public SmartPhone(){}

	public SmartPhone(String modelo, String capacidadRam, String procesador) {
	
		this.modelo = modelo;
		this.capacidadRam = capacidadRam;
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "SmartPhone [modelo=" + modelo + ", capacidadRam=" + capacidadRam + ", procesador=" + procesador
				+ ", fabricante=" + fabricante + ", paisOrigen=" + paisOrigen + ", anioFabricacion=" + anioFabricacion
				+ "]";
	}
	
	      
	
}
