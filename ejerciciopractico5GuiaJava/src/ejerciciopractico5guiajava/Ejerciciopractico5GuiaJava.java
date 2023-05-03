/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejerciciopractico5guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico5GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese un número entero: ");
        int num = leer.nextInt();
        
        
        double doble = Math.pow(num, 2);
        
        double triple = Math.pow(num, 3);
        
        double resultado = Math.sqrt(num);
        
        System.out.println("El DOBLE del número " + num + " es: " + doble);
        System.out.println("El TRIPLE del número " + num + " es: " + triple);
        System.out.println("La raiz cuadrada del número " + num + " es: " + resultado);
        
        
    }
    
}
