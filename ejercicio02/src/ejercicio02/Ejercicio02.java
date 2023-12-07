package ejercicio02;
import java.util.Scanner;

/*@author theor*/

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese dinero en dólares: ");
        
        double dolares = teclado.nextDouble();
        
        double soles = dolares * 3.73;
        
        System.out.printf("Dolares: %f\n",dolares);
        System.out.printf("Soles: %f\n", soles);
    }
}
