/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabajopracticocuatro;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner lt= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas y columnas que tendra su matriz cuadrada");
        int x= lt.nextInt();
        while(x<3 || x>10){
            System.out.println("ingrese nuevamente la cantidad");
            x=lt.nextInt();
        }
        int matriz[][]=ingresoMatrices(x);
        int suma[]= sumarColumnas(matriz);
        mostrar(matriz);
        System.out.println("");
        mostrarArray(suma);
        System.out.println("");
        System.out.println("Total: "+totalDeLaMatriz(suma));
    }
   public static int [][]ingresoMatrices(int x){
        Scanner lt= new Scanner(System.in);
        int matrizCargada[][]= new int[x][x];
      
       for(int i=0; i<x;i++){
            for(int j=0; j<x;j++){
                System.out.println("Ingrse el valor ["+i+"]["+j+"]: "); 
                matrizCargada[i][j]=lt.nextInt();
            }
           } 
       return matrizCargada;
    }
    
    public static int []sumarColumnas(int matriz[][]){
      
     int suma[]= new int [matriz.length];
    for(int i=0; i<matriz.length;i++){
         for(int j=0; j<matriz.length;j++){  
            suma[i]+=matriz[j][i];
        } 
    }
    
    return suma;
    }
  public static int totalDeLaMatriz(int suma[]){
      int total=0;
      for(int i=0; i<suma.length;i++){
          total+= suma[i];
      }
      return total;
  }
   public static void mostrar(int matriz[][]){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
               System.out.println(" ");
           }
    }
   public static void mostrarArray(int arrar[]){
       for(int i=0;i<arrar.length;i++){
           System.out.print(arrar[i]+"\t");
       }
       System.out.println(" ");
   }
}
    

