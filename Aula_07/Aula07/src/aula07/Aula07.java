
package aula07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Aula07 {

    
    public static void main(String[] args) throws ParseException {
       
        /* // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date = sdf.parse("23/02/2022");
       
        
        System.out.println(date);
                
        System.out.println(date.getDay());
        System.out.println(date.getTime());
        */
        
        /* // Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy 12:00:05");
        
        Calendar calendar =  Calendar.getInstance();
        
        calendar.setTime(sdf.parse("01/03/2022 12:00:05")); //erro se nao colocar todos o dados do primeiro
        
        Date date = calendar.getTime(); //array
        
        System.out.println(date);
        */
        
        /* // LocalDate
        LocalDate  localDate =  LocalDate.of(2020, Month.MAY, 29);  
        LocalDate  localDate2 =  LocalDate.of(2022, Month.MAY, 30); 
            
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");                  
        System.out.println(localDate.format(format));
        
        
        // Period  
        Period period = Period.between(localDate, localDate2);
        int anos = period.getYears();
        int meses = period.getMonths();
        int dias = period.getDays();
        
        System.out.println(dias + " " + meses +  " "  + anos);
        
        System.out.println(localDate.plusYears(3).format(format));
        */
        
        
        //LocalDateTime 
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:nn");   
        
        LocalDateTime localDateTime  = LocalDateTime.of(2022, Month.APRIL, 01, 02, 03, 04, 05);      
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, Month.APRIL, 01, 02, 03, 04, 05);
        
        LocalDateTime localDateTime3 = LocalDateTime.now();
        
        if(localDateTime.equals(localDateTime2)){
            System.out.println("igual");
        }else{
            System.out.println("nao eh");
        }
        
        System.out.println(localDateTime3.format(format));
        
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        //LocalDate novadata = LocalDate.parse("19/12/1990", dtf);
        
        //DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novadata = LocalDate.parse("19/12/1991", fmt);

        System.out.println(novadata);
        System.out.println(novadata.format(fmt));
        
        
        //Calendar
        int day = 05 ;
        int month = 8;
        int year = 2015;
        // mes precisa ser -1 por que começa em 0 (zero)
        System.out.println( findDay((month)-1, 05, 2015) );
        
    }
    
    
    public static String findDay(int month, int day, int year) {
            
        Calendar c = Calendar.getInstance();
            
        c.set(year, month, day);
        //c.set(Calendar.DAY_OF_MONTH, day);
        //c.set(Calendar.MONTH, month);
        //c.set(Calendar.YEAR, year);
                   
        //Integer i = c.get(Calendar.DAY_OF_WEEK);
        int x = c.get(Calendar.DAY_OF_WEEK);
                              
        //zero is nothing
        String[] days = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
                  
        //return  i.toString();            
        return  days[x];       
    }
    
}
