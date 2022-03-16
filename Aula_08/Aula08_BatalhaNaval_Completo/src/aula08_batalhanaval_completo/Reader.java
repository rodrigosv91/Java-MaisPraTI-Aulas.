
package aula08_batalhanaval_completo;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Reader {
    
    public static String validaEntrada(Scanner sc){
        
        String entrada = sc.nextLine();            
        while(!Pattern.matches("^[0-9]\\,[0-9]$|^fim$|^FIM$", entrada)){
            System.out.println("Entrada invalida");
            System.out.println("Entre x e y no formato 'x,y' ou FIM para encerrar"); 
            entrada = sc.nextLine();
        }     
        return entrada;
         
    }
    
}
