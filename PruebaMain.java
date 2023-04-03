
// Importacion de Scanner
import java.util.Scanner;

public class PruebaMain {
	public static void main(String[] args) {

		/**
		 * Instanciacion de objetos
		 */
		Scanner leer = new Scanner(System.in);
		int cant;
		DerivacionIV d;

		/**
		 * Ejecucion del programa
		 */
		System.out.print("Ingrese la cantidad de datos de la tabla: ");
		cant = leer.nextInt();
		do {
			if (cant >= 3) {
				d = new DerivacionIV(cant);
				d.llenadoX();
				d.llenadoY();
				d.tablaRegistrada();
				break;
			} else {
				System.out.print("Se necesitan 4 o mas datos en la tabla: ");
				cant = leer.nextInt();
			}
		} while (true);
	}
}
