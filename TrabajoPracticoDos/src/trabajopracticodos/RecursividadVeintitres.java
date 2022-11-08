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
public class RecursividadVeintitres {
    public  String invertirPalabra(String palabra, int longitud){
        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }
        else{
            return palabra.charAt(longitud)+invertirPalabra(palabra, longitud-1);
        }
    }
}
