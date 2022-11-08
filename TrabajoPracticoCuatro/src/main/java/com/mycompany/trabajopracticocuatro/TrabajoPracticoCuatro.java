/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajopracticocuatro;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class TrabajoPracticoCuatro {

    public static void main(String[] args) {
        String [][]ciudades = new String [4][4];
        Scanner LeerTeclado = new Scanner(System.in);
        
         
        for(int i=0;i<ciudades.length;i++){
            System.out.println("Ingrese pais N°"+(i+1));
            ciudades[i][0]= LeerTeclado.nextLine();
            
        }
    
    
         for(int i=0;i<ciudades.length;i++){
             System.out.println("Ingrese las 3 ciudades del pais: "+ciudades[i][0]);
             for(int j=1;j<ciudades[0].length;j++){
             ciudades[i][j]= LeerTeclado.nextLine();   
            }
         }
          for(int i=0;i<4;i++){
              System.out.print("Pais: "+ciudades[i][0]);
              System.out.print("  Ciudades: ");
          for(int j=1;j<4;j++){
              
              System.out.print(" "+ciudades[i][j]);
              
          }
              System.out.println(" ");
         }
         
        }

    }


