/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico13guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class ejerciciopractico13GuiaJavaOtraforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese el número de elementos por lado, que desea para el cuadrado: ");
        int numero = leer.nextInt();
        
        for (int i = 0; i < numero; i++) {
            
                for (int j = 0; j < numero; j++) {
                    if(i == 0){
                        System.out.print("*");
                    }
                    if(i == numero-1){
                        System.out.print("*");
                    }else{
                        if(j == 0 || j == numero-1){
                            System.out.print("*");
                        }else{
                           System.out.print("");
                           
                        }
                        
                    }
                    
                    
                    
                }
                System.out.println("");
            
                    
                
        }
            
            
    }
}
    

