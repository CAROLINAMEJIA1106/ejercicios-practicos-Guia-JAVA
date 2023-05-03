/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciopractico4guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico4GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese la temperatura en °C: ");
        double temp = leer.nextDouble();
        
        double tempfar = 32 + (9 * temp / 5);
        
        System.out.println("La temperatura en °F es: " + tempfar);
        
        
    }
    
}
