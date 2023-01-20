package com.obchardy.ejercicios;

public class Coche {

	int puertas = 4;

	public Coche() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void adicionarPuertas(int addPuertas) {
		this.puertas = this.puertas+ addPuertas;
	}
}
