
package integradorFinal;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    String nombreEmpleado;
    long cuil;
    int anioIngreso;
    double montoAntiguedad;
    double sueldoBasico;
    List<BonoSueldo> bonos;
    private List<String[][]> bonitos ;
 
    public List<String[][]> getBonitos() {
        return bonitos;
    }

    public void setBonitos(List<String[][]> bonitos) {
        this.bonitos = bonitos;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }

    public Empleado(String nombreEmpleado, long cuil, int anioIngreso,  double sueldoBasico) {
        this.nombreEmpleado = nombreEmpleado;
        this.cuil = cuil;
        this.anioIngreso = anioIngreso;
        this.sueldoBasico = sueldoBasico;
    }
    public void addBono(BonoSueldo bono) {
        if(this.bonos == null)
            this.bonos = new ArrayList<>();
        this.bonos.add(bono);
    }
    public void addBonitos(String[][] dato) {
        if(this.bonitos == null){
            this.bonitos = new ArrayList<>();
        }
        this.bonitos.add(dato);

        }
    
}
