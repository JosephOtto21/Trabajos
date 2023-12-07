package ejercicio01;
import java.util.Scanner;

/*@author theor*/

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese grados centrigrados: ");
        
        double centi = teclado.nextDouble();
        
        double faren = (centi * 9/5) + 32;
        
        System.out.printf("Grados centigrados: %fC°\n", centi);
        System.out.printf("Grados farenheit: %fF°\n", faren);
    }
}
