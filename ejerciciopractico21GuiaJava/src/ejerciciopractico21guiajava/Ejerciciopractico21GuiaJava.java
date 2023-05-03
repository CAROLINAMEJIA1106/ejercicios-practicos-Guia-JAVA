/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la 
matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si la 
matriz P está contenida dentro de la matriz M. Para ello se debe verificar 
si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, 
desplazándose por filas o columnas, existe al menos una que coincida con la 
matriz P. En ese caso, el programa debe indicar la fila y la columna de la 
matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejerciciopractico21guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico21GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[][] m = new int [10][10];
        int[][] p = new int [3][3];
        
                
        System.out.println("Ingrese los datos de la matriz M: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    m[i][j] = leer.nextInt();
                    
            }
                System.out.println("");
        }
        
        System.out.println("Ingrese los datos de la matriz P: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    p[i][j] = leer.nextInt();
                    
            }
                System.out.println("");
        }
        
        //comparar si está contenida
        compararmatriz(m,p);
    }
    public static void compararmatriz(int[][] m, int[][] p){
        int cont =0;
        int banderafila = 0;
        int banderacolumna = 0;
        int a, b;
        
        for (int i = 0; i < 10; i++) {
            a = i;
            for (int j = 0; j < 10; j++) {
                b = j;
                if(m[i][j] == p[0][0]){
                    for (int k = 0; k < 3; k++) {
                        if(i >= 0 && i<=9 ){
                            for (int t = 0; t < 3; t++) {
                                if(m[i][j] == p[k][t]){
                                    
                                    cont += 1;
                                    banderafila = i;
                                    banderacolumna = j;
                                    j += 1;

                                }else{
                                    break;
                                }
                            }
                            
                            if(cont != 0){
                                i += 1;
                                j = j-3;
                            }else{
                                break;

                            }
                            
                        }else{
                            break;
                        }
                        
                    
                    }
                    
                    
                }
                if(cont == 9){
                    break;
                }else{
                   i = a;
                   j = b;
                } 
            }
            if(cont == 9){
                break;
            }else{
                i = a;
                
            } 
        }
        
        if(cont == 9){
            banderafila -= 2;
            banderacolumna -= 2;
            System.out.println("La matriz P está dentro de la matriz M");
            System.out.println("La posición inicial donde está es:");
            System.out.println("fila: " + banderafila);
            System.out.println("columna: " + banderacolumna);
        }else{
            System.out.println("La matriz P no está dentro de la matriz M");
        }
        
    }
}
