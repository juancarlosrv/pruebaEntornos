package claseEntrada;

/**
 * Crea la clase Entrada con las propiedades:
 * localidad:int
 * precio: double
 * ocupada: boolean
 * 
 * Entrada(double precio) // Por defecto inicializa ocupada a false. Y el n�mero de la localidad deber� asignarse de forma autom�tica, la primera entrada creada ser� la uno, la segunda que se cree la 2 y as� sucesivamente.
 * toString() //redefine el m�todo para que muestre todas las propiedades.
 * @author Juan Carlos
 *
 */

public class Entrada {
	
	//propiedades
	
	private static int localidad ;
	private double precio;
	private boolean ocupada;
	
	
	//constructor
	
	public Entrada(double precio) {
		
		this.ocupada = false;
		this.precio = precio;
		Entrada.localidad = 1 ;
		
		
	}
	
	//metodos 
	
	@Override
	public String toString() {
		
		return "el precio de : " + this.precio + " euros " + " el estado de la entrada es : " + this.ocupada+ " y la localidad es : " + localidad++;
	}
	
	
	
	

}
