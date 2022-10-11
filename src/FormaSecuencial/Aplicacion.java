package FormaSecuencial;

import javax.swing.*;

public class Aplicacion {

	public static void main(String[] args) {
		
		String cadena; // Inicializamos la variable
		double ladoA; // Inicializamos la variable
		double ladoB; // Inicializamos la variable
		double resultado; // Inicializamos la variable
		
		cadena = JOptionPane.showInputDialog( null, "Ingrese la cantidad del lado A: ");
		ladoA = Double.parseDouble( cadena ); // Solicitamos los datos al usuario
		
		cadena = JOptionPane.showInputDialog( null, "Ingrese la cantidad del lado B: ");
		ladoB = Double.parseDouble( cadena ); // Solicitamos los datos al usuario
		
		resultado = ladoA * ladoB; // Realizamos una operacion con la variable resultado
		
		JOptionPane.showInputDialog( null, "El resultado es: " + resultado); // Mostramos el resultado de la operacion

	}

}
