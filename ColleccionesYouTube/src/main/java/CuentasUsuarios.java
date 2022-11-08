

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author CHIZO
 */
public class CuentasUsuarios {

    
    public static void main(String[] args) {
        Cliente cl1=new Cliente("Gomez Maximiliano","00001",2000);
        Cliente cl2=new Cliente("Gomez Emiliano","00002",2500);
        Cliente cl3=new Cliente("Gomez Luis","00003",3000);
        Cliente cl4=new Cliente("Urquiza Charo","00004",2000000);
        
        //Creamos la coleccion
        Set <Cliente>clienteBanco = new HashSet<Cliente>();
        //agregamos los datos a la coleccion
        clienteBanco.add(cl1);
        clienteBanco.add(cl2);
        clienteBanco.add(cl3);
        clienteBanco.add(cl4);
        //recorremos la coleccion
        for (Cliente cliente : clienteBanco) {
            System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "
            +cliente.getSaldo());
            
        }
    }
    
}
