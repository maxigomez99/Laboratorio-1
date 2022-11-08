/*
 . Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo .
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author CHIZO
 */
public class EjercicioCuatro {

      public static void main(String[] args) {
      double []arreglo = cargarArreglo();  
      double maximo = numeroMayor(arreglo);
      double menor = numeroMenor(arreglo);
      double rango = maximo - menor;
          mostrar(maximo, menor, rango);
    }
     public static double []cargarArreglo(){     
        Scanner LeerTeclado = new Scanner (System.in);
         double arreglo[]= new double[20];
         System.out.println("Ingrese 20 numeros decimales");
         for(int i=0; i<20;i++){
            
            arreglo[i]=LeerTeclado.nextDouble();
        }
    return arreglo;    
    }
    public static double numeroMayor(double []arreglo){  
       double maximo = arreglo[0];     
       
        for(int i=0;i<20;i++){
        if(arreglo[i]>maximo){
            maximo = arreglo[i];
        }
    }
        return maximo;
    }
    public static double numeroMenor(double []arreglo){  
       double menor = arreglo[0];     
       
        for(int i=0;i<20;i++){
        if(arreglo[i]<menor){
            menor = arreglo[i];
        }
    }
        return menor;
    }
     public static void mostrar(double maximo,double menor, double rango){
        System.out.println("El numero mayor es: "+maximo);
        System.out.println("El numero menor es: "+menor);
        System.out.println("El rango es: "+rango); 
     }
}
