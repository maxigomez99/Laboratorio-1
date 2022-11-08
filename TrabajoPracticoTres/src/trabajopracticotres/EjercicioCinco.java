/*
 * Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético 
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioCinco {

    
    public static void main(String[] args) {
       
        int []arreglo = cargarArreglo();
        mostrar (arreglo);
        double promedio = promedio(arreglo);
        System.out.println("El promedio es: "+promedio);
        igualMayorMenor(arreglo, promedio);
        
    }
     public static int []cargarArreglo(){     
        
         int arreglo[]= new int[20];
         int x; 
         for(int i=0; i<20;i++){
              
            do{
              x =  (int)(Math.random()*100+1); 
             
              arreglo[i]=x;  
            }
            while((x%2)!=0);     
            
        }
    return arreglo;    
    }
     public static double promedio(int arreglo[]) {
        double suma=0;
         double promedio;
         for(int i=0;i<20;i++){
            suma = arreglo[i]+suma;
        }
         promedio = suma/20;
        return promedio;
    }
     public static void igualMayorMenor(int arreglo[], double promedio) {
     int igual=0;
     int mayor=0;
     int menor=0;
     
     for(int i=0;i<20;i++){
         if(arreglo[i]==promedio){
             igual++;
         }
         if(arreglo[i]>promedio){
             mayor++;
         }
         if(arreglo[i]<promedio){
             menor++;
         }
     }
         System.out.println("la cantidad de  numeros iguales al promedio son: "+igual);
         System.out.println("la cantidad de  numeros mayores al promedio son: "+mayor);
         System.out.println("la cantidad de  numeros menores al promedio son: "+menor);
     }
     
     public static void mostrar(int arreglo[]){
       System.out.print("[");
        for(int i=0; i<arreglo.length;i++){
       
            System.out.print(arreglo[i]+"\t");
        }
       System.out.println("]");
   }
}
