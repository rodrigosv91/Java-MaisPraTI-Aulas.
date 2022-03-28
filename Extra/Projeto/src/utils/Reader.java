
package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Rodrigo Vieira
 */
public class Reader {
    
        public static String validaDataNascimento(Scanner sc){           
            String data = sc.nextLine();
            while(!Pattern.matches("^(0[1-9]|[12][0-9]|3[01])[/.](0[1-9]|1[012])[/.]\\d\\d\\d\\d$", data)){
                System.out.println("Data inválida.");
                System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
                data = sc.nextLine();
            }
            return data;                   
        }
}
