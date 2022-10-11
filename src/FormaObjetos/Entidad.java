package FormaObjetos;

import javax.swing.*;

public class Entidad {

	private double ladoA; // Inicializa la variable global
	private double ladoB; // Inicializa la variable global
	
	public void ingresarDatos() {
		
		String cadena; // Inicializa la variable
		
		cadena = JOptionPane.showInputDialog( null, "Ingresar la longitud del lado A: ");
		ladoA = Double.parseDouble( cadena ); // Solicitamos los datos al usuario
		
		cadena = JOptionPane.showInputDialog( null, "Ingresar la longitud del lado B: ");
		ladoB = Double.parseDouble( cadena ); // Solicitamos los datos al usuario
	}
	
	public void calcularArea() {
		
		double resultado; // Inicializa la variable
		
		resultado = ladoA * ladoB; // Realizamos una operacion con la variable resultado
		
		JOptionPane.showInputDialog( null, "El resultado es: " + resultado); // Mostramos el resultado de la operacion
	}
	
}
