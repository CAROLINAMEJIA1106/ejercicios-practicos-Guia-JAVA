/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciopractico17guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico17GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int n = (int)(Math.random()*20+3);
        
        llenadovector(n);
        
        
        
    }
    public static void llenadovector(int n){
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()* 1000);
            System.out.print("[" + vector[i] + "]");
        }
        
        digitos(n, vector);
    }
    
    public static void digitos (int n, int[] vector){
        int contundigito = 0;
        int cont = 0;
        int contdosdigitos = 0;
        int conttresdigitos = 0;
        int contcuatrodigitos = 0;
        int contcincodigitos = 0;
        
        
        for (int i = 0; i < n; i++) {
            
            int nuevo = (int)(Math.floorDiv(vector[i], 10)); 
            if(nuevo == 0){
                contundigito += 1;
            }else{
                cont += 1;
                do{
                    nuevo = (int)(Math.floorDiv(nuevo, 10));
                    cont += 1;
                }while (nuevo > 0);
                
                switch (cont){
                    case 2:
                        contdosdigitos += 1;
                        break;
                    case 3:
                        conttresdigitos += 1;
                        break;
                    case 4:
                        contcuatrodigitos += 1;
                        break;
                    case 5:
                        contcincodigitos += 1;
                        break;
                   
                }
                    
                
            }
            
            cont = 0;
                
            
        }
        System.out.println("");
        System.out.println("Los números que son de un dígito son: " + contundigito);
        System.out.println("Los números que son de dos dígitos son: " + contdosdigitos);
        System.out.println("Los números que son de tres dígitos son: " + conttresdigitos);
        System.out.println("Los números que son de cuatro dígitos son: " + contcuatrodigitos);
        System.out.println("Los números que son de cinco dígitos son: " + contcincodigitos);
        
    }
    
}
