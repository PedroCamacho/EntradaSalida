import java.io.IOException;

public class Entrada1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Elige una opci�n: [a - b - c - d]");
		char opcion = (char) System.in.read();
		System.out.println("Has seleccionado la opci�n " + opcion);
	}
}
