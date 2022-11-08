/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicaintegradora;

import java.util.*;


/**
 *
 * @author CHIZO
 */
public class CalculoBonoSueldo {
    Scanner LeerTeclado = new Scanner(System.in);
    static String [][]  haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
    static String [][]  deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<Integer>();

    public static void main(String[] args) {
        
        cargaDato();
       
        
    }
    public static void cargaDato(){
       Scanner LeerTeclado = new Scanner(System.in);
        //para obtener el año actual
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR); 
          


        //creo la intacia empleado
        Empleado empleado = new Empleado();
        //empiezo a cargar los datos
        System.out.println("Ingrese el Nombre Completo del empleado");
        empleado.setNombreEmpleado(LeerTeclado.nextLine());
        System.out.println("Ingrese el numero de cuil");
        empleado.setCuil(LeerTeclado.nextLong());
        System.out.println("Ingrese el año de ingreso del empleado");
        //validacion de añlño de ingreso y carga
        while(true){
            int anioIngreso=LeerTeclado.nextInt();
            if(anioIngreso>anio){
                System.out.println("El año Ingresado es incorrecto");
                System.out.println("Vuelva a ingresar el año");
            }else{
                empleado.setAnioIngreso(anioIngreso);
                break;
            }
        }
        System.out.println("Ingrese el año de Liquidacion");
        
        //------------------------------------
        System.out.println(empleado.getNombreEmpleado());
        System.out.println(empleado.getCuil());
        System.out.println(empleado.getAnioIngreso());
        
       
        
    }
}