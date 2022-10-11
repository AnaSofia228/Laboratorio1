package FormaClasesMetodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		double ladoA; // Inicializamos variable
		double ladoB; // Inicializamos variable
		
		ladoA = ingresarDatos ("Ingrese la longitud del lado A: "); // Ingresar datos de la clase ingresarDatos
		ladoB = ingresarDatos ("Ingrese la longitud del lado B: "); // Ingresar datos de la clase ingresarDatos
		
		calcularArea (ladoA, ladoB); // Calcula el area con la clase calcularArea

	}
	
	public static double ingresarDatos (String mensaje) { 
		
		String cadena; // Inicializamos variable
		double valor; // Inicializamos variable
		
		cadena = JOptionPane.showInputDialog( null, mensaje ); // Lee el mensaje
		valor = Double.parseDouble( cadena ); // Pide los datos al usuario
		
		return valor; // Retorna el valor de la cadena
		
	}
	
	public static void calcularArea (double a, double b) {
		
		double resultado; // Inicializamos variable
		
		resultado = a * b; // Realizamos una operacion con la variable resultado
		
		JOptionPane.showInputDialog( null, "El resultado es: " + resultado); // Mostramos el resultado de la operacion
		
	}

}
