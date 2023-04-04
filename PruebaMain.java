
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
		System.out.println("INGRESAR DATOS ORDENADAMENTE, LA CALCULADORA NO LOS ORDENA AUTOMATICAMENTE.");
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
				break;
			} else {
				System.out.print("Se necesitan 3 o mas datos en la tabla: ");
				cant = leer.nextInt();
			}
		} while (true);
		
		do {
			d.tablaRegistrada();
			System.out.print("\nIngrese el valor de x para encontrar la derivada: ");
			System.out.printf("El resultado es: %f",d.derivar(leer.nextDouble()));
			System.out.print("\nDesea encontrar otra derivada? [1]Si [Cualquier otro numero]No: ");
			cant = leer.nextInt();
		} while (cant == 1);
	}
}
