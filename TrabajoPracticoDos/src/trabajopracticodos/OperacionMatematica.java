/*
 * - Cree una clase OperacionMatematica con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set.
Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
…………………..
}
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.
 */
package trabajopracticodos;

/**
 *
 * @author CHIZO
 */
public class OperacionMatematica {
    private double valor1;
    private double valor2;
    private String operacion;
    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    
    private double sumarNumeros(){
    return valor1 + valor2;
}
    private double restarNumeros(){
    return valor1 - valor2;
}
    private double multiplicarNumeros(){
    return valor1 * valor2;
}
    private double dividirNumeros(){
    return valor1 / valor2;
    }
    public double aplicarOperacion(String operacion){

    switch (operacion){
        case "+": return sumarNumeros();
        case "-": return restarNumeros();
        case "*": return multiplicarNumeros();
        case "/": return dividirNumeros();
        default: System.out.println("operacion incorrecta");
        return 0;
    }    
    }
}

