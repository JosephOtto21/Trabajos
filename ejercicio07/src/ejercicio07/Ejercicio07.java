package ejercicio07;
import java.util.Scanner;

//@author Theor

public class Ejercicio07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        long velo = 299792458;
        
        System.out.print("Ingrese numero de dias: ");
        int n = teclado.nextInt();
        
        long distan = velo * n * 60 * 60 * 24;
        
        System.out.printf("En %1d dias la luz recorre: %2d ", n, distan);
    }
}