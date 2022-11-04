package Poo.conInterfaces;

import java.util.List;
import Poo.SinInterfaces.Empleado;

public interface EmpleadoCRUD {

	/* Solo se declaran los metodos,
	 * No se implementan.
	 * 
	 * Actua como un contrato
	 */
	
	void save(Empleado empleado);
	
	List<Empleado> findAll();
}
