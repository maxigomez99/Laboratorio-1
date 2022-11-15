
package integradorFinal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class CalculoBonoSueldo {

    static String [][]  haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
    static String [][]  deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<>();
    
    public static Empleado empleado ;
   
    
    static int contador=0;
    static int fila=0;
    static double sumaHaberes=0;
    static double sumaDeducciones=0;
    
    public static void main(String[] args) {
      
        
        
        Scanner lt = new Scanner(System.in);  
        boolean bandera=true; 
      datosEmpleado();
        
        
        do{   
            String[][] bonoCalculado = new String[10][4];
      BonoSueldo bono = new BonoSueldo();
    //-------- Reseteo de variables, array y lista---------
    reseteo();
    
    //---------carga de bonos-----------------
    
     datosLaborales(bono);
     System.out.println("INGRESE LOS HABERES DEL EMPLEADO");
        
        cargaCodigoHaberes(bonoCalculado);
        contador = 0;
        bono.setSumaHaberes(sumaHaberes);
        cargaCodigoDeducciones(bonoCalculado);
        bono.setSumaDeducciones(sumaDeducciones);
        double monto=(empleado.getSueldoBasico()+empleado.getMontoAntiguedad()+sumaHaberes)-sumaDeducciones;
        
        bono.setMontoLiquidacion(monto);
        
        //empleado.getBonitos().add(bonoCalculado);
        empleado.addBono(bono);
        
        empleado.addBonitos(bonoCalculado);
        
     
     System.out.println("Desea cargar otro bono?");
            String condicionSalir = lt.next();

            if (condicionSalir.equalsIgnoreCase("no")) {
                break;
            }
    
    }while(bandera);
  mostrar();
        
        
    }
    
    public static void datosEmpleado(){
      Scanner lt = new Scanner(System.in);  
//-------------------------------AÑO ACTUAL-----------------------------------//        
     Calendar cal = Calendar.getInstance();
     int anioActual = cal.get(Calendar.YEAR);
//----------------------------------------------------------------------------//
      String nombreApellido;
      long cuil;
      int anioIngreso;
      double sueldoBasico;
      
      System.out.println("Ingrese el nombre y apellido del empleado");
      nombreApellido = lt.nextLine();
      
      System.out.println("Ingrese el cuil del empleado");
      cuil= lt.nextLong();
      
      System.out.println("ingrese el año de ingreso");
      anioIngreso= lt.nextInt();
      while(anioIngreso>anioActual){
          System.out.println("Ingrese nuevamente el año de ingreso");
          anioIngreso= lt.nextInt();
      }
      
      System.out.println("Ingrese el sueldo basico");
      sueldoBasico= lt.nextDouble();
      
      empleado= new Empleado(nombreApellido, cuil, anioIngreso,  sueldoBasico);     
      
     
      
      
    }
    
    public static void datosLaborales(BonoSueldo bono){
        
     
        
        Scanner lt = new Scanner(System.in);  
//-------------------------------AÑO ACTUAL-----------------------------------//        
     Calendar cal = Calendar.getInstance();
     int anioActual = cal.get(Calendar.YEAR);
//----------------------------------------------------------------------------//   
    
         System.out.println("Ingrese el año de liquidacion");
         while(true){
             int anioLiquidacion = lt.nextInt();
         if(anioLiquidacion > anioActual){
                System.out.println("El año ingresado es incorrecto");
                System.out.println("El año de ingreso no puede ser mayor al actual");
                System.out.println("");
                System.out.println("Vuelve a ingresar el año de liquidacion");
            }else{
                
            bono.setAnioLiquidacion(anioLiquidacion);
            break;
            }
         }
         System.out.println("Ingrese el mes de liquidacion");
         bono.setMesLiquidacion(lt.nextInt());
         double aux = (bono.getAnioLiquidacion() - empleado.getAnioIngreso()) *2;
            empleado.setMontoAntiguedad(aux * empleado.getSueldoBasico()/100); 
         
         
  }
            
    public static void cargaCodigoHaberes(String[][]bonoCalculado){
         Scanner lt = new Scanner(System.in);  
        String codigo;
        Integer item = 0;

//------------------------------1y2-------------------------------------------//
        while (true) {
            System.out.println("INGRESE EL CODIGO DEL ITEM");
            codigo = lt.nextLine();
            item = Integer.parseInt(codigo);
            if (codigo.equals("000") && contador == 0) {
                System.out.println("INGRESE MINIMO UN ITEM");

            } else if (contador > 0 && codigo.equals("000")) {
                
                break;

            } else if (codigosIngresados.indexOf(item) >= 0) {
                System.out.println("EL CODIGO YA HA SIDO CARGADO\n INGRESE OTRO CODIGO");

            } else {
                buscoCodigoHaberes(item,bonoCalculado);
            }

        }//while
    }
    
    public static void buscoCodigoHaberes(int item, String[][]bonoCalculado){
        Scanner lt = new Scanner(System.in);  
        double montoResultante = 0;
     
        if (item < 100 || item > 104) {
            System.out.println("ERROR: Item incorrecto");

        } else {
            contador++;
            for (String[] habere : haberes) {

                int codigo = Integer.parseInt(habere[0]);
                if (codigo == item) {
                    bonoCalculado[fila][1] = habere[1];
                    if (habere[2].equals("M")) {
                        System.out.println("INGRESE EL MONTO CORRESPONDIENTE AL ITEM DE:" + habere[1]);
                        montoResultante = lt.nextDouble();
                        System.out.println(montoResultante);
                    } else {
                        double porcentaje = Double.parseDouble(habere[2]);
                        montoResultante = empleado.getSueldoBasico() * porcentaje / 100;
                        System.out.println(montoResultante);
                    }
                }
            }
            String agregoItem = String.valueOf(item);
            String montoRes = String.valueOf(montoResultante);
            bonoCalculado[fila][0] = agregoItem;
            bonoCalculado[fila][2] = montoRes;
            sumaHaberes +=montoResultante;
            fila++;
            codigosIngresados.add(item);
        }
    }
        
    public static void cargaCodigoDeducciones(String[][]bonoCalculado){
        String codigo;
        Integer item = 0;
        Scanner lt = new Scanner(System.in);  

        while (true) {
            System.out.println("INGRESE EL CODIGO DEL ITEM Deducciones");
            codigo = lt.nextLine();
            item = Integer.parseInt(codigo);
            if (codigo.equals("000") && contador == 0) {
                System.out.println("INGRESE MINIMO UN ITEM Deducciones");

            } else if (contador > 0 && codigo.equals("000")) {
                System.out.println("FIN");
                break;

            } else if (codigosIngresados.indexOf(item) >= 0) {
                System.out.println("EL CODIGO YA HA SIDO CARGADO\n INGRESE OTRO CODIGO");

            } else {
                buscoCodigoDeducciones(item,bonoCalculado);
            }
        }

    }    
    public static void buscoCodigoDeducciones(int item,String[][]bonoCalculado){
       Scanner lt = new Scanner(System.in);  
        double montoResultante = 0;

        if (item < 200 || item > 204) {
            System.out.println("ERROR: Item incorrecto");

        } else {
            contador++;
            for (String[] deduccion : deducciones) {

                int codigo = Integer.parseInt(deduccion[0]);
                if (codigo == item) {
                    bonoCalculado[fila][1] = deduccion[1];
                    if (deduccion[2].equals("M")) {
                        System.out.println("INGRESE EL MONTO CORRESPONDIENTE AL ITEM DE:" + deduccion[1]);
                        montoResultante = lt.nextDouble();
                        System.out.println(montoResultante);
                    } else {
                        double porcentaje = Double.parseDouble(deduccion[2]);
                        montoResultante = empleado.getSueldoBasico() * porcentaje / 100;
                        System.out.println(montoResultante);
                    }
                }
            }
            String agregoItem = String.valueOf(item);
            String montoRes = String.valueOf(montoResultante);
            bonoCalculado[fila][0] = agregoItem;
            bonoCalculado[fila][3] = montoRes;
            sumaDeducciones += montoResultante;
            fila++;
            codigosIngresados.add(item);
            
        }
    }    
    

    public static void reseteo(){
    
    codigosIngresados.clear();
    fila=0;
    contador=0;
    sumaHaberes=0;
    sumaDeducciones=0;
    
    }
    
       
    public static String completarConEspacios(String cadena) {
        int cantidadEspacios = 20 - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
    
    public static void mostrar(){
    for (int i = 0; i < empleado.getBonos().size(); i++) {
            boolean ext = false;

            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("CUIL: " + empleado.getCuil());
            System.out.println("Mes Liquidacion: " + empleado.getBonos().get(i).getMesLiquidacion() + "\t\t\tAño Liquidacion: " + empleado.getBonos().get(i).getAnioLiquidacion());
            System.out.println("Sueldo Basico: " + empleado.getSueldoBasico() + "\t\t\tAño ingreso: " + empleado.getAnioIngreso() + "\n");
            System.out.println(completarConEspacios("Codigo Item") + completarConEspacios("Denominacion") + completarConEspacios("Haberes") + completarConEspacios("Deducciones"));
            System.out.println(completarConEspacios(" ")+completarConEspacios("Sueldo Basico:") + completarConEspacios(String.valueOf(empleado.getSueldoBasico())));
            System.out.println(completarConEspacios(" ")+completarConEspacios("Antiguedad:") + completarConEspacios(String.valueOf(empleado.getMontoAntiguedad())));
            System.out.println(" ");
            
            for (int j = 0; j < empleado.getBonitos().get(i).length; j++) {
                for (int k = 0; k < empleado.getBonitos().get(i)[0].length; k++) {
                    if (empleado.getBonitos().get(i)[j][k] == null) {
                        System.out.print(completarConEspacios(""));
                    } else {
                        System.out.print(completarConEspacios(empleado.getBonitos().get(i)[j][k]));
                    }
                    if (empleado.getBonitos().get(i)[j][0] == null) {
                        ext = true;
                        break;
                    }
                }
                System.out.println("");
                if (ext == true) {
                    break;
                }
            }

            System.out.println(completarConEspacios(" ")+completarConEspacios("SubTotal:") + completarConEspacios(String.valueOf(empleado.getBonos().get(i).getSumaHaberes()))+completarConEspacios(String.valueOf(empleado.getBonos().get(i).getSumaDeducciones())));
            System.out.println(completarConEspacios(" ")+completarConEspacios("NETO:") + completarConEspacios(String.valueOf(empleado.getBonos().get(i).getMontoLiquidacion())));
            System.out.println("");
            System.out.println("");

        }
    }
    
    
    
}
