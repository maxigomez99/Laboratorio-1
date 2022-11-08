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
public class RecursividadVeintidos {
    public int Suma(int num){
        if(num==0){
            return 0;
        } else {
            return Suma(num/10) + num%10;
        }
        
    }  
}
