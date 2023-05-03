/*
VECTORES Y MATRICES EN JAVA
Crea una aplicación que a través de una función nos convierta una 
cantidad de euros introducida por teclado a otra moneda, estas pueden ser a 
dólares, yenes o libras. La función tendrá como parámetros, la cantidad de 
euros y la moneda a converir que será una cadena, este no devolverá ningún 
valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerciciopractico14guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico14GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el valor de Euros(€) a convertir: ");
        double valor = leer.nextDouble();
        
        
        convertir(valor);
        
        
    }
    
    public static void convertir(double valor){
        Scanner leer = new Scanner (System.in);
        double resultado;
        
        
        System.out.print("Escriba la moneda a convertir (dolares, yenes o libras): ");
        String moneda = leer.nextLine();
        
        switch(moneda){
            case "dolares":
                resultado = 1.28611 * valor;
                System.out.println("Los " + valor + " euros equivalen a: " + resultado + " dólares");
                break;
            case "yenes":
                resultado = 129.852 * valor;
                System.out.println("Los " + valor + " euros equivalen a: " + resultado + " yenes");
                break;
            case "libras":
                resultado = 0.86 * valor;
                System.out.println("Los " + valor + " euros equivalen a: " + resultado + " libras");
                break;
        }
        
    }
    
}
