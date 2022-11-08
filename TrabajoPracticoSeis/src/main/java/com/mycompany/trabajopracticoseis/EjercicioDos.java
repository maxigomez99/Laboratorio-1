/*
 Codifique una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los
coloque en un ArrayList<Double>.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
muestre el rango (diferencia entre el mayor y el menor) de los
elementos en el arreglo 
 */
package com.mycompany.trabajopracticoseis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LeerTeclado = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList();
        double n, mayor=0, menor=0;
        int i;
        
        for(i=0;i<20;i++){
            System.out.println("Introduce numeros");
            n=LeerTeclado.nextDouble();
            numeros.add(n);
        }
        mayor = Collections.max(numeros);
        menor = Collections.min(numeros);
        
        double diferencia = mayor-menor;
        
        System.out.println("los numeros ingresados son: "+numeros);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        System.out.println("El rango es: "+diferencia);
        }
    }
    
    

