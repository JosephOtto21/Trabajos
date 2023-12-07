package ejercicio10;
import java.util.Scanner;

//@author Theor

public class Ejercicio10 {

    public String sexo;
    public int edad;
    
    public void IngresarDatos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("""
            Ingrese sexo:
            [H]Hombre
            [M]Mujer
            Ingrese opcion: """);
        sexo = teclado.nextLine();
        
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
    }
    
    public void Comparar(){
        if (sexo == "H" && edad >= 65){
            System.out.print("Se puede jubilar");
        }else if(sexo == "M" && edad >= 60){
            System.out.println("Se puede jubilar");
        }else{
            System.out.println("No se puede jubilar");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio10 objetos = new Ejercicio10();
        
        objetos.IngresarDatos();
        objetos.Comparar();
    }
    
}