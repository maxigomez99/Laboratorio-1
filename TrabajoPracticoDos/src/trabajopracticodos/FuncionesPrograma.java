/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticodos;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class FuncionesPrograma {
   public static String getFechaString(Date fecha){
     
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     String getFechaString = sdf.format(fecha);
     
     
     
     return  getFechaString;
 }
    
    public static Date getFechaDate(int dia, int mes, int anio){
    
          
        LocalDate LD = LocalDate.of(anio, mes, dia);
        Date getFechaDate = java.sql.Date.valueOf(LD);
    
    return getFechaDate;
    }
}
