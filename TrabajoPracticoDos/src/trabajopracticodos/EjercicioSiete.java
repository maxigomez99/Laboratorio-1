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
public class EjercicioSiete {
    public static void main(String[] args) {
       int tamano, contador =0;
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena que quiere saber el tamaño y la cantidad de vocales");
        String cadena = LeerTeclado.nextLine();
        tamano = cadena.length();
        //System.out.println("El tamaño de la cadena es: "+tamano);
        for(int x=0;x<tamano;x++){
            if((cadena.charAt(x)=='a')||(cadena.charAt(x)=='e')||(cadena.charAt(x)=='i')||
               (cadena.charAt(x)=='o')||(cadena.charAt(x)=='u') ){
                contador++;
            }
            }
            System.out.println("tamaño de la cadena: "+tamano+" cantidad de volcales: "+contador);
             
             
        }
}
