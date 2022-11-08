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
public class EjercicioSeis {
    public static void main(String[] args) {
       int tamano;
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena que quiere saber el tamaño");
        String cadena = LeerTeclado.nextLine();
        tamano = cadena.length();
        System.out.println("El tamaño de la cadena es: "+tamano);
}
}
