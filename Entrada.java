package claseEntrada;

/**
 * Crea la clase Entrada con las propiedades:
 * localidad:int
 * precio: double
 * ocupada: boolean
 * 
 * Entrada(double precio) // Por defecto inicializa ocupada a false. Y el número de la localidad deberá asignarse de forma automática, la primera entrada creada será la uno, la segunda que se cree la 2 y así sucesivamente.
 * toString() //redefine el método para que muestre todas las propiedades.
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
