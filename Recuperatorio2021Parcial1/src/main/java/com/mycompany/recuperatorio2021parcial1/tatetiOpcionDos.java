/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recuperatorio2021parcial1;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class tatetiOpcionDos {
static String matriz[][] = new String [10][10];
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        inicializarMatriz();
        System.out.println("####Que comience el juego!!!####");
        mostrarMatriz();
        
        boolean flag = true;
        do{
            System.out.println("");
            System.out.println("Turno Jugador 1");
            jugar("O");
            mostrarMatriz();
            if(verificarLinea("O")){
                System.out.println("El jugador numero 1 gana la partida.");
                flag = false;
            }
            if (flag){
                System.out.println("");
                System.out.println("Turno Jugador 2");
                jugar("X");
                mostrarMatriz();
                if(verificarLinea("X")){
                    System.out.println("El jugador numero 2 gana la partida.");
                    flag = false;
                }
            }
            
            if(validarEspacio() == false){
                flag = false;
                System.out.println("Empate! no quedan lugares disponibles en el tablero.");
            }
        }while(flag);
        
    }
    
    public static boolean verificarLinea(String simbolo){
        
        boolean ganador = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length - 2; j++) {
                if(matriz[i][j].equals(simbolo) && matriz[i][j+1].equals(simbolo) && matriz[i][j+2].equals(simbolo)){
                    ganador = true;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length - 2; j++) {
                if(matriz[j][i].equals(simbolo) && matriz[j+1][i].equals(simbolo) && matriz[j+2][i].equals(simbolo)){
                    ganador = true;
                }
            }
        }
        
        return ganador;
    }
    
    public static void jugar(String simbolo){
        
        boolean flag = true;
        do{
            int fila = validarNumero(1, 10, "fila") - 1;
            int columna = validarNumero(1, 10, "columna") - 1;
            if (validarPosición(fila, columna)){
                matriz[fila][columna] = simbolo;
                flag = false;
            }
            else {
                System.out.println("La posición elegida está ocupada.");
            }
        }while(flag);   
    }
    
    
    public static boolean validarEspacio(){
        
        boolean espacio = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("-")){
                    espacio = true;
                }
            }
        }
        return espacio;
    }
    
    public static boolean validarPosición(int fila, int columna){
        
        boolean disponible = false;
        if (matriz[fila][columna].equals("-")){
            disponible = true;
        }
        return disponible;
    }  
    
    public static int validarNumero(int minimo, int maximo, String nombre){
        
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese " + nombre + ":");
            numero = sc.nextInt();
            if (numero < minimo || numero > maximo){
                System.out.println("El valor ingresado está fuera de rango.");
            }
        }while (numero < minimo || numero > maximo);
        return numero;
    }
    
    public static void mostrarMatriz(){
        
        System.out.println("   1  2  3  4  5  6  7  8  9  10");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(llenarConEspacios(String.valueOf(i+1)));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        System.out.println("");
        }
    }
    
    public static void inicializarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "-";
            }
        }
    }
    
    public static String llenarConEspacios(String palabra){
        
        do{
            palabra += " ";
        }while(palabra.length() < 3);
        return palabra;
    }
}

    

