/*
Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a 
mostrar el menú.


 */
package ejerciciopractico11guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico11GuiaJava {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String salir = "";
        System.out.println("Por favor ingrese dos numeros enteros positivos: ");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        
        do{
        
            System.out.println("MENU:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Elige una opción: ");
            int opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    double suma = num1 + num2;
                    System.out.println("Suma: " + num1 + "+" + num2 + " = " + suma);
                    salir = "N";
                    break;
                case 2:
                    double resta = num1 - num2;
                    System.out.println("Resta: " + num1 + "-" + num2 + " = " + resta);
                    salir = "N";
                    break;
                case 3:
                    double multi = num1 * num2;
                    System.out.println("Multiplicación: " + num1 + "*" + num2 + " = " + multi);
                    salir = "N";
                    break;
                case 4:
                    double div = num1/num2;
                    System.out.println("División: " + num1 + "/" + num2 + " = " + div);
                    salir = "N";
                    break;
                case 5:
                    leer.nextLine();
                    do{
                    
                
                    System.out.println("Está seguro que desea salir del programa? (S/N): ");
                    salir = leer.nextLine();
                    if(salir.equals("S")){
                        System.out.println("Hasta la próxima");
                        break;
                    }
                }while (!salir.equals("N"));




            }
        
        }while (salir.equals("N"));
        
    }   
}
