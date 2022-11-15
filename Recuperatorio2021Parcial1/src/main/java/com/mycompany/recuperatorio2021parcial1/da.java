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
public class da {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String areaJuego [][] = new String [10][10];
        int contador = 0, linea, columna;
        llenarConEspacios(areaJuego);
        System.out.println("Bienvenidos al juego 3 en linea");
        System.out.println("El jugador 1 tiene asignado el símbolo O");
        System.out.println("El jugador 2 tiene asignado el símbolo X");
        System.out.println("Gana quien logre colocar 3 de sus símbolos consecutivamente en linea o columna");
        
        while (true) {            
            contador++;
            System.out.println("------------------------");
            System.out.println("Ronda "+contador);
            System.out.println("Turno Jugador 1");
            System.out.println("Ingrese la posición a colocar su ficha X");
            int [] posicion = llenarX(areaJuego);
            mostrarMatriz(areaJuego);
            if(esGanador(areaJuego, posicion[0], posicion[1], "X")){
                System.out.println("EL JUGADOR 1 GANO");
                break;
            }
            System.out.println("-------------------------");
            //Es ganador?
            System.out.println("Turno Jugador 2");
            System.out.println("Ingrese la posición a colocar su ficha O");
            int [] posicion1 = llenarO(areaJuego);
            mostrarMatriz(areaJuego);
            //Es ganador?
            if(esGanador(areaJuego, posicion[0], posicion[1], "O")){
                System.out.println("EL JUGADOR 2 GANO");
                break;
            }
            System.out.println("-------------------------");
            if(contador==100){
                System.out.println("Empate");
                break;
            }
        }
        
        
        
    }
    
    public static void llenarConEspacios(String [][] areaJuego){
        for (int i = 0; i < areaJuego.length; i++) {
            for (int j = 0; j < areaJuego[i].length; j++) {
                areaJuego[i][j] = " ";
            }
        }
    }
    public static void mostrarMatriz(String[][] areaJuego){
        for (int i = 0; i < areaJuego.length; i++) {
            for (int j = 0; j < areaJuego[i].length; j++) {
                System.out.print("|"+areaJuego[i][j]);
            }
            System.out.println("|");
        }
    }
    public static int linea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la linea");
        int linea = sc.nextInt();
        if(linea < 0 || linea > 9){ 
            System.out.println("Valor incorrecto");
            linea = linea();
        }
    return linea;
    }
    public static int columna(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la columna");
        int columna = sc.nextInt();
        if(columna < 0 || columna > 9){ 
            System.out.println("Valor incorrecto");
            columna = columna();
        }
        return columna;
    }
    public static int[] llenarX(String[][] areaJuego){
        
        int linea = linea();
        int columna = columna();
        
        if(areaJuego[linea][columna].equals(" ")){
            areaJuego[linea][columna] = "X";
        }else{
            System.out.println("La posición asignada está ocupada");
            llenarX(areaJuego);
        }
        int [] posicion = {linea, columna};
       return posicion;
    }
    public static int[] llenarO(String[][] areaJuego){
        int linea = linea();
        int columna = columna();
        
        if(areaJuego[linea][columna].equals(" ")){
            areaJuego[linea][columna] = "O";
        }else{
            System.out.println("La posición asignada está ocupada");
            llenarO(areaJuego);
        }
        int [] posicion = {linea, columna};
       return posicion;
    }
    public static boolean esGanador(String[][] m, int f, int c, String le){
        
        if(f==0&&c==0){
            return dosDerecha(m, f, c, le)||dosAbajo(m, f, c, le);
            
        }else if(f==0&&c==9){
            return dosIzquierda(m, f, c, le)||dosAbajo(m, f, c, le);
            
        }else if(f==9&&c==0){
            return dosDerecha(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(f==9&&c==9){
            return dosIzquierda(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(f==0&&c==1){
            return horizontal(m, f, c, le)||dosDerecha(m, f, c, le)||dosAbajo(m, f, c, le);
            
        }else if(f==0&&c==8){
            return horizontal(m, f, c, le)||dosIzquierda(m, f, c, le)||dosAbajo(m, f, c, le);
        
        }else if(f==0){
            return dosIzquierda(m, f, c, le)||horizontal(m, f, c, le)||dosDerecha(m, f, c, le)||dosAbajo(m, f, c, le);
            
        }else if(f==1&&c==0){
            return vertical(m, f, c, le)||dosDerecha(m, f, c, le)||dosAbajo(m, f, c, le);
                    
        }else if(f==8&&c==0){
            return vertical(m, f, c, le)||dosDerecha(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(c==0){
            return dosArriba(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le)||dosDerecha(m, f, c, le);
            
        }else if(f==9&&c==1){
            return horizontal(m, f, c, le)||dosDerecha(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(f==9&&c==8){
            return horizontal(m, f, c, le)||dosIzquierda(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(f==9){
            return dosDerecha(m, f, c, le)||horizontal(m, f, c, le)||dosIzquierda(m, f, c, le)||dosArriba(m, f, c, le);
            
        }else if(f==1&&c==9){
            return dosIzquierda(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le);
        
        }else if(f==8&&c==9){
            return dosIzquierda(m, f, c, le)||vertical(m, f, c, le)||dosArriba(m, f, c, le);
        
        }else if(c==9){
            return dosIzquierda(m, f, c, le)||dosArriba(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le);
        
        }else if(f==1&&c==1){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosDerecha(m, f, c, le)||dosAbajo(m, f, c, le);
            
        }else if(f==1&&c==8){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le)||dosIzquierda(m, f, c, le);
        
        }else if(f==1){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le)||dosIzquierda(m, f, c, le)||dosDerecha(m, f, c, le);
        
        }else if(f==8&&c==1){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosDerecha(m, f, c, le)||dosArriba(m, f, c, le);
        
        }else if(c==1){
            return horizontal(m, f, c, le)||dosArriba(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le)||dosDerecha(m, f, c, le);
        
        }else if(f==8&&c==8){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosArriba(m, f, c, le)||dosIzquierda(m, f, c, le);
        
        }else if(c==8){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosArriba(m, f, c, le)||dosIzquierda(m, f, c, le);
        
        }else if(f==8){
            return horizontal(m, f, c, le)||vertical(m, f, c, le)||dosArriba(m, f, c, le)||dosDerecha(m, f, c, le)||dosIzquierda(m, f, c, le);
            
        }else{
            return dosIzquierda(m, f, c, le)||horizontal(m, f, c, le)||dosDerecha(m, f, c, le)||dosArriba(m, f, c, le)||vertical(m, f, c, le)||dosAbajo(m, f, c, le);
        
        }
        
    }
    //CORRECCIÓN PARA GENERAR UN BUEN ORDEN
    public static boolean dosIzquierda(String[][]m,int f,int c,String le){
    return m[f][c-2].equals(le)&&m[f][c-1].equals(le);
    }
    public static boolean horizontal(String[][]m,int f,int c,String le){
    return m[f][c-1].equals(le)&&m[f][c+1].equals(le);
    }
    public static boolean dosDerecha(String[][]m,int f,int c,String le){
    return m[f][c+2].equals(le)&&m[f][c+1].equals(le);
    }
    public static boolean dosArriba(String[][]m,int f,int c,String le){
    return m[f-2][c].equals(le)&&m[f-1][c].equals(le);
    }
    public static boolean vertical(String[][]m,int f,int c,String le){
    return m[f-1][c].equals(le)&&m[f+1][c].equals(le);
    }
    public static boolean dosAbajo(String[][]m,int f,int c,String le){
    return m[f+2][c].equals(le)&&m[f+1][c].equals(le);
    }
    
    
}
    
    

