/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioCuatro {
    public static void main(String[] args) {
    double dinero, billeteDocientos, restoDocientos, billeteCien, restoCien,
                billeteCincuenta, restoCincuenta, billeteVeinte, restoVeinte,
                billeteDiez, restoDiez, billeteCinco, restoCinco, billeteDos,
                restoDos, monedaCincuenta, restoMonedaCincuenta, monedaVeinticinco,
                restoMonedaVeinticinco, monedaDiez, restoMonedaDiez, monedaCinco,
                billeteUno, restoUno;
      
        Scanner leerPorTeclado = new Scanner(System.in);
        System.out.println("Ingrese el monto para determinar la cantidad de billetes");
        dinero = leerPorTeclado.nextDouble();

        billeteDocientos = dinero / 200;
        int a = (int) billeteDocientos;

        restoDocientos = dinero - (a * 200);
        billeteCien = restoDocientos / 100;
        int b = (int) billeteCien;

        restoCien = restoDocientos - (b * 100);
        billeteCincuenta = restoCien / 50;
        int c = (int) billeteCincuenta;

        restoCincuenta = restoCien - (c * 50);
        billeteVeinte = restoCincuenta / 20;
        int d = (int) billeteVeinte;

        restoVeinte = restoCincuenta - (d * 20);
        billeteDiez = restoVeinte / 10;
        int e = (int) billeteDiez;

        restoDiez = restoVeinte - (e * 10);
        billeteCinco = restoDiez / 5;
        int f = (int) billeteCinco;

        restoCinco = restoDiez - (f * 5);
        billeteDos = restoCinco / 2;
        int g = (int) billeteDos;

        restoDos = restoCinco - (g * 2);
        billeteUno = restoDos / 1;
        int h = (int) billeteUno;

        restoUno = restoDos - (h * 1);
        monedaCincuenta = restoUno / 0.50;
        int i = (int) monedaCincuenta;

        restoMonedaCincuenta = restoUno - (i * 0.50);
        monedaVeinticinco = restoMonedaCincuenta / 0.25;
        int j = (int) monedaVeinticinco;

        restoMonedaVeinticinco = restoMonedaCincuenta - (j * 0.25);
        monedaDiez = restoMonedaVeinticinco / 0.10;
        int k = (int) monedaDiez;

        restoMonedaDiez = restoMonedaVeinticinco - (k * 0.10);
        monedaCinco = restoMonedaDiez / 0.05;
        int l = (int) monedaCinco;
        
        if (0<a)
        System.out.println("Billete de Docientos " + a);
        if (0<b)
        System.out.println("Billete de Cien " + b);
        if (0<c)
        System.out.println("Billete de Cincuenta " + c);
        if (0<d)
        System.out.println("Billete de Veinte " + d);
        if (0<e)
        System.out.println("Billete de Diez " + e);
        if (f>0)
        System.out.println("Billete de Cinco " + f);
        if (g>0)
        System.out.println("Billete de Dos " + g);
        if (h>0)
        System.out.println("Billete de Uno " + h);
        if (i>0)
        System.out.println("Moneda de Cincuenta centavos " + i);
        if (j>0)
        System.out.println("Moneda de Veinticinco centavos " + j);
        if (k>0)
        System.out.println("Moneda de Diez centavos " + k);
        if (l>0)
        System.out.println("Moneda de Cinco centavos " + l);
    }
}
