/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
lo siguiente:
* * * *
*     *
*     *
* * * *



 */
package ejerciciopractico13guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico13GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese el número de elementos por lado, que desea para el cuadrado: ");
        int numero = leer.nextInt();
        
        for (int i = 0; i < numero; i++) {
            if(i == 0){
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                    
                    
                }
                
            }else{
                if(i == numero-1){
                    for (int j = 0; j < numero; j++) {
                        System.out.print("*");
                    }
                    
                }else{
                    for (int k = 0; k < numero; k++) {
                        if(k == 0){
                            System.out.print("*");
                        }else{
                            if(k == numero-1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
            
            System.out.println("");
        }
        
        
    }
    
}
