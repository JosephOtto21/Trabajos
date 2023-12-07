package ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

    public int numeroDia;
    public int precioProducto;
    
    public void IngresarDatos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("""
            [1] Lunes
            [2] Martes
            [3] Miercoles
            [4] Jueves
            [5] Viernes
            [6] Sabado
            [7] Domingo
            Ingrese numero de dia de compra: """);
        numeroDia = teclado.nextInt();
         
        System.out.print("Ingrese precio del producto: ");
        precioProducto = teclado.nextInt();
    }
    
    public void Comparar(){
        if (numeroDia == 1 && precioProducto >= 50 && precioProducto <= 80){
            System.out.println("Puede recibir reembolso");
        }else if(numeroDia != 3 && numeroDia != 4 && precioProducto >= 120){
            System.out.println("Puede recibir reembolso");                
        }else{
            System.out.println("No Puede recibir reembolso");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio11 objetos = new Ejercicio11();
        objetos.IngresarDatos();
        objetos.Comparar();
    }
}
