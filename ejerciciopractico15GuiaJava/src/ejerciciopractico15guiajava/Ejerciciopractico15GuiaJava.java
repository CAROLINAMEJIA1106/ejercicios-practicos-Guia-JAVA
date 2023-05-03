/*
Realizar un algoritmo que rellene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.
 */
package ejerciciopractico15guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico15GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[] vector = new int[100];
        vector[0] = (int)(Math.random()* 100);
        
        for (int i = 1; i < 100; i++) {
            vector[i] = (int)(Math.random()* 100);
            for (int j = 0; j < i; j++) {
                if(vector[i] == vector[j]){
                    i--;
                
                }
            }
              
        }
        
        
        organizar(vector);
    }
    public static void organizar(int[] vector){
        
        for (int j = 0; j < 100; j++) {
            for (int i = j+1; i < 100; i++) {
                if(vector[i] > vector[j]){
                    int nmayor = vector[i];
                    int sig = vector[j];
                    vector[i] = sig;
                    vector[j] = nmayor;
                    
                
                }
                
            }
            
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("" + vector[i]);
        }
    }
            
}        
            
            
           
        
        
        
        
        


