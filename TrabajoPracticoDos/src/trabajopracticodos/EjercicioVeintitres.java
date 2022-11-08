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
public class EjercicioVeintitres {

   
    public static void main(String[] args) {
        RecursividadVeintitres recursividadVeintitres = new RecursividadVeintitres();
        Scanner leerTeclado= new Scanner(System.in);
        String palabra ="hola";
        System.out.println("Ingrese la frase");
        palabra= leerTeclado.nextLine();
        System.out.println(recursividadVeintitres.invertirPalabra(palabra,palabra.length()-1));
    }
    }
    
