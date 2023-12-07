package ejercicio04;
import javax.swing.JOptionPane;

/*@author theor*/

public class Ejercicio04 {
    
    public double dolares;
    public double soles;
    
    public void ingresarDolares(){
        dolares = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto en dolares"));        
    }
    
    public void convertir(){
        soles = dolares * 3.73;
    }

    public void mostrar(){
        System.out.printf("Dolares: %f\n", dolares);
        System.out.printf("Soles: %f\n", soles);        
    }
    
    public static void main(String[] args) {
        Ejercicio04 objEjercicio04 = new Ejercicio04();
        
        objEjercicio04.ingresarDolares();
        objEjercicio04.convertir();
        objEjercicio04.mostrar();
    }
}
