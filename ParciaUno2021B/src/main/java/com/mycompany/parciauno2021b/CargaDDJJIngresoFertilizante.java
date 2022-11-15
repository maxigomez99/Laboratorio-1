/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parciauno2021b;

import java.util.*;

/**
 *
 * @author CHIZO
 */
public class CargaDDJJIngresoFertilizante {

    public static String[][] fertilizantesPermitidos = {
        {"101", "UREA", "BS"},
        {"102", "SULFATO AMONICO", "BS"},
        {"103", "NITRATO AMONICO", "BS"},
        {"104", "NITRATO DE CALCIO", "BS"},
        {"105", "SUPERFOSFATO SIMPLE", "BD"},
        {"106", "SUPERFOSFATO TRIPLE", "BD"},
        {"107", "NITRATO AMONICO", "BS"},
        {"108", "CLORURO DE POTASIO", "BD"},
        {"109", "SULFATO DE POTASIO", "BS"},
        {"110", "NITROGENO LIQUIDO", "BD"}};

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        DDJJIngresoFertilizante dDJJIngresoFertilizante = new DDJJIngresoFertilizante();
        System.out.println("Ingrese los datos de la empresa");
        nombreEmpresa(dDJJIngresoFertilizante);
        cuitEmpresa(dDJJIngresoFertilizante);
        mesAño(dDJJIngresoFertilizante);
        cantidadFertilizantes(dDJJIngresoFertilizante);

    }

    //tengo que ver si retorno o no un dato si no retorno uso void
    public static void nombreEmpresa(DDJJIngresoFertilizante dDJJIngresoFertilizante) {
        Scanner lt = new Scanner(System.in);
        do {
            System.out.println("Ingrese el nombre de la empresa");

            dDJJIngresoFertilizante.setEmpresa(lt.nextLine());
        } while (dDJJIngresoFertilizante.getEmpresa().length() <= 0);
    }

    public static void cuitEmpresa(DDJJIngresoFertilizante dDJJIngresoFertilizante) {
        Scanner lt = new Scanner(System.in);
        int digitos = 0;
        while (true) {
            System.out.println("Ingrese el cuit de la empresa");
            dDJJIngresoFertilizante.setCuitEmpresa(lt.nextLong());
            long cuit = dDJJIngresoFertilizante.getCuitEmpresa();
            while (cuit > 0) {

                cuit = cuit / 10;
                digitos++;
            }
            if (digitos < 11 || digitos > 11) {
                digitos = 0;
                System.out.println("Dato incorrecto. ingrese nuevamente");
            } else {
                break;
            }
        }
    }

    public static void mesAño(DDJJIngresoFertilizante dDJJIngresoFertilizante) {
        Scanner lt = new Scanner(System.in);
        //año y mes actual
        Calendar cal = Calendar.getInstance();
        int anioActual = cal.get(Calendar.YEAR);
        int mesActual = cal.get(Calendar.MONTH) + 1;
        //---------------------------------------------------------
        while (true) {
            System.out.println("Ingrese el mes de Declaracion");
            dDJJIngresoFertilizante.setMesDeclaracion(lt.nextInt());
            int mes = dDJJIngresoFertilizante.getMesDeclaracion();
            //System.out.println("actual: "+mesActual+" ingreso: "+mes);
            System.out.println("Ingrese el año de declaracion");
            dDJJIngresoFertilizante.setAnioDeclaracion(lt.nextInt());
            int anio = dDJJIngresoFertilizante.getAnioDeclaracion();
            //System.out.println("actual: "+anioActual+" ingreso: "+anio);
            if (anioActual <anio || mesActual < mes) {
                System.out.println("El año o el mes ingresado es incorrecto");
            } else {
                break;
            }
        }
    }
    public static void cantidadFertilizantes(DDJJIngresoFertilizante dDDJJIngresoFertilizante){
       Scanner lt = new Scanner(System.in);
       int cantidad;
       do{
        System.out.println("Ingrese la cantidad de fertilizantes");
         cantidad = lt.nextInt();
       }while(cantidad<0);
       dDDJJIngresoFertilizante.addDetallesFertilizante(cantidad);
       
    }
    
}
