/*
 *Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los
valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
pantalla la matriz resultante.
Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
en una nueva matriz de una dimensión, finalmente sume los valores de esta última
matriz y muestre el resultado por pantalla.
 */
package com.mycompany.trabajopracticocuatro;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner LeerTeclado = new Scanner(System.in);
       
      
        System.out.println("Ingrese un numero x");
         int x = LeerTeclado.nextInt();
       
        int [][]array =new int[x][x];
      
        System.out.println("ingrese los valores de la matriz A");
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
             array[i][j]= LeerTeclado.nextInt();   
            }
                    
        
       }
          System.out.println("Matriz");
          for(int i=0;i<x;i++){
              System.out.print(array[i][0]);
             for(int j=1;j<x;j++){
              
              System.out.print(" "+array[i][j]);
              
          }
              System.out.println(" ");
          
          }
          for (int i = 0; i < array[0].length; i++) {
        System.out.print("___");
    }
    System.out.println();
    // Luego recorrer por columna y sumar
    for (int i = 0; i < array[0].length; i++) {
        int suma = 0;
        for (int j = 0; j < array.length; j++) {
            suma += array[j][x];
        }
        System.out.printf("%d ", suma);
    }
    System.out.println();
}
}

