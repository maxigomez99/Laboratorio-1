/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.integrador;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class INTEGRADOR {

    public static void main(String [] args){
        Scanner LeerTeclado= new Scanner(System.in);
        float numeros, suma=0;
        do{
            System.out.println("Ingrese la cantidad de numeros que desee");
            numeros=LeerTeclado.nextInt();
        }   
        while(numeros<0);
        System.out.println("ingrese los numeros que desea saber el promedio");
        for(int i=0;i<numeros;i++){
            suma+=LeerTeclado.nextFloat();
        }
        float promedio=suma/numeros;
        System.out.println("El promedio es: "+promedio);
    }
}

