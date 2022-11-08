/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;

/**
 *
 * @author CHIZO
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
    
        return new Fraccion (f1.getNumerador()*f2.getDenominador()+f2.getNumerador()*f1.getDenominador(), f1.getDenominador()*f2.getDenominador());
}

public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        return new Fraccion (f1.getNumerador()*f2.getDenominador()-f2.getNumerador()*f1.getDenominador(), f1.getDenominador()*f2.getDenominador());

}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
return new Fraccion (f1.getNumerador()*f2.getNumerador(),f1.getDenominador()*f2.getDenominador());
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
return new Fraccion (f1.getNumerador()*f2.getDenominador(),f2.getNumerador()*f1.getDenominador());
}
}
