/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciopractico18guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico18GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()* 50+1);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        traspuesta(matriz);
        
    }
    public static void traspuesta(int[][]matriz){
        int[][] matriztras = new int [4][4];
        System.out.println("MATRIZ TRASPUESTA");
        //GENERAMOS TRASPUESTA
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriztras[j][i] = matriz[i][j];
            }
        }
        
        
        //mostramos traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriztras[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
    
}
