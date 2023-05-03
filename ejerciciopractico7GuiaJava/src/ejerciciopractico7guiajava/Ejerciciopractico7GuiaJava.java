/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejerciciopractico7guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico7GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese una frase: ");
        String frase = leer.nextLine();
        
        String frasefija = "eureka";
        
        boolean comp = frase.equals(frasefija);
               
        if(comp == true){
            System.out.println("" + frase + " es igual a: " + frasefija);
        }else {
            System.out.println("" + frase + " no es igual a: " + frasefija);
        }
            
    }
    
}
