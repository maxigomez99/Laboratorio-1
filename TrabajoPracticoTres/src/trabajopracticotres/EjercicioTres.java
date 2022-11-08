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
public class EjercicioTres {
 public static void main(String[] args) {
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int t = LeerTeclado.nextInt();
        System.out.println("Ingrese con multiplos de que numero quiere rellenar el arreglo");
        int m= LeerTeclado.nextInt();
        int arreglo[]=cargarArreglo(t, m);
        mostrar(arreglo);
        
        
    }
   public static int []cargarArreglo(int t, int m){     
        int arreglo[]= new int[t];
        for(int i=0; i<t;i++){
            arreglo[i]=m*(i+1);
        }
    return arreglo;    
    }
   public static void mostrar(int arreglo[]){
       System.out.print("[");
        for(int i=0; i<arreglo.length;i++){
       
            System.out.print(arreglo[i]+"\t");
        }
       System.out.println("]");
   }
   }

