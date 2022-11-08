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
public class EjercicioVeintidos {
 
    public static void main(String[] args) {
       RecursividadVeintidos recursividadVeintidos = new RecursividadVeintidos();
     Scanner leerTeclado = new Scanner(System.in);

        int numero;
        System.out.println("Introduce un número para sumar sus dígitos: ");
        numero = leerTeclado.nextInt();
        int resultado=recursividadVeintidos.Suma(numero);
       System.out.println("La suma de los dígitos del número: "+numero+" es "+ resultado);

        
        }
    }
    

