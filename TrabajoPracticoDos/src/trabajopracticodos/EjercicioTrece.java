/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioTrece {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la primer cadena (frase)");
        String cadena1 = sc.nextLine();
    System.out.println("Ingrese la segunda cadena (frase)");
    String cadena2 = sc.nextLine();
    
    boolean encontro =cadena1.contains(cadena2);
    
    if (encontro){
        System.out.println("La segunda cadena ingresada se encuentra dentro de la primer cadena");
        }
    else{
    System.out.println("La segunda cadena no se encuentra dentro de la primer cadena");
    }   
}
}   
