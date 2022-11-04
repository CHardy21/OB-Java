package Poo.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV2 {
	
	private static List<Empleado> empleados = new ArrayList<>();
	
	
	// Guardar 
	public void saveV2(Empleado empleado) {
		empleados.add(empleado);
	}

	// Consultar
	public List<Empleado> findAllV2() {
		return empleados;
	}
}

