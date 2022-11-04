package Poo.SinInterfaces;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();
		
		Empleado juanito = new Empleado("Juanito", 25, 75000, true);
		Empleado patricia = new Empleado("Patricia", 55, 85000, true);
		Empleado christian = new Empleado("Christian", 45, 55000, true);
		
		// guardando empleados
		empleadoCRUD.save(juanito);
		empleadoCRUD.save(christian);
		empleadoCRUD.save(patricia);
		
		// consultando empleados
		
		List<Empleado> empleados = empleadoCRUD.findAll();
		
		System.out.println(empleados);
	
	
	
	}

}


