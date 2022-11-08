/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploparcial2022;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjemploParcial2022 {

    public static void main(String[] args) {
     int acumulado=0, contador=0;      
        
     
     while(acumulado<=1000000){
     
     acumulado+=ingreso();
     contador++;
     
       
    } 
     System.out.println("acumulado: "+acumulado);   
     System.out.println("se nesesitaron: "+contador+" ingresos");
    }
    public static int ingreso(){  
      Scanner lt = new Scanner(System.in);
      int num; 
      do{ 
          System.out.println("Ingrese un numero");
          num=lt.nextInt();
          
      }   
      while(num<0||num>100000);      
      return num;
    }
}