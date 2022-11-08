/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploparcialdos;

import java.util.*;

/**
 *
 * @author CHIZO
 */
public class Empresa {
    private String cuit;
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void addEmpleados(Empleado empleados){
       if(this.empleados == null)
            this.empleados = new ArrayList<>();
        this.empleados.add(empleados);
    }
}
