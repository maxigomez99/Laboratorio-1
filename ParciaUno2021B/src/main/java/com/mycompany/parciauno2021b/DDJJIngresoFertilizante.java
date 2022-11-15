/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parciauno2021b;



/**
 *
 * @author CHIZO
 */
public class DDJJIngresoFertilizante {
    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    //creo array de dos dimensiones
    private String [][]detallesFertilizantes;

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getMontoXIngreso() {
        return montoXIngreso;
    }

    public void setMontoXIngreso(double montoXIngreso) {
        this.montoXIngreso = montoXIngreso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(long cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public String[][] getDetallesFertilizantes() {
        return detallesFertilizantes;
    }

    public void setDetallesFertilizantes(String[][] detallesFertilizantes) {
        this.detallesFertilizantes = detallesFertilizantes;
    }
      public void addDetallesFertilizante(int x) {
        if(this.detallesFertilizantes == null)
            this.detallesFertilizantes = new String [x][6];
        
    
}
}
