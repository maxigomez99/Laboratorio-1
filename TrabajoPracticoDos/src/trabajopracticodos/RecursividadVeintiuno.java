/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

/**
 *
 * @author CHIZO
 */
public class RecursividadVeintiuno {
    public int Suma(int numero ){
        if(numero>=2){
           int resultado=numero+Suma(numero-1);
           
           return resultado;
        }
       return 1;
    } 
}
