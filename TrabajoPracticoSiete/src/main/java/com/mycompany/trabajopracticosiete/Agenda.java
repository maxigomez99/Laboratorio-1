/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabajopracticosiete;

import java.util.*;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lt= new Scanner(System.in);
        String clave;
       Long telefono;
        int opcion;
       
       HashMap<String, Long> agenda = new HashMap<String, Long>(); 
        //muestro menu
        do{
        System.out.println("MENU: ");
        System.out.println("1- Cargar datos en la agenda");
        System.out.println("2- Buscar Telefono por Nombre");
        System.out.println("3- Listar agenda");
        System.out.println("4- Salir");
        opcion = lt.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Carge los siguientes datos");
                System.out.println("Ingrese el nombre completo");
                clave = lt.nextLine();
                clave = lt.nextLine();
                System.out.println("Ingrese el numero de telefono");
                telefono = lt.nextLong();
                agenda.putIfAbsent(clave, telefono);
                break;
            case 2:
                System.out.println("Ingrese el nombre del telefono que desea buscar");
                
                String nombre=lt.nextLine();
                nombre=lt.nextLine();
                if(agenda.containsKey(nombre)){
                    System.out.println(nombre+" ,Telefono: "+agenda.get(nombre) );
                }else{
                    System.out.println("la persona no se encuentra en la agenda");
                }
                break;
            case 3:
                System.out.println("lista agenda completa");
                Iterator <String> buscar = agenda.keySet().iterator();
                
                while(buscar.hasNext()){
                    clave = buscar.next();
                    System.out.println(clave+"---"+" Telefono: "+agenda.get(clave));
                }
                
                break;
        }
        }while(opcion != 4);       
    }
}
    
    
