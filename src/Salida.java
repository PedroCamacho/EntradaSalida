
public class Salida {

	public static void main(String[] args) {
		// Imprime y el cursor se queda tras el �ltimo car�cter
		System.out.print("Se imprime este mensaje SIN el retorno de carro");
		System.out.println("");
		
		//Imprime y pasa a la siguiente l�nea
		System.out.println("Se imprime este mensaje CON un retorno de carro");
		
		/* Impresi�n con formato
		 * %s Cadenas de caracter o String
		 * %d N�meros enteros
		 * %f N�meros decimales
		 */
		String nombre = "Jes�s";
		int edad = 25;
		double peso = 67.9;
		System.out.printf("Hola %s, tienes %d a�os y pesas %2.2f kilogr�mos", nombre, edad, peso);
	}

}
