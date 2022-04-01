
package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.regex.Pattern;
import static utils.Menu.menuPrincipal;

/**
 *
 * @author Rodrigo Vieira
 */
public class Reader {
    
    public static String validaDataNascimento(Scanner sc){    
        boolean testaParse = true;
        boolean testaPattern =  true;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        String data = sc.nextLine();
 
        while(testaPattern || testaParse ){
            testaPattern = true;
            testaParse = true;
            try {
                // test to check if data has a valid format
                while(!Pattern.matches("^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]\\d\\d\\d\\d$", data)){
                    System.out.println("\nData inválida.");
                    System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
                    data = sc.nextLine();
                }
                testaPattern = false;    
                // Parse test to avoid year 31/02/2000 as valid
                LocalDate parsedData = LocalDate.parse(data, format.withResolverStyle(ResolverStyle.STRICT)); 
                testaParse = parsedData.isAfter(LocalDate.now());
                
                if(testaParse){
                    //testaParse = true;
                    System.out.println("\nData futura inválida.");
                    System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
                    data = sc.nextLine();
                }                
                
            } catch (DateTimeParseException e) {
                System.out.println("\nData inválida.");
                System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
                data = sc.nextLine();
                testaParse = true;
            }
        }
        return data;                   
    }
    
    public static String  validaNome(Scanner sc){
        String entrada = sc.nextLine(); 
        //nome com somente letras e ao menos 
        while(!Pattern.matches("^\\D{1,}$", entrada)){
            System.out.println("\nNome inválido [Somente letras e ao menos uma].");
            System.out.println("Informe o nome novamente:"); 
            entrada = sc.nextLine();
       }
       return entrada;
    }
    
    public static String  validaTelefone(Scanner sc){
        String entrada = sc.nextLine(); 
        //telefone com pelo menos um digito            
        while(!Pattern.matches(".*\\d+.*", entrada)){
        //Alternative Patter 
        //while(!Pattern.compile("\\d").matcher(entrada).find()){    
            System.out.println("\nTelefone inválido [Precisa ao menos um número].");
            System.out.println("Informe o telefone novamente:"); 
            entrada = sc.nextLine();
       }
       return entrada;
    }
    
    public static String  validaTelefone2(Scanner sc){
        boolean check = true;
        String entrada = sc.nextLine(); 
        while(check){	
            int count=0;
            int i;
            for(i = 0; i<entrada.length(); i++){
		if(entrada.charAt(i) >= '0' && entrada.charAt(i) <= '9'){
		    count++;
                    break;
		}
            }
            if(count>=1){
                check = false;
            }
            else{
                System.out.println("\nTelefone inválido [Precisa ao menos um número].");
                System.out.println("Informe o telefone novamente:"); 
                entrada = sc.nextLine();
            }
        }   
       return entrada;
    }
    
            
    public static int validaInteiroMenu(Scanner sc){        
        while(!sc.hasNextInt()){
            System.out.println("\nEntrada inválida, tente novamente.");
            Menu.limparTela();
            menuPrincipal();
            sc.nextLine();
        }
        return sc.nextInt();
    }
    
    public static int validaInteiroAtualizar(Scanner sc){        
        while(!sc.hasNextInt()){
            System.out.println("\nEntrada inválida.");
            System.out.println("Informe o número de identificação da pessoa ou aluno a ser atualizado:");
            sc.nextLine();
        }
        return sc.nextInt();
    }
    
    public static int validaInteiroRemover(Scanner sc){        
        while(!sc.hasNextInt()){
            System.out.println("\nEntrada inválida.");
            System.out.println("Informe o número de identificação da pessoa ou aluno a ser removido:"); 
            sc.nextLine();
        }
        return sc.nextInt();
    }
    
}
