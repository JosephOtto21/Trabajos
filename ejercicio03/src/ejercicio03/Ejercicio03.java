package ejercicio03;
import javax.swing.JOptionPane;

/*@author theor*/

public class Ejercicio03 {
    
    public int num1;
    public int num2;
    public int suma;
    
    public void ingresarDatos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));        
    }
    
    public void suma(){
        suma = num1 + num2;
    }
    
    public void mostrar(){
        System.out.print(num1 +  " + " + num2 + " = " + suma + "\n");
    }
    
    public static void main(String[] args) {
        Ejercicio03 objEjercicio03 = new Ejercicio03();
        
        objEjercicio03.ingresarDatos();
        objEjercicio03.suma();
        objEjercicio03.mostrar();        
    }
}
