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
public class EjercicioOcho {
  public static void main(String[] args) {
        String nuevaCadena;
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String cadena = LeerTeclado.nextLine();
        nuevaCadena = cadena.replace("a","e");
        
        System.out.println(nuevaCadena);
}
}