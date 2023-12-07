package ejercicio09;
import java.util.Scanner;

public class Ejercicio09 {

    public int n1;
    public int n2;
    public int n3;
    
    public int res1;
    public int res2;
    
    public void IngresarDatos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        n1 = teclado.nextInt();
        System.out.print("Ingrese segundo numero: ");        
        n2 = teclado.nextInt();
        System.out.print("Ingrese tercer numero: ");        
        n3 = teclado.nextInt();
    }
    
    public void comparar(){
        res1 = n3 - n2;
        res2 = n2 - n1;
        
        if (res2 == res1){
            System.out.println("Es una progresion aritmetica");
        }else{
            System.out.println("No es una progresion aritmetica");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio09 objetos = new Ejercicio09();
        
        objetos.IngresarDatos();
        objetos.comparar();
    }
}
