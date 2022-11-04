package Poo.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {
	
	private static List<Empleado> empleados = new ArrayList<>();
	
	
	// Guardar 
	public void save(Empleado empleado) {
		empleados.add(empleado);
	}

	// Consultar
	public List<Empleado> findAll() {
		return empleados;
	}
	
}
