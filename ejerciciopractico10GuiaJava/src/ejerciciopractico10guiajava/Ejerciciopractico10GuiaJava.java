/*
BUCLES Y SENTENCIAS DE SALTO BREAK Y CONTINUE
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package ejerciciopractico10guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico10GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese un valor límite entero positivo: ");
        int numeroLimite = leer.nextInt();
        
        System.out.println("A continuación vaya ingresando números enteros: ");
        
        int suma = 0;
        while (suma < (numeroLimite + 1)){
            int num = leer.nextInt();
            
            suma += num;
            
               
            
        }
        
        System.out.println("Llegó al valor limite. No se permite ingresar más números");
        
    }
    
}
