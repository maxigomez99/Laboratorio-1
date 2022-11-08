/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemploparcialdos;

import java.util.*;

/**
 *
 * @author CHIZO
 */
public class LiquidacionEmpresa {

    /**
     * @param args the command line arguments
     */
     static ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        String razonSocial, cuit, nombre;
        int legajo; 
        double salario;
        // púnto uno-----------------------------------------------------------------------------------------
         Empresa empresa = new Empresa();
        do{
         System.out.println("Ingrese la RAZON SOCIAL de la empresa");
         razonSocial = lt.nextLine();
         empresa.setRazonSocial(razonSocial);
        }while(razonSocial.isEmpty() );// is empty es para comprobar que no es vacio
        
        do{
        System.out.println("Ingrese el CUIT de la empresa");
        cuit=lt.nextLine();
        empresa.setCuit(cuit);
        }while(cuit.length()!=11);//compruebo el cuit tenga 11 caracteres
        //punto dos------------------------------------------------------------------------------------------
        Empleado empleado = new Empleado();
        do{
            System.out.println("Ingrese el NOMBRE COMPLETO del empleado");
            nombre=lt.nextLine();
            empleado.setNombreCompleto(nombre);
        }while(nombre.isEmpty());
        do{
            System.out.println("Ingrese el LEGAJO del empleado");
            legajo=lt.nextInt();
            empleado.setLegajo(legajo);
        }while(legajo == 0);
        do{
            System.out.println("Ingrese el SALARIO del empleado");
            salario=lt.nextDouble();
            empleado.setSalario(salario);
        }while(salario <= 0);
        int posicion;
        do{
          NivelAcademico nivel = new NivelAcademico();
          System.out.println("Ingrese el codigo del nivel academico");
          int codigo = lt.nextInt();
          posicion=nivelesAcademicos.indexOf(codigo);
            if(codigo == 10||codigo==20||codigo==30||codigo==40){
            
            nivel.setCodigo(codigo);
            break;
            }else{
            System.out.println("El codigo ingresado en incorrecto");
            }
            
        }while(posicion <0);
    }
    public static void grabarNivel(){
        NivelAcademico niv1 = new NivelAcademico();
        NivelAcademico niv2 = new NivelAcademico();
        NivelAcademico niv3 = new NivelAcademico();
        NivelAcademico niv4 = new NivelAcademico();
        
        niv1.setCodigo(10);
        niv1.setNivel("Secundario Completo");
        niv1.setPorcentajeAumento(0.1);

        niv2.setCodigo(20);
        niv2.setNivel("Universitario Completo");
        niv2.setPorcentajeAumento(0.3);

        niv3.setCodigo(30);
        niv3.setNivel("Maestria Completo");
        niv3.setPorcentajeAumento(0.4);

        niv4.setCodigo(40);
        niv4.setNivel("Doctorado Completo");
        niv4.setPorcentajeAumento(0.5);

        nivelesAcademicos.add(niv1);
        nivelesAcademicos.add(niv2);
        nivelesAcademicos.add(niv3);
        nivelesAcademicos.add(niv4);
    }
    
}
