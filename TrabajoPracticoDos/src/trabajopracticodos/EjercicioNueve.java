/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author CHIZO
 */
public class EjercicioNueve {
     public static void main(String[] args) {
        String cadena = "La lluvia en Mendoza es escasa";
        char l;
        byte[] bytes = cadena.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < cadena.length(); i++) {
            l = cadena.charAt(i);

            System.out.println(l + " = " + bytes[i]);

        }
    }
}
