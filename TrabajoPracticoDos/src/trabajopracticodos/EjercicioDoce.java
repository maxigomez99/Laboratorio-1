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
public class EjercicioDoce {
         public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=leerTeclado.nextLine();
        System.out.println("cuarta letra:  "+frase.substring(3,4));
        System.out.println("quinta letra:  "+frase.substring(4,5));
    }
}

