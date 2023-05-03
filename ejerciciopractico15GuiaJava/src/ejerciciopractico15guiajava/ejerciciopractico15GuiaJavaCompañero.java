/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico15guiajava;

/**
 *
 * @author Carolina
 */
public class ejerciciopractico15GuiaJavaCompañero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=0,k=0,ran=100;
        int[] v = new int [ran];
        v[k]  = (int) (Math. random()*ran) ;
        for(k=1;k<100;k++){
            v[k]  = (int) (Math. random()*ran) ;
            for(int h=0;h<k;h++){
                if (v[k]==v[h]){
                    k--;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (j = i+1; j < 100; j++) {
             if (v[j]<v[i]){
                 int anterio = v[i];
                 int nueMen = v[j];
                v[i] = nueMen;
                v[j] = anterio;
                }
            }
        }
        for (int h=99;h>0;h--){
            System.out.println(""+v[h]);
        }
    }
    
}
