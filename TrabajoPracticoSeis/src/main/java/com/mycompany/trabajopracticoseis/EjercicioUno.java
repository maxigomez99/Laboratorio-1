/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabajopracticoseis;

import java.util.ArrayList;
import java.util.Scanner;

/* Cree un ArrayList<Integer>, que permita asignar los valores numéricos
manualmente (los que tú quieras) hasta ingresar un valor menor a 0,
mostrar los números por pantalla. Solicite los números mediante un bucle.
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LeerTeclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int n;
        
        do{
            System.out.println("Introduce numeros");
            n=LeerTeclado.nextInt();
            if(n>=0){
                numeros.add(n);
            }
        }while(n>=0);
        System.out.println(numeros);
        }
    }
    

