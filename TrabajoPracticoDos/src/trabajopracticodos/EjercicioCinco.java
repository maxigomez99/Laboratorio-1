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
public class EjercicioCinco {
    public static void main(String[] args) {
    Scanner LeerTeclado = new Scanner(System.in);
        System.out.println ("Ingrese un numero");
        float numero = LeerTeclado.nextFloat();
        String n = String.valueOf(numero);
        System.out.println ("String: "+n);
}
}