/*
Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */
package ejerciciopractico19guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico19GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tamaño de la matriz: ");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int[][] matriz = new int[n][m];
        int[][] matriztras = new int[n][m];
        if(n != m){
            System.out.println("La matriz no es cuadrada y no tiene antisimétrica");
        }else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matriz[i][j] = leer.nextInt();
                    //(int)(Math.random()* 50+1);
                    //System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
        
            //Genero TRASPUESTA
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matriztras[j][i] = matriz[i][j];
                }
            }
            antisimetrica(n, m, matriz, matriztras);
            
            
        }
        
        
    }
    
    public static void antisimetrica(int n, int m, int[][] matriz, int[][] matriztras){
        int cont = 0;
        int conta = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matriz[i][j] == -1*matriztras[i][j]){
                    cont += 1;
                    continue;
                }else{
                    
                    break;
                }
                
                
            }
        }
        if(cont == (n*m)){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(Math.negateExact(matriz[i][j]) == matriztras[i][j]){
                        conta += 1;
                        continue;
                    }else{
                        break;
                    }
                    
                }
                   
            }
            if(conta == n*m){
                System.out.println("La matriz ingresada es antisimétrica");
                System.out.println("Matriz origial: ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("[" + matriz[i][j] + "]");
                    }
                    System.out.println("");
                }
                System.out.println("Matriz antisimétrica: ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("[" + matriztras[i][j] + "]");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Esta matriz no es antisimétrica");
        }
        
        
    }
    
}
