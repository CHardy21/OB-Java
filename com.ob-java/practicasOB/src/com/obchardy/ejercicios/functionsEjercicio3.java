package com.obchardy.ejercicios;


public class functionsEjercicio3 {

	public static void main(String[] args) {
		
	Double param1 = 10.;
	Double param2 = 2.5;
	Double param3 = 1.;
	
	Double resultado = funcion1(param1, param2,param3);
	
	System.out.println("Resultado de la suma: "+resultado);	
	
	System.out.println("==============================");
	System.out.println("  Segunda parte");
	System.out.println("==============================");
	
	
	
	System.out.println("Puertas Ini: "+cochee.puertas);	
	int resultado1 = cochee.aumentarPuertas(2);
	

	System.out.println("Puertas Total: "+resultado1);	
	

	
	}
	
	

	public static Double funcion1(Double param1, Double param2, Double param3) {
		return param1+param2+param3;
	}

	public class cochee{
		static int puertas= 4;
		
				
		public cochee() {
			super();
		}



		public static int aumentarPuertas(int puertasAdicional) {
			return puertas = puertas+puertasAdicional;
			
		}


		
	}
}
