package claseEntrada;

/**
 * main() //prueba a crear 3 entradas y muestralas por pantalla
 * 
 * @author Juan Carlos
 *
 */

public class TestEntrada {

	public static void main(String[] args) {
		
		Entrada grada = new Entrada(20.0);
		
		Entrada butaca = new Entrada(30.0);
		
		Entrada palco = new Entrada (50.0);
		
		System.out.println();
		System.out.println("Las entradas de grada tiene " + grada);
		System.out.println("Las entradas de butaca tiene " + butaca);
		System.out.println("Las entradas de palco tiene " + palco);
		
		
		
		
		

	}

}
