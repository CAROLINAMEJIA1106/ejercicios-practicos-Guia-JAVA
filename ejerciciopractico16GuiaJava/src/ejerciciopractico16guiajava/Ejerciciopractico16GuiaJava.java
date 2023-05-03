/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
y le pida al usuario un numero a buscar en el vector. El programa mostrará 
donde se encuentra el numero y si se encuentra repetido
 */
package ejerciciopractico16guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico16GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        int n = (int) (Math.random()* 50);
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 100);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Por favor ingrese un número a buscar en el vector: ");
        int numero = leer.nextInt();
        
        buscar (n, numero, vector);
        
    }
    public static void buscar (int n, int numero, int[] vector){
        
        int cont = 0;
                     
        //buscamos número
        for (int i = 0; i < n; i++) {
            if(vector[i] == numero){
                cont += 1;
            }
        }
        
        if(cont == 0){
            
            System.out.println("El número a buscar no se encuentra en el arreglo");
            
        }else{
            if (cont >1){
                
                System.out.println("Las posiciónes donde se encuentra el número son: ");
                for (int i = 0; i < n; i++) {
                    if(vector[i] == numero){
                        System.out.println(" " + i);
                
                    }
                }
            }else{
                System.out.println("La posición donde se encuentra el número es: ");
                for (int i = 0; i < n; i++) {
                    if(vector[i] == numero){
                        System.out.println(" " + i);
                    }
                }                
            }
            
        }
        

        
    }
    
}
