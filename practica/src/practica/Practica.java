package practica;

import java.util.Scanner;

public class Practica {

    static boolean tresEnLinea = false;
    static boolean tableroLleno=false;

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        llenarTablero(prueba);
        System.out.println("Jugador 1 jugara con O");
        System.out.println("Jugador 2 jugara con X");
        turnoJugadorUno(prueba);

    }

    private static void llenarTablero(Prueba prueba) {
        prueba.cargarTablero();
        for (int i = 0; i < prueba.getTablero().length; i++) {
            for (int j = 0; j < prueba.getTablero()[0].length; j++) {
                prueba.agregarAlTablero(i, j, "*");
            }
        }
    }

    private static void turnoJugadorUno(Prueba prueba) {
        Scanner lt = new Scanner(System.in);
        int jugador = 1;
        String ficha = "O";
        int fila=0, columna=0;
        System.out.println("Turno Jugador 1");
        while (true) {
            System.out.println("Ingrese fila(0-9) para colocar la O");
            while (true) {
                fila = lt.nextInt();
                if (fila>=0 || fila<=9) {
                    break;
                } else {
                    System.out.println("Numero de fila fuera del tablero");
                }
            }
                System.out.println("Ingrese columna(0-9) para colocar la O");
                while (true) {
                    columna = lt.nextInt();
                    if (fila>=0 || fila<=9) {
                        break;
                    } else {
                        System.out.println("Numero de columna fuera del tablero");
                        
                    }
                }
                    if ("*".equals(prueba.mostrarTablero(fila, columna))) {
                        prueba.agregarAlTablero(fila, columna, ficha);
                        break;
                    } else {
                        System.out.println("La casilla se encuentra ocupada");
                    }
                }

                tresEnLinea(jugador, ficha, prueba);
                 mostrarTablero(prueba);
                if (tresEnLinea == true) {
                    mostrarTablero(prueba);
                } else {
                    turnoJugadorDos(prueba);
                }
            }
        
    
    

    private static void turnoJugadorDos(Prueba prueba) {
        Scanner lt = new Scanner(System.in);
        int jugador = 2;
        String ficha = "X";
        int fila, columna;
        System.out.println("Turno Jugador 2");
        while (true) {
            System.out.println("Ingrese fila(0-9) para colocar la X");
            while (true) {
                fila = lt.nextInt();
                if (fila>=0 || fila<=9) {
                    break;
                } else {
                    System.out.println("Numero de fila fuera del tablero");
                }
            }
                System.out.println("Ingrese columna(0-9) para colocar la X");
                while (true) {
                    columna = lt.nextInt();
                    if (fila>=0 || fila<=9) {
                        break;
                    } else {
                       System.out.println("Numero de fila fuera del tablero");
                    }
                }
                    if ("*".equals(prueba.mostrarTablero(fila, columna))) {
                        prueba.agregarAlTablero(fila, columna, ficha);
                        break;
                    } else {
                        System.out.println("La casilla se encuentra ocupada");
                    }
                }

                tresEnLinea(jugador, ficha, prueba);
                tableroLleno(prueba);
                if (tresEnLinea == true) {
                    mostrarTablero(prueba);
                } else if (!tableroLleno) {
                    mostrarTablero(prueba);
                    turnoJugadorUno(prueba);
                } else {
                    System.out.println("Tablero completo. Ambos jugadores han empatado");
                }
            }
        
    

    private static void tresEnLinea(int jugador, String ficha, Prueba prueba) {
        String tercero = "";
        String segundo = "";
        String primero = "";
        for (int i = 0; i < prueba.getTablero().length; i++) {
            for (int j = 0; j < prueba.getTablero()[0].length; j++) {
                if (j == 0) {
                    tercero = prueba.mostrarTablero(i, j);
                }
                if (j == 1) {
                    segundo = prueba.mostrarTablero(i, j);
                }
                if (j == 2) {
                    primero = prueba.mostrarTablero(i, j);
                    if (primero.equals(ficha) && segundo.equals(ficha) && tercero.equals(ficha)) {
                        tresEnLinea = true;
                    }
                }
                if (j > 2) {
                    tercero = segundo;
                    segundo = primero;
                    primero = prueba.mostrarTablero(i, j);
                    if (primero.equals(ficha) && segundo.equals(ficha) && tercero.equals(ficha)) {
                        tresEnLinea = true;
                    }
                }
            }
        }
        for (int j = 0; j < prueba.getTablero()[0].length; j++) {
            for (int i = 0; i < prueba.getTablero().length; i++) {
                if (j == 0) {
                    tercero = prueba.mostrarTablero(i, j);
                }
                if (j == 1) {
                    segundo = prueba.mostrarTablero(i, j);
                }
                if (j == 2) {
                    primero = prueba.mostrarTablero(i, j);
                    if (primero.equals(ficha) && segundo.equals(ficha) && tercero.equals(ficha)) {
                        tresEnLinea = true;
                    }
                }
                if (j > 2) {
                    tercero = segundo;
                    segundo = primero;
                    primero = prueba.mostrarTablero(i, j);
                    if (primero.equals(ficha) && segundo.equals(ficha) && tercero.equals(ficha)) {
                        tresEnLinea = true;
                    }
                }
            }
        }
        if (tresEnLinea==true) {
            System.out.println("Ganador jugador " + jugador);
        }
    }

    
    
    private static void tableroLleno(Prueba prueba) {
        int hayEspacioAun = 0;
        for (int i = 0; i < prueba.getTablero().length; i++) {
            for (int j = 0; j < prueba.getTablero()[0].length; j++) {
                if (prueba.mostrarTablero(i, j).equals("*")) {
                    hayEspacioAun ++;
                }
            }
        }
        if (hayEspacioAun == 0) {
            tableroLleno = true;
        }else{
            System.out.println("aun quedan " + hayEspacioAun + " casilleros disponibles");
        }
    }
    
    
    private static void mostrarTablero(Prueba prueba) {
        for (int i = 0; i < prueba.getTablero().length; i++) {
            for (int j = 0; j < prueba.getTablero()[0].length; j++) {
                System.out.print("|" + prueba.mostrarTablero(i, j) + "|");
            }
            System.out.println("");
        }
    }
}
