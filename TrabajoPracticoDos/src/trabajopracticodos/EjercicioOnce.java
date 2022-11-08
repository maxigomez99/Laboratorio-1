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
public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        String palabraUno, palabraDos;
        System.out.println("Ingrese dos palabras para comparar si son iguales");
        System.out.println("Ingrese la primer palabra");
        palabraUno = leerTeclado.nextLine();
        System.out.println("Ingrese la segunda palabra");
        palabraDos = leerTeclado.nextLine();
        System.out.println("Metodo equals: ");
        if (palabraUno.equals(palabraDos)) {
            System.out.println("Las pabras coinciden");
        } else {
            System.out.println("Las palabras son distintas");
        }
        System.out.println("Metodo compareTo");
        if (palabraUno.compareTo(palabraDos) == 0) {
            System.out.println("Las pabras coinciden");
        } else {
            System.out.println("Las palabras son distintas");
        }
        System.out.println("Metodo compareToIgnoreCase");
        if (palabraUno.compareToIgnoreCase(palabraDos) == 0) {
            System.out.println("Las pabras coinciden");
        } else {
            System.out.println("Las palabras son distintas");
        }

    }
}
