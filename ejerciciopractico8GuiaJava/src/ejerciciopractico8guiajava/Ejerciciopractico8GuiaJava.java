/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejerciciopractico8guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico8GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        
        int longitud = frase.length();
        
        if (longitud == 8){
            
            System.out.println("CORRECTO");
            
        } else{
            System.out.println("INCORRECTO");
            
        }
        
    }
    
}
