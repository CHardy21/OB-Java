package Poo.EjercicioSesion5;

public class Coche {
	
	private String nombre="default";

	public Coche() {}

	public Coche(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + "]";
	}
	
	

}
