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
public class OperacionesFraccionVeinte {
  
    public static void main(String[] args) {
       
      
       
       Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese la primer fraccion");
       Fraccion f1 = new Fraccion(LeerTeclado.nextInt(), LeerTeclado.nextInt()); 
    
        System.out.println("Ingrese la segunda Fraccion");
        Fraccion f2 = new Fraccion(LeerTeclado.nextInt(), LeerTeclado.nextInt());
    
        Fraccion suma = f1.sumarFracciones(f1, f2);
        Fraccion resta = f1.restarFracciones(f1, f2);
        Fraccion multiplicacion = f1.multiplicarFracciones(f1, f2);
        Fraccion division = f1.dividirFracciones(f1, f2);
        
        System.out.println("El resultado de la suma: "+ suma.getNumerador()+"/"+suma.getDenominador());
        System.out.println("El resultado de la resta: "+ resta.getNumerador()+"/"+resta.getDenominador());
        System.out.println("El resultado de la multiplicacion: "+ multiplicacion.getNumerador()+"/"+multiplicacion.getDenominador());
        System.out.println("El resultado de la division: "+ division.getNumerador()+"/"+division.getDenominador());
    }
    
}
