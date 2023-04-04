
// Importacion de Scanner
import java.util.Scanner;

import javax.swing.JTable.PrintMode;

public class DerivacionIV {
    Scanner leer = new Scanner(System.in);
    private double[] filaX;
    private double[] filaY;

    /*
     * Constructor
     */
    public DerivacionIV(int cant) {
        filaX = new double[cant];
        filaY = new double[cant];
    }

    // Funcion
    public double f(double x, double xa, double xb, double xc, double ya, double yb, double yc) {
        double part1 = (2 * x - xb - xc) / ((xa - xb) * (xa - xc)) * ya;
        double part2 = (2 * x - xa - xc) / ((xb - xa) * (xb - xc)) * yb;
        double part3 = (2 * x - xb - xa) / ((xc - xb) * (xc - xa)) * yc;
        return part1 + part2 + part3;
    }

    public int buscarIndice(double x){
        int index = -1;
        for (int i = 0; i < filaX.length - 1; i++) {
            if(filaX[i] <= x && filaX[i+1] >= x){
                index = i;
                break;
            }
        }
        if(index != -1){
            if((index + 1) == filaX.length -1){
                index--;
            }
        }
        return index;
    }
    public double derivar(Double x){
        int index = buscarIndice(x);
        if(index == -1){
            System.out.println("Error, No se encontraron valores indicados para la derivada de " + x);
            return index;
        }
        System.out.println(index);
        return f(x,filaX[index],filaX[index + 1],filaX[index + 2],filaY[index],filaY[index + 1],filaY[index + 2]);
    }
    /*
     * Metodo llenado FilaX
     */
    public void llenadoX() {
        for (int i = 0; i < filaX.length; i++) {
            filaX[i] = 0;
        }
        System.out.print("A continuacion llene los espacios... [X]");
        for (int i = 0; i < filaX.length; i++) {
            if (i > 0) {
                formatLlenadoX();
            }
            System.out.printf("%nX[%s]: ", i + 1);
            filaX[i] = leer.nextDouble();
            if (i == filaX.length - 1) {
                formatLlenadoX();
            }
        }
    }

    /*
     * Metodo llenado FilaY
     */
    public void llenadoY() {
        for (int i = 0; i < filaY.length; i++) {
            filaY[i] = 0;
        }
        System.out.print("\n\n\nA continuacion llene los espacios... [F(x)]");
        for (int i = 0; i < filaY.length; i++) {
            if (i > 0) {
                formatLlenadoY();
            }
            System.out.printf("%nF(x)[%s]: ", i + 1);
            filaY[i] = leer.nextDouble();
            if (i == filaY.length - 1) {
                formatLlenadoY();
            }
        }
    }

    /*
     * Metodo para dar formato a la entrada de datos de X
     */
    public void formatLlenadoX() {
        for (int i = 2; i < filaX.length * 10.25; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-2s | ", " X ");
        for (int i = 0; i < filaX.length; i++) {
            System.out.printf("%-8s ", filaX[i]);
        }

        System.out.println();
        for (int i = 2; i < filaX.length * 10.25; i++) {
            System.out.print("-");
        }
    }

    /*
     * Metodo para dar formato a la entrada de datos de Y
     */
    public void formatLlenadoY() {
        for (int i = 1; i < filaY.length * 10.25; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-2s | ", "F(X)");
        for (int i = 0; i < filaY.length; i++) {
            System.out.printf("%-8s ", filaY[i]);
        }

        System.out.println();
        for (int i = 1; i < filaY.length * 10.25; i++) {
            System.out.print("-");
        }
    }

    /**
     * Metodo de impresion de la tabla resultante
     */

    public void tablaRegistrada() {
        System.out.print("\n\n|");
        for (int i = 0; i < filaY.length * 12; i++) {
            System.out.print("-");
        }
        System.out.print("|");
        System.out.print("\n|");
        for (int i = 0; i < filaY.length * 12; i++) {
            System.out.print(" ");
            if (i == ((filaY.length * 12 / 2) - 16)) {
                System.out.print("TABLA REGISTRADA");
                i += 16;
            }
        }
        System.out.print("|");
        System.out.print("\n|");
        for (int i = 0; i < filaY.length * 12; i++) {
            System.out.print("-");
        }
        System.out.print("|");
        System.out.printf("%n| %-2s | ", "X");
        for (int x = 0; x < filaX.length; x++) {
            if (x == filaX.length - 1 && filaX.length > 2) {
                System.out.printf("%-8.8s", filaX[filaX.length - 1]);
                for (int i = 0; i < x - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.printf("%-8.8s | ", filaX[x]);
            }
        }

        System.out.printf("%n| %-2s | ", "Y");
        for (int x = 0; x < filaX.length; x++) {
            if (x == filaY.length - 1 && filaY.length > 2) {
                System.out.printf("%-8.8s", filaY[filaY.length - 1]);
                for (int i = 0; i < x - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.printf("%-8.8s | ", filaY[x]);
            }
        }
        System.out.println();
        for (int i = 0; i < filaY.length * 12; i++) {
            System.out.print("-");
        }
    }
}
