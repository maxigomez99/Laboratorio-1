/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.recuperatorio2021parcial1;

import java.util.*;

/**
 *
 * @author CHIZO
 */
public class Recuperatorio2021Parcial1 {
static Scanner teclado = new Scanner(System.in);
 
    public static void main(String[] args) {
 
        TresEnLinea ttt = new TresEnLinea();
 
        int fila, columna;
        boolean posValida, correcto;
 
        //No salimos hasta que uno gane o no haya mas posibilidades
        while (!ttt.finPartida()) {
 
            do {
 
                //mostramos el jugador al que le toca
                ttt.mostrarTurnoActual();
 
                //muestro el tablero
                ttt.mostrarTablero();
 
                correcto = false;
                fila = pedirInteger("Dame la fila");
                columna = pedirInteger("Dame la columna");
 
                //Validamos la posicion
                posValida = ttt.validarPosicion(fila, columna);
 
                //Si es valido, comprobamos que no haya ninguna marca
                if (posValida) {
 
                    //Si no hay marca, significa que es correcto
                    if (!ttt.hayValorPosicion(fila, columna)) {
                        correcto = true;
                    } else {
                        System.out.println("Ya hay una marca en esa posicion");
                    }
                } else {
                    System.out.println("La posicion no es valida");
                }
 
                //Mientras no sea correcto, no salgo
            } while (!correcto);
 
            //depende del turno, inserta un simbolo u otro
            ttt.insertarEn(fila, columna);
 
            ttt.cambiaTurno();
        }
 
        //Muestra el tablero
        ttt.mostrarTablero();
 
        //Mostramos el ganador
        ttt.mostrarGanador();
 
    }
 
    /**
     * Pedimos un numero y lo devolvemos
     *
     * @param mensaje
     * @return
     */
    public static int pedirInteger(String mensaje) {
 
        System.out.println(mensaje);
        int numero = teclado.nextInt();
 
        return numero;
 
    }
 
}
