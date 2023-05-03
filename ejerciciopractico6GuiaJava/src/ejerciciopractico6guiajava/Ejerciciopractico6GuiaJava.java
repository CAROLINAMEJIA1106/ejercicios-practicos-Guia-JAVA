/*
CONDICIONALES
Crear un programa que dado un numero determine si es par o impar.
 */
package ejerciciopractico6guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico6GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese un número entero: ");
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            
            System.out.println("El número ingresado es PAR");
        
    } else{
            System.out.println("El número ingresado es IMPAR");
        }
    }
}
