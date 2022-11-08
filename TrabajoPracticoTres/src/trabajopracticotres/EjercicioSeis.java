/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int array[] = cargaArreglo();
        
        System.out.println("Ingrese el numero que desea buscar en el arreglo(a-100): ");
        int numero = lt.nextInt();
        int resultado=busqueda(array,numero);
        if(resultado !=50){
            System.out.println("El numero "+numero+" fue encontrado en la posicion: "+resultado);
        }
        else{
            System.out.println("El numero no fue encontrado");
        }
        mostrar(array);
    }
    public static int []cargaArreglo(){
        int arreglo[]=new int[50];
        
        for( int i=0 ;i<50 ;i++){
         arreglo[i]=(int)(Math.random()*100+1);
            }
            return arreglo;
    }
    public static int  busqueda(int array[], int numero){
        int resultado=0;
               
        for(int i=0 ;i<50 ;i++){
           if(array[i]== numero){
               resultado=i;
               i=50;
           } 
           else{
               resultado=50;
           }    
        }
        
        return resultado;
    }
       public static void mostrar(int arreglo[]){
            System.out.println("El arreglo que ingreso es :");
        System.out.print("[\t");
        for( int i=0 ;i<50 ;i++){
            System.out.print(arreglo[i]+"\t");
            }
            System.out.println("]"); 

       }
    }
    

