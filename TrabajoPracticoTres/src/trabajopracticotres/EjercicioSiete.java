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
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int array[] = cargaArreglo();
       int menorAMayor[]=ordenAscendente(array);
       mostrar(menorAMayor);
      int mayorAMenor[]=ordenDescendente(menorAMayor);
       mostrar(mayorAMenor);
    }
    public static int []cargaArreglo(){
        int arreglo[]=new int[10];
       Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese los valores numericos del arreglo: ");
        for( int i=0 ;i<10 ;i++){
         arreglo[i]=lt.nextInt();
            }
            return arreglo; 
    } 
    public static int [] ordenAscendente(int array[]){
        
        int aux;
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
            if(array[i]<array[j]){
                 aux = array[i];
                 array[i]=array[j];
                 array[j]=aux;
            }
        }
    }
    
    return array;
}
public static int [] ordenDescendente(int array[]){
     int aux;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]>array[j]){
                    aux = array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
         }
return array;
}
    
   public static void mostrar(int arreglo[]){
            System.out.println("El arreglo ordenado es:");
        System.out.print("[\t");
        for( int i=0 ;i<10 ;i++){
            System.out.print(arreglo[i]+"\t");
            }
            System.out.println("]"); 

       }
    }
    

