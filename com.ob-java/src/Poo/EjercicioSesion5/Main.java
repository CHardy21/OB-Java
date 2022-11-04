package Poo.EjercicioSesion5;

public class Main {
	

	static CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();
	
	public static void main(String[] args) {
		
	
		cocheCRUDImpl.save();
		cocheCRUDImpl.delete();
		cocheCRUDImpl.findAll();


		
	}

	

}
