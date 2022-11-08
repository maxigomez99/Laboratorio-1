/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
    
    System.out.println("Ingrese el numero de DNI: ");
        int numeroDNI = sc.nextInt();
         String letra = obtenerLetra(numeroDNI%23);
        System.out.println(numeroDNI+letra);
        
    }
        
      public static String obtenerLetra(int numeroDNI){
        
            
    String cadena = ("T;R;W;;A;G;M;Y;F;P;D;X;B;N;J;Z;S;Q;V;H;L;C;K;E");
    
    String [] letras = cadena.split(";");
            
       String letra = letras [numeroDNI];
        
        return letra;
    }
    
}
