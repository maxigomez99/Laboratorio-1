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
public class EjercicioUno {
    public static void main(String[] args) {
       double numero;
       Scanner LeerPorTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número decimal");
       numero = LeerPorTeclado.nextDouble();
       short s = (short)numero;
       int i = (int)numero;
       long l = (long)numero;
       String k = String.valueOf(numero);
       float f = (float)numero;
        System.out.println("numero double = "+ numero);
       System.out.println("numero short = "+ s);
       System.out.println("numero int = "+ i);
       System.out.println("numero long = "+ l);
       System.out.println("numero string = "+ k);
       System.out.println("numero float = "+ f);
       
       
}
}