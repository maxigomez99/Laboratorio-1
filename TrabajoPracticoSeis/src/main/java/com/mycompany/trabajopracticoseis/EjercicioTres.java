/*
 * Codifique una aplicación para almacenar en un ArrayList<Integer>
aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético 
 */
package com.mycompany.trabajopracticoseis;

import java.util.ArrayList;


/**
 *
 * @author CHIZO
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Integer> numeros = new ArrayList();
        int n,i, mayor=0, menor=0, igual=0; 
        double suma=0;
        System.out.println("Se generaran 20 numeros aleatoreos");
        for(i=0;i<20;i++){
            
            n=(int) (Math.random()*100+1);
            numeros.add(n);
        }
        for(Integer num: numeros){
            suma = suma + num;
        }
        double promedio=suma/numeros.size();
        
        for(Integer numero: numeros){
            if(numero>promedio){
                mayor++;
            }else if(numero<promedio){
                menor++;
                
            }else{
                igual++;
            }
        }
        System.out.println("los numeros ingresados son: "+numeros);
        System.out.println("Promedio: " + promedio);
        System.out.println("cantidad mayor al promedio: "+mayor);
        System.out.println("cantidad menor al promedio: "+menor);
        System.out.println("cantidad igual al promedio: "+igual);
    }
    
}
