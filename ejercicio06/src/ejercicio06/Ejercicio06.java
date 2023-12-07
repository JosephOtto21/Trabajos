package ejercicio06;
import java.util.Scanner;


/*@author theor*/


public class Ejercicio06 {
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese su edad: ");
    
        Scanner teclado = new Scanner(System.in);
    
        int edad = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Usted tiene: " + edad + " años");
    }
}