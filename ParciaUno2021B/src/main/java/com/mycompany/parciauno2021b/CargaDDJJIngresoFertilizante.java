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
        

        DDJJIngresoFertilizante dDJJIngresoFertilizante = new DDJJIngresoFertilizante();
        System.out.println("Ingrese los datos de la empresa");
        nombreEmpresa(dDJJIngresoFertilizante);
        cuitEmpresa(dDJJIngresoFertilizante);
        mesAño(dDJJIngresoFertilizante);
        cantidadFertilizantes(dDJJIngresoFertilizante);
        codigo(dDJJIngresoFertilizante);
        imprimir(dDJJIngresoFertilizante);

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
            if (anioActual < anio || mesActual < mes) {
                System.out.println("El año o el mes ingresado es incorrecto");
            } else {
                break;
            }
        }
    }

    public static void cantidadFertilizantes(DDJJIngresoFertilizante dDDJJIngresoFertilizante) {
        Scanner lt = new Scanner(System.in);
        int cantidad;
        do {
            System.out.println("Ingrese la cantidad de fertilizantes");
            cantidad = lt.nextInt();
        } while (cantidad < 0);
        dDDJJIngresoFertilizante.addDetallesFertilizante(cantidad);

    }

    public static void codigo(DDJJIngresoFertilizante dDJJIngresoFertilizante) {
        Scanner lt = new Scanner(System.in);
        String codigo;
        int buscoCodigo;
        int cantidad, subTotal;

        for (int i = 0; i < dDJJIngresoFertilizante.getDetallesFertilizantes().length; i++) {
            while (true) {
                System.out.println("Ingrese el codigo del fertilizante");
                codigo = lt.nextLine();
                buscoCodigo = Integer.parseInt(codigo);
                if (buscoCodigo < 101 || buscoCodigo > 110) {
                    System.out.println("El codigo: " + codigo + "no existe, ingrese nuevamente");
                } else {
                    for (String[] fPermitidos : fertilizantesPermitidos) {
                        int clave = Integer.parseInt(fPermitidos[0]);
                        if (buscoCodigo == clave) {
                            dDJJIngresoFertilizante.agregarFertilizante(i, 0, fPermitidos[0]);
                            dDJJIngresoFertilizante.agregarFertilizante(i, 1, fPermitidos[1]);
                            dDJJIngresoFertilizante.agregarFertilizante(i, 2, fPermitidos[2]);
                            if (fPermitidos[2].equals("BS")) {
                                while (true) {
                                    System.out.println("Ingrese el tamaño de la bolsa 5kg-10kg-25kg-50kg");
                                    dDJJIngresoFertilizante.agregarFertilizante(i, 3, lt.nextLine());
                                    if (dDJJIngresoFertilizante.mostrarFertilizante(i, 3).equals("5") || dDJJIngresoFertilizante.mostrarFertilizante(i, 3).equals("10")
                                            || dDJJIngresoFertilizante.mostrarFertilizante(i, 3).equals("25") || dDJJIngresoFertilizante.mostrarFertilizante(i, 3).equals("50")) {
                                        break;
                                    } else {
                                        System.out.println("Tamaño incorrecto");
                                    }
                                }
                                System.out.println("Ingrese la cantidad de bolsas");
                                dDJJIngresoFertilizante.agregarFertilizante(i, 4, lt.nextLine());
                                switch(dDJJIngresoFertilizante.mostrarFertilizante(i, 3)){
                                    case "5":
                                        cantidad = Integer.parseInt(dDJJIngresoFertilizante.mostrarFertilizante(i, 4));
                                        subTotal=cantidad*5;
                                        dDJJIngresoFertilizante.agregarFertilizante(i, 5, String.valueOf(subTotal));
                                        break;
                                    case "10":
                                        cantidad = Integer.parseInt(dDJJIngresoFertilizante.mostrarFertilizante(i, 4));
                                        subTotal=cantidad*8;
                                        dDJJIngresoFertilizante.agregarFertilizante(i, 5, String.valueOf(subTotal));
                                        break; 
                                    case "25":
                                        cantidad = Integer.parseInt(dDJJIngresoFertilizante.mostrarFertilizante(i, 4));
                                        subTotal=cantidad*20;
                                        dDJJIngresoFertilizante.agregarFertilizante(i, 5, String.valueOf(subTotal));
                                        break;
                                    case "50":
                                        cantidad = Integer.parseInt(dDJJIngresoFertilizante.mostrarFertilizante(i, 4));
                                        subTotal=cantidad*36;
                                        dDJJIngresoFertilizante.agregarFertilizante(i, 5, String.valueOf(subTotal));
                                        break;
                                }
                            }else{
                                dDJJIngresoFertilizante.agregarFertilizante(i, 3, "5");
                                System.out.println("Ingrese la cantidad de bidones");
                                dDJJIngresoFertilizante.agregarFertilizante(i, 4, lt.nextLine());
                                cantidad = Integer.parseInt(dDJJIngresoFertilizante.mostrarFertilizante(i, 4));
                                subTotal = cantidad * 12;
                                dDJJIngresoFertilizante.agregarFertilizante(i, 5, String.valueOf(subTotal));
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    private static String completarConEspacios(String cadena){
        
        int cantidadEspacios = 20 - cadena.length();
        
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        
        return cadena;
    }
    
    public static void imprimir(DDJJIngresoFertilizante dDJJIngresoFertilizante) {
        
        System.out.println("-------------------- DECLARACIÓN JURADA --------------------\n");
        System.out.println("Nombre de la empresa: " + dDJJIngresoFertilizante.getEmpresa());
        System.out.println("CUIT: " +  dDJJIngresoFertilizante.getCuitEmpresa());
        System.out.println("Mes: " +  dDJJIngresoFertilizante.getMesDeclaracion());
        System.out.println("Año: " + dDJJIngresoFertilizante.getAnioDeclaracion());
        System.out.println("");
        System.out.println("DETALLE FERTILIZANTES:");
        System.out.println(completarConEspacios("Código") + "\t" + completarConEspacios("Nombre") + "\t" +
                completarConEspacios("Tipo envase") +  "\t" + completarConEspacios("Capacidad") + "\t" +
                completarConEspacios("Cantidad") + "\t" + completarConEspacios("Subtotal"));
        
        for(int i=0; i< dDJJIngresoFertilizante.getDetallesFertilizantes().length; i++) {
            System.out.println("");
            for(int j=0;j<6;j++){
            
             System.out.print(completarConEspacios(dDJJIngresoFertilizante.mostrarFertilizante(i,j)+"\t"));
              
           // System.out.print("\n");
        }
        }
      dDJJIngresoFertilizante.calcularTotalAbonoIngreso();
        System.out.println("");
        System.out.println(completarConEspacios("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal: " + "\t"+dDJJIngresoFertilizante.getMontoXIngreso()));
    }
}

