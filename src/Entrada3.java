import java.io.IOException;
import java.util.Scanner;

public class Entrada3 {

	public static void main(String[] args) throws IOException {
		String nombre;
		Scanner in = new Scanner (System.in);

		System.out.print("Escribe tu nombre: ");
		nombre = in.nextLine();
		System.out.print("Hola " + nombre + " " + ", escribe tu edad: ");
		int edadEntero = in.nextInt();
		System.out.println("El próximo año tendrás: " + (edadEntero+1));
	}
}
