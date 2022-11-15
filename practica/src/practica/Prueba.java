/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Emi
 */
public class Prueba {
  private String  [][]tablero;  

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
  
  public void cargarTablero(){
      if(this.tablero == null)
        this.tablero=new String[10][10];
  }
  public void agregarAlTablero(int fila,int columna, String ficha){
  this.tablero[fila][columna] = ficha;
      
  }
  public String mostrarTablero(int fila, int columna){
      return(tablero[fila][columna]);
  }    
  
}
