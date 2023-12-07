package ejercicio05;
import javax.swing.JOptionPane;

/*@author theor*/

public class Ejercicio05 {
    
    public int base;
    public int altura;
    public double area;
    
    public void ingresarDatos(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese base:"));        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura:"));                
    }
    
    public void area(){
        area = (base * altura) / 2;
    }

    public void mostrar(){
        System.out.printf("Area: %f\n", area);       
    }
    
    public static void main(String[] args) {
        Ejercicio05 objEjercicio05 = new Ejercicio05();
        
        objEjercicio05.ingresarDatos();
        objEjercicio05.area();
        objEjercicio05.mostrar();
    }
}

