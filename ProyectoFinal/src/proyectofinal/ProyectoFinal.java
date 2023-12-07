package proyectofinal;
import java.util.Scanner;

public class ProyectoFinal {

    public int opcion;
    public int opcion_carta;
    public int contador;
    public double precio_final;
    public double[] precios = {25.00, 18.00, 22.00, 30.00, 28.00, 26.00, 40.00, 35.00, 15.00, 12.00, 18.00, 10.00};    
    public double [] total = new double[12];
    public double[] final_price = new double[12];
    public String name;
    public String[] platos = {"Ceviche de pescado", "Causa limeña", "Anticuchos", "Lomo saltado", "Aji de gallina", "Rocoto relleno", "Cuy al horno", "Tacu tacu con lomo fino", "Tres leches", "Suspiro a la limeña", "Pisco Sour", "Chicha morada"};
    public double suma;
    public String txt = "TOTAL";

    public void Menu(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("""
            ###########################################
                        BIENVENIDO A JANDOS
            ###########################################""");
                
        OUTER:
        OUTER_1:
        
        while (true) {
            System.out.print("""
            [1]Atencion al cliente
            [2]Recibo
            [3]Salir """);
            System.out.print("\nIngrese su opcion: ");
            
            opcion = teclado.nextInt();
            
            System.out.println("\n");
            
            switch (opcion) {
                case 1 -> opcion1();
                case 2 -> boleta();
                case 3 -> {
                    break OUTER_1;
                }
                default -> System.out.println("Opcion no valida, intenta de nuevo");
            }
        }
        
    }   
    
    public void opcion1(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("""
            ############################################################
                               ATENCION AL CLIENTE
            ############################################################
                                     CARTA
            ############################################################
            #Entradas:

            [1]Ceviche de Pescado:                             S/.25.00
            Pescado fresco marinado en limón, 
            con cebolla roja, cilantro, ají y maíz cancha.

            [2]Causa Limeña:                                   S/.18.00
            Papa amarilla aplastada y sazonada, capas de pollo, 
            aguacate y huevo duro. Acompañada de salsa de ají 
            amarillo.
                         
            [3]Anticuchos:                                     S/.22.00
            Brochetas de corazón de res marinadas en ají panca, 
            acompañadas de papa y choclo.

            #Platos Principales:
                         
            [4]Lomo Saltado:                                   S/.30.00
            Trozos de carne de res salteados con cebolla, tomate, 
            ají amarillo y soja, servidos con papas fritas y arroz.

            [5]Aji de Gallina:                                 S/.28.00
            Tiras de pollo en una salsa cremosa de ají amarillo, 
            nueces y queso, acompañado de arroz.

            [6]Rocoto Relleno:                                 S/.26.00
            Rocoto relleno de picadillo de carne y queso, gratinado
            al horno. Acompañado de pastel de papa.

            #Platos Típicos:
                         
            [7]Cuy al Horno:                                   S/.40.00
            Cuy asado al horno con hierbas aromáticas, servido con
            papas y salsa de huacatay.

            [8]Tacu Tacu con Lomo Fino:                        S/.35.00
            Tacu tacu (mezcla de arroz y frijoles) acompañado de lomo
            fino a la parrilla, huevo frito y plátano.
                         
            #Postres:
                         
            [9]Tres Leches:                                    S/.15.00
            Pastel empapado en tres tipos de leche, decorado con merengue.

            [10]Suspiro a la Limeña:                           S/.12.00
            Dulce de leche con merengue italiano, espolvoreado con canela.
                         
            #Bebidas: 
            [11]Pisco Sour:                                    S/.18.00
            Cóctel peruano a base de pisco, jugo de limón, jarabe de goma,
            clara de huevo y amargo de angostura.

            [12]Chicha Morada:                                 S/.10.00
            Bebida morada hecha de maíz morado, piña, canela y clavo de olor.
                         
            [13]Salir             
            ############################################################
                                                  """);
        
        OUTER:
        OUTER_1:
        while (true) {
            System.out.print("Ingrese sus opciones: ");
            opcion_carta = teclado.nextInt();
       
            switch (opcion_carta) {
                case 1 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                    
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;
                }
                case 2 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;
                }
                case 3 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;
                }
                case 4 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 5 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 6 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 7 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 8 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 9 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 10 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 11 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 12 -> {
                    System.out.print("Ingrese cantidad: ");
                    contador = teclado.nextInt();                      
                    System.out.println("Registrado");
                    precio_final = contador * precios[opcion_carta - 1];
                    total[opcion_carta - 1] = precio_final;                    
                }
                case 13 -> {                    
                    break OUTER_1;
                }
                default -> System.out.println("Opcion no valida, intenta de nuevo");
            }
        }
        
    }  
    
    public void boleta(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        name = teclado.nextLine().toUpperCase();
        
        System.out.printf("""
            ###########################################
                              BOLETA                                      
            ###########################################
            NOMBRE DEL CLIENTE: %s""", name);
        
        System.out.println("\n");

        for (int i = 0; i < 12; i++){
            
            suma = suma + total[i];
            
            
            if(total[i] != 0){
                System.out.printf("%-30s    %f\n", platos[i], total[i]);
                System.out.println("");
            }
        }
        
        System.out.printf("%-30s   %f\n", txt,suma);
        System.out.println("");
        
        suma = 0;
        
        for (int j = 0; j < 12; j++){
            total[j] = 0;
        }
    }
    
    public static void main(String[] args) {
        ProyectoFinal objetos = new ProyectoFinal();
        objetos.Menu();
    }
}