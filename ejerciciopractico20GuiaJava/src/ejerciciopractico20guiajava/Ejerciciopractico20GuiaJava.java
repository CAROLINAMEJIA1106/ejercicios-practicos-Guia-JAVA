/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejerciciopractico20guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico20GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[][] matriz;
        int n;
        int m;
        int cont = 0;
        int validar = 0;
        
        do{
            System.out.println("Por favor ingrese el tamaño de la matriz: ");
            n = leer.nextInt();
            m = leer.nextInt();
        
        matriz = new int[n][m];
        
        if(n != m){
            
            System.out.println("La matriz debe ser cuadrada");
        }
            
        }while(n!=m);
        
        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    matriz[i][j] = leer.nextInt();
                    
            }
                System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j] > 0 && matriz[i][j] < 10){
                    cont += 1;
                    
                }else{
                    validar = 0;
                    
                }
            }
        }
        if(cont == n*n){
            validar =  1;
            
        }
        
        if(validar == 1){
            matrizmagica(matriz,n);
        }else{
            System.out.println("Números de la matriz INCORRECTOS, deben estar entre 1 y 9");
        }
        
        
    }
    public static void matrizmagica(int[][] matriz, int n){
        int sumafila,sumacolumna;
        int sumadiagonaliz, sumadiagonalder, cont;
        int[] vectorfila = new int[n];
        int[] vectorcolumna = new int[n];
        int[] vectordiagonal = new int [2];
        
        
        sumafila = 0; sumacolumna = 0;
        sumadiagonaliz = 0; sumadiagonalder = 0; cont = 0;
        
        //Suma de filas y generación de vector fila
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumafila += matriz[i][j];
            }
            vectorfila[i] = sumafila;
            sumafila = 0;
        }
        
        //suma de columnas y generacion de vector columnas
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sumacolumna += matriz[j][i];
                
            }
            vectorcolumna[j] = sumacolumna;
            sumacolumna = 0;
        }
        
        //Suma de diagonales y generación de vector
        //diagonal izquierda
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    sumadiagonaliz += matriz[i][j];
                }
            }
        }
        vectordiagonal[0] = sumadiagonaliz;
        //diagonal derecha
        int j = n-1;
        for (int i = 0; i < n; i++) {
            sumadiagonalder += matriz[i][j];
            j -= 1;
                
            
        }
        
        vectordiagonal[1] = sumadiagonalder;
        
        //verifico matriz mágica
        
        for (int i = 0; i < n; i++) {
            if(vectorfila[i] == vectorcolumna[i]){
                cont += 1;
            }
        }
        if(cont == n && vectordiagonal[0] == vectorfila[0] && vectordiagonal[1] == vectorfila[0]){
            System.out.println("La matriz es MÁGICA y la suma de sus filas, columnas y diagonales es: " +vectordiagonal[0]);
        }else{
            System.out.println("UPPSS!!! La matriz NO ES MÁGICA");
        }
    }
    
}
