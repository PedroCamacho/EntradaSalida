import java.io.*;

public class Entrada2 {

	public static void main(String[] args) throws IOException {
		String nombre;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Escribe tu nombre: ");
		nombre = br.readLine();
		System.out.print("Hola " + nombre + ", escribe tu edad: ");
		String edadString = br.readLine();
		int edadEntero = Integer.parseInt(edadString);
		System.out.println("El pr�ximo a�o tendr�s: " + edadEntero+1);
	}
}
