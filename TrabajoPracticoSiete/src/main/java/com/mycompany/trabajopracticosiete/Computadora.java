/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticosiete;

import java.util.*;

/**
 *
 * @author CHIZO
 */
public class Computadora {
   private String marca;
   private String modelo;
   HashSet <ComponenteCPU> componentes;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCPU> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<ComponenteCPU> componentes) {
        this.componentes = componentes;
    }

    
    
    public void addComponentes(ComponenteCPU componente) {
        if(this.componentes == null)
            this.componentes = new HashSet<>();
        this.componentes.add(componente);
    }
 
    }
   
