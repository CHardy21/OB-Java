package com.obchardy.ejercicios;


public class Ejercicio8Encpsulacion {

	public static void main(String[] args) {
		
	/*
	 * Para practicar la encapsulación:
	 * 	1. Crear clase Persona.
	 *  2. Crear variables las privadas edad, nombre y telefono de la clase Persona.
	 *  3. Crear gets y sets de cada propiedad.
	 *  4. Crear un objeto persona en el main.
	 *  5. Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
	 *     por último muéstralas por consola.
	 */
		
		System.out.println("==============================");
		
		Persona persona = new Persona();
		
		persona.setEdad(22);
		persona.setNombre("Esteban Quito");
		persona.setTelefono("+5494445123456");
		
		System.out.println("Nombre:   "+ persona.getNombre());
		System.out.println("Edad:     "+ persona.getEdad());
		System.out.println("Telefono: "+ persona.getTelefono());
		
		System.out.println("==============================");
}
}

	class Persona{
		
		private int edad;
		private String nombre;
		private String telefono;

		public Persona() {
			super();
		}

		public Persona(int edad, String nombre, String telefono) {
			super();
			this.edad = edad;
			this.nombre = nombre;
			this.telefono = telefono;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		
	}
