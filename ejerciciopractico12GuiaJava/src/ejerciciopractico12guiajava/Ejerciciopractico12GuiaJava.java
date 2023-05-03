/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
investigar cómo se utilizan las siguientes funciones de Java Substring(), 
Length(), equals().
 */
package ejerciciopractico12guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico12GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String salir;
        String letrainicial = "";
        String letrafinal = "";
        int incorrectas = 0;
        int correctas = 0;
        
        System.out.println("Por favor ingrese la cadena del dispositivo RS232: ");
        do{
            String cadena = leer.nextLine();
            
            int longitud = cadena.length();
            
            //verifica longitud 
            if(longitud == 5){
                //verifica si el formato es válido
                letrainicial = cadena.substring(0, 1);
                letrafinal = cadena.substring(4);
                
                //verifica si es el final de los envíos
                
                if (letrainicial.equals("&") && letrafinal.equals("&")){
                    System.out.println("Final de envíos");
                    break;
                    
                }else{
                    if(letrainicial.equals("X")){
                    
                        if(letrafinal.equals("O")){
                        
                            correctas += 1;
                        }else{
                            incorrectas += 1;
                            
                        }
                        
                    
                    }else{
                        incorrectas += 1;
                    
                    }
                }
                
                
                
                
            }else{
                incorrectas += 1;
            }
        
        
        
        
        
            
        }while(!letrainicial.equals("&") && !letrafinal.equals("&"));
    
        System.out.println("El número de cadenas correctas fueron: " + correctas);
        System.out.println("El número de cadenas incorrectas fueron: " + incorrectas);
    
    }
    
   
    
}
    
