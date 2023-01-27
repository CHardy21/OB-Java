package com.obchardy.ejercicios;


public class Ejercicio9HerenciaPolimirfismoInterfaces {

	public static void main(String[] args) {
		
	/* 
	 * 1. Crea una clase Persona con las siguientes variables:
	 * 		La edad
	 * 		El nombre
	 * 		El teléfono
	 * 2. Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
	 * 	  esta nueva clase tendrá la variable credito solo para esa clase.
	 * 3. Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y
	 *    el credito, tienes que darles valor y mostrarlas por pantalla.
	 * 4. Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
	 *    y con una variable salario que solo tenga la clase Trabajador.
	 */
		
		System.out.println("==============================");
		System.out.println("=   CLIENTE                  =");
		System.out.println("==============================");
		
		Person persona = new Person();
		
		persona.setEdad(22);
		persona.setNombre("Esteban Quito");
		persona.setTelefono("+5494445123456");
		
		
		Cliente cliente = new Cliente();
		
		cliente.setEdad(22);
		cliente.setNombre("Esteban Quito");
		cliente.setTelefono("+5494445123456");
		cliente.setCredito(35);
		
		System.out.println("Nombre:   "+ cliente.getNombre());
		System.out.println("Edad:     "+ cliente.getEdad());
		System.out.println("Telefono: "+ cliente.getTelefono());
		System.out.println("Credito:  "+ cliente.getCredito());
		
		System.out.println("==============================");
		System.out.println("=   TRABAJADOR               =");
		System.out.println("==============================");
		
		Trabajador trabajador = new Trabajador();
		
		trabajador.setEdad(30);
		trabajador.setNombre("Elsa Pato");
		trabajador.setTelefono("+5494445126456");
		trabajador.setSalario(3500.45);
		
		System.out.println("Nombre:   "+ trabajador.getNombre());
		System.out.println("Edad:     "+ trabajador.getEdad());
		System.out.println("Telefono: "+ trabajador.getTelefono());
		System.out.println("Salario:  "+ trabajador.getSalario());
		
		System.out.println("==============================");
}
}

	class Person{
		
		private int edad;
		private String nombre;
		private String telefono;

		public Person() {
			super();
		}

		public Person(int edad, String nombre, String telefono) {
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
	
	class Cliente extends Person{
		
		int credito;

		
		public int getCredito() {
			return credito;
		}

		public void setCredito(int credito) {
			this.credito = credito;
		}
	}

class Trabajador extends Person{
	Double salario= 100.0;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}