
public class Salida {

	public static void main(String[] args) {
		// Imprime y el cursor se queda tras el último carácter
		System.out.print("Se imprime este mensaje SIN el retorno de carro");
		System.out.println("");
		
		//Imprime y pasa a la siguiente línea
		System.out.println("Se imprime este mensaje CON un retorno de carro");
		
		/* Impresión con formato
		 * %s Cadenas de caracter o String
		 * %d Números enteros
		 * %f Números decimales
		 */
		String nombre = "Jesús";
		int edad = 25;
		double peso = 67.9;
		System.out.printf("Hola %s, tienes %d años y pesas %2.2f kilográmos", nombre, edad, peso);
	}

}
