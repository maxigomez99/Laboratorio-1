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
public class EjercicioVeintiuno {

    public static void main(String[] args) {
     RecursividadVeintiuno recursividadVeintiuno = new RecursividadVeintiuno();
        Scanner leerTeclado =  new Scanner(System.in);
        int numero,resultado;
        System.out.println("Ingrese un numero entero Mayor a 0");
        numero= leerTeclado.nextInt();
       if(numero>0){
          resultado=recursividadVeintiuno.Suma(numero);
           System.out.println("el rsultado es:"+resultado);
       } 
       else{
           System.out.println("El numero ingresado es menor o igual a 0");
       }   
    }
    
}
