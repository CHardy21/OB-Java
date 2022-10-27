package Poo.clases;

public class Vehiculo {

	// 1. Atributos
	
	String fabricante;
	String modelo;
	Double cc;
	int year;
	boolean sport;
	int speed;
	
	// 2. Constructores
	
	public Vehiculo() {}
	
	public Vehiculo(String fabricante, String modelo, Double cc, int year, boolean sport, int speed) {
		
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cc = cc;
		this.year = year;
		this.sport = sport;
		this.speed = speed;
		
	}

	
	
	// 3. Metodos (comportamientos)
	
	public void acelerar(int quantity) {
		this.speed += quantity;
	}
	
	// getters y setters
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCc() {
		return cc;
	}

	public void setCc(Double cc) {
		this.cc = cc;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSport() {
		return sport;
	}

	public void setSport(boolean sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "Vehiculo [fabricante=" + fabricante + ", modelo=" + modelo + ", cc=" + cc + ", year=" + year
				+ ", sport=" + sport + ", speed=" + speed + ", toString()=" + super.toString() + "]";
	}
	
	// toString
	
	
}
