
package aula02_exercicio2;

import aula02_exercicio2.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Aula02_Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Aluno aluno = new Aluno();
        int option = 0;
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Informe o nome do aluno");
        aluno.nome = sc.next();
        
        /* //testa apos cada nota informada se total é maior que 100 
        do{ 
            System.out.println("Informe a nota 1");
            n1 = sc.nextDouble();
            double total = 0;
            total += n1;
            if (total < 100){
                System.out.println("Informe a nota 2");
                n2 = sc.nextDouble();     
                total += n2;
                if (total < 100){
                    System.out.println("Informe a nota 3");
                    n3 = sc.nextDouble(); 
                    total += n3;
                    if (total < 100){
                        aluno.adicionaNotas(n1, n2, n3);
                        System.out.println(aluno.retornaTudo());
                        break;   
                    }else{
                        System.out.println("Montante das notas não podem passar de 100"); 
                        System.out.println("Digite 1 para tentar novamente ou outro valor para sair");
                        option = sc.nextInt(); 
                    } 
                }else{
                    System.out.println("Montante das notas não podem passar de 100"); 
                    System.out.println("Digite 1 para tentar novamente ou outro valor para sair");
                    option = sc.nextInt(); 
                } 
            }else{
                System.out.println("Montante das notas não podem passar de 100"); 
                System.out.println("Digite 1 para tentar novamente ou outro valor para sair");
                option = sc.nextInt(); 
            }              
            
        }while(option == 1);  
        */
        //testa após informado as notas se total é maior que 100
        do{          
            System.out.println("Informe a nota 1");
            double n1 = sc.nextDouble();
            System.out.println("Informe a nota 2");
            double n2 = sc.nextDouble();        
            System.out.println("Informe a nota 3");
            double n3 = sc.nextDouble();   

            if(aluno.adicionaNotas(n1, n2, n3)){
                System.out.println(aluno.retornaTudo());
                break;
            }else{
                System.out.println("Montante das notas não podem passar de 100"); 
                System.out.println("Digite 1 para tentar novamente ou outro valor para sair");
                option = sc.nextInt(); 
            }
        }while(option == 1);        
        sc.close(); 
        
        
        //System.out.println(aluno.retornaTudo());
    }
    
}
