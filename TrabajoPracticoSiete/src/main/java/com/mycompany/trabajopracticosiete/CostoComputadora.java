/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabajopracticosiete;

/**
 *
 * @author CHIZO
 */
import java.util.*;
public class CostoComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lt = new Scanner(System.in);
    int opcion;
    double total=0;
    //inicio la clase computadora
    Computadora computadora = new Computadora();
    // cargo marca y modelo
        System.out.println("Ingrese la marca de la pc");
        computadora.setMarca(lt.nextLine());
        System.out.println("Ingrese el modelo de la pc");
        computadora.setModelo(lt.nextLine());
    do{     
        //inicio la clase componentes cpu
        ComponenteCPU componenteCPU = new ComponenteCPU();
        //cargo marca cantidad y precio de componente
       
        System.out.println("MENU: ");
        System.out.println("1- cargar componente");
        System.out.println("2- No Cargar mas componentes");
        opcion=lt.nextInt();
        switch(opcion){
            case 1:
                    System.out.println("Ingrese componente");
                    String com= lt.nextLine();
                    com= lt.nextLine();
                    componenteCPU.setComponente(com);
                    System.out.println("Ingrese la marca del componente");
                    componenteCPU.setMarca(lt.nextLine());
                    System.out.println("Ingrese la cantidad de componentes");
                    componenteCPU.setCantidad(lt.nextInt());
                    System.out.println("Ingrese el precio del componente");
                    componenteCPU.setPrecio(lt.nextDouble());
                    componenteCPU.setSubTotal(componenteCPU.getCantidad()*componenteCPU.getPrecio());
                    computadora.addComponentes(componenteCPU);
                    break;
            case 2: 
                    break;
        }
        }while(opcion != 2);
    
       //muestro
       System.out.println("---------Computadora---------");
       System.out.println("Marca: "+computadora.getMarca());
       System.out.println("Modelo: "+computadora.getModelo());
       System.out.println("---------Componentes---------");
       System.out.println("Componente \t\tMarca \t\tCantidad\t\tPrecio X Unidad\t\t\tSubTotal");
       for(ComponenteCPU componente : computadora.getComponentes()) {
            System.out.println(completarConEspacios(componente.getComponente()) + "\t" +
                    completarConEspacios(componente.getMarca()) + "\t" + 
                    completarConEspacios(Integer.toString(componente.getCantidad())) + "\t" +
                    completarConEspacios(Double.toString(componente.getPrecio())) + "\t" +
                    completarConEspacios(Double.toString(componente.getSubTotal())));

            total += componente.getSubTotal();
        }
        System.out.println(" \t\t \t\t \t\t \t\t COSTO TOTAL\t\t \t"+completarConEspacios(String.valueOf(total)));
        if(total < 50000) {
            double ganancia = total * 0.4;
            System.out.println("\nEl precio sugerido de venta es: " + total + " + " + ganancia + " = " + (total + ganancia));
        } else {
            double ganancia = total * 0.3;
            System.out.println("\nEl precio sugerido de venta es: " + total + " + " + ganancia + " = " + (total + ganancia));
        }
        
}
    private static String completarConEspacios(String cadena){

        int cantidadEspacios = 20 - cadena.length();

        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }

        return cadena;
    }
      }

