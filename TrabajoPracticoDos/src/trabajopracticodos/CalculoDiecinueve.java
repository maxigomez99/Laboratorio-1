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
public class CalculoDiecinueve {
     public static void main(String[] args) {
         Scanner LeerTeclado = new Scanner(System.in);
         OperacionMatematica operacion = new OperacionMatematica();
         
         System.out.println("Ingrese el primer numero: ");
         
         operacion.setValor1(LeerTeclado.nextDouble());
 
         System.out.println("Ingrese el segundo numero: ");
         
         operacion.setValor2(LeerTeclado.nextDouble());
         
         System.out.println("indique que operacion desea realizar(suma= +, resta: -, division: /, multiplicacion: *): ");
         
         String op = LeerTeclado.next();
         
         System.out.println( "el resultado de la "+op+" = "+operacion.aplicarOperacion(op));
         
     }
}