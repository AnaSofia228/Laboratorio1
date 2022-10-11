package FormaObjetos;

public class Aplicacion {

	public static void main(String[] args) {
		
		Entidad  rectangulo;  // Llamamos a la clase entidad para usarla como clase logica
		
		rectangulo = new Entidad();
		
		rectangulo.ingresarDatos(); // Esta llamando al metodo
		rectangulo.calcularArea(); // Esta llamando al metodo

	}

}
