/*
  Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una
correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
las opciones del menú.
 */
package com.mycompany.trabajopracticocuatro;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        int x= LeerTeclado.nextInt();
        while(x<4||x>10){
            System.out.println("ingrese un nuevo valor");
            x= LeerTeclado.nextInt();
        }
        menu(x);
        
    }
    public static int [][]cargarMatriz(int matriz[][], int x){
       Scanner LeerTeclado = new Scanner(System.in);
       //int [][]matriz =new int[x][x];
         for(int i=0;i<matriz.length;i++){
            for(int j=0;j<x;j++){
                System.out.println("Ingrese el valor de la siguiente posicion ["+i+"]["+j+"]: ");
                matriz[i][j]= LeerTeclado.nextInt();   
            }
          }
         return matriz;   
    }
    public static void sumaFila(int matriz[][], int x){
        Scanner LeerTeclado = new Scanner(System.in);
        int suma=0;
        System.out.println("ingrese el numero de la fila que desea sumar");
        int fila = LeerTeclado.nextInt();
        while(fila<0||fila>x){
            System.out.println("ingrese un numero de fila valido");
            fila= LeerTeclado.nextInt();
        }
        for (int j = 0; j < fila; j++) {
         suma += matriz[fila][j];
        }
        System.out.printf("La suma de la fila "+fila+" es: "+suma);
    }
    public static void sumaColumna(int matriz[][], int x){
        Scanner LeerTeclado = new Scanner(System.in);
        int suma=0;
        System.out.println("ingrese el numero de la columna que desea sumar");
        int columna = LeerTeclado.nextInt();
        while(columna<0||columna>x){
            System.out.println("ingrese un numero de fila valido");
            columna= LeerTeclado.nextInt();
        }
        for (int i = 0; i < columna; i++){
            
         suma += matriz[i][columna];
        }
        System.out.printf("La suma de la columna "+columna+" es: "+suma);
    }
       public static void sumaDiagonal(int matriz[][]) {

        int resultado = 0;

        int i = 0, j = 0;
        while (i < matriz.length && j < matriz[0].length) {
            resultado += matriz[j][i];
            i++;
            j++;
        }

        System.out.println("La suma de la diagonal es: \n" + resultado );
    }

    public static void sumaDiagonalInversa(int matriz[][]) {
        int resultado = 0;
        int i = 0, j = matriz.length - 1;
        while (i < matriz.length && j >= 0) {
            resultado += matriz[j][i];
            i++;
            j--;
        }

        System.out.println("La suma de la diagonal inversa es: \n" + resultado);

    }

    public static void mediaMatriz(int matriz[][]) {
        int resultado = 0;
        int ite = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                resultado += matriz[i][j];
                ite++;
            }
        }
        resultado = resultado / ite;

        System.out.println("La media de la matriz es: " + resultado);
        
    }
    public static void menu(int x){
         Scanner lt = new Scanner(System.in);
         boolean salir=false, bandera = true;
         String opcion;
         int matriz[][]= new int [x][x];
        if(bandera){
             matriz=cargarMatriz(matriz,x);

         }

         while(!salir){
          System.out.println("-----------------------------------------------");
             System.out.println("a) Rellenar TODA la matriz de números");
             System.out.println("b) Suma de una fila que se pedirá al usuario");
             System.out.println("c) Suma de una columna que se pedirá al usuario");
             System.out.println("d) Sumar la diagonal principal");
             System.out.println("e) Sumar la diagonal inversa");
             System.out.println("f) La media de todos los valores de la matriz");
             System.out.println("g) Salir");
          System.out.println("-----------------------------------------------");
             System.out.println("Ingrese la opcion deseada");
             opcion= lt.nextLine();
             if(opcion.equals("a")){
                matriz=cargarMatriz(matriz,x);
             }else if(opcion.equals("b")){
                 sumaFila(matriz,x) ;
             }else if(opcion.equals("c")){
                 sumaColumna(matriz,x);
             }else if(opcion.equals("d")){
                 sumaDiagonal(matriz);
             }else if(opcion.equals("e")){
                 sumaDiagonalInversa(matriz);
             }else if(opcion.equals("f")){
                  mediaMatriz(matriz) ;
             }else if(opcion.equals("g")){
                   salir = true;
             }else{
                   System.out.println("Opción Incorrecta. Intente nuevamente.");
                   System.out.println("----------------------");
                   }


    }
     }
    }

