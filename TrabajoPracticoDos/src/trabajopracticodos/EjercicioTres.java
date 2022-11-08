/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioTres {
     public static void main(String[] args) {
         int numero, num1, num2, num3, num4, suma;
         
        Scanner LeerPorTeclado = new Scanner(System.in);
        do{
        System.out.println("Ingrese un número de tres digitos");
        numero = LeerPorTeclado.nextInt();
        }
        while(numero<=99 || numero>=1000);
        
        num1 = numero/10;
        num2 = numero%10;
        num3 = num1/10;
        num4 = num1%10;
        suma = num2+num3+num4;
       
         System.out.println("La suma de los numeros es: "+ suma);
        
     }
}

  
