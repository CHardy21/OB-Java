package com.ob.practicasJava;

public class tiposDatos {

	public static void main( String[] args) {
		
		byte variableByte = 23;
		short variableShort = 64;
		int variableInt = 128;
		long variableLong = 1234568789l;
		
		System.out.println("\nEnteros.");
		System.out.println("=======");
		System.out.println("Variable Byte:  "+variableByte);
		System.out.println("Variable Short: "+variableShort);
		System.out.println("Variable Int:   "+variableInt);
		System.out.println("Variable Long:  "+variableLong);
		
		float variableFloat = 1.2f;
		double variableDouble = 25.31d;
		
		System.out.println("\nDecimales.");
		System.out.println("=========");
		System.out.println("Variable Float:   "+variableFloat);
		System.out.println("Variable Double:  "+variableDouble);
		
		boolean variableBooleanTrue = true;
		boolean variableBooleanFalse = false;
		
		System.out.println("\nBoolean.");
		System.out.println("=======");
		System.out.println("Variable BooleanTrue:  "+variableBooleanTrue);
		System.out.println("Variable booleanFalse: "+variableBooleanFalse);
		
		char variableChar = 'a';
		String variableString = "Texto del string...";
		
		System.out.println("\nTextos.");
		System.out.println("=======");
		System.out.println("Variable Char:   "+variableChar);
		System.out.println("Variable String: "+variableString);
		
	}

}
