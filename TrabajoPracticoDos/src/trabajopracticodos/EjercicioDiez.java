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
public class EjercicioDiez {
       public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        String frase;
        System.out.println("Ingrese la frase que desea convertir");
        frase = leerTeclado.nextLine();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Ingrese la opción que desea: \n 1- Convertir a Mayusculas.\n 2- Convertir a Minusculas.");
            opcion = leerTeclado.nextInt();
            leerTeclado.nextLine();
        }

        switch (opcion) {
            case 1:
                System.out.println(frase.toUpperCase());
                break;
            case 2:
                System.out.println(frase.toLowerCase());
                break;
        }

    }
}
 

