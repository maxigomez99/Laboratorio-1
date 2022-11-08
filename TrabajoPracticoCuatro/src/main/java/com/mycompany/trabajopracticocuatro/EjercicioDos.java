/* Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
entero que deberá ser ingresado por el usuario. A continuación cree un segundo
array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
el resultante de multiplicar cada una de las posiciones de las filas del array uno por
cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores
*/
package com.mycompany.trabajopracticocuatro;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese un numero x");
        int x = LeerTeclado.nextInt();
        System.out.println("Ingrese un numero y");
        int y = LeerTeclado.nextInt();
        int [][]array =new int[x][y];
        System.out.println("ingrese los valores de la matriz A");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
             array[i][j]= LeerTeclado.nextInt();   
            }
        }
        int [][]arrayDos =new int[y][x];
        System.out.println("ingrese los valores de la matriz B");
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
             arrayDos[i][j]= LeerTeclado.nextInt();   
            }
        }
        int [][] arrayTres = new int[x][x];
          for (int a = 0; a < arrayDos[0].length; a++) {
            
            for (int i = 0; i < array.length; i++) {
                int suma = 0;
                
                for (int j = 0; j < array[0].length; j++) {
                   
                    suma += array[i][j] * arrayDos[j][a];
                }
                // Lo acomodamos dentro del producto
                arrayTres[i][a] = suma;
            }
        }
         System.out.println("Matriz A");
          for(int i=0;i<x;i++){
              System.out.print(array[i][0]);
             for(int j=1;j<y;j++){
              
              System.out.print(" "+array[i][j]);
              
          }
              System.out.println(" ");
          
          }
           System.out.println("Matriz B");
          for(int i=0;i<y;i++){
              System.out.print(arrayDos[i][0]);
             for(int j=1;j<x;j++){
              
              System.out.print(" "+arrayDos[i][j]);
              
          }
              System.out.println(" ");       
          
          }
                   
          System.out.print("producto\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%d ", arrayTres[i][j]);
            }
            System.out.print("\n");     
    }
    
}
}
