
package aula06;

import aula06.model.Calculadora;
import aula06.model.Circulo;
import aula06.model.Demo;
import aula06.model.Forma;
import aula06.model.NaoTemALetraAException;
import aula06.model.NumeroMenorQueZeroException;
import aula06.model.Retangulo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Aula06 {

    public static void main(String[] args) {
       
        /*
        //Interface
        
        Retangulo retangulo = new Retangulo(10, 10);
        
        Circulo circulo = new Circulo(10);
        
        System.out.println(retangulo.area());
        System.out.println(circulo.area());      
        
        List<Forma> formas = new ArrayList<>();
        
        formas.add(circulo);
        formas.add(retangulo);
        
        System.out.println(formas);
        
        */
        /*
        Scanner sc = new Scanner(System.in);
               
        try{
            System.out.println("digite um numero");
            int valor = sc.nextInt();
        
            System.out.println(valor);
        
        } catch(InputMismatchException e){               
              System.out.println("Entrada invalida ");   
              //e.printStackTrace();
        } catch(Exception e2){             
              System.out.println("Entrada invalida 2");   
              //e2.printStackTrace();
        }finally{
            System.out.println("Sempre Ocorrera");   
        }
        
        sc.close();
        */
        
        Demo obj = new Demo();  
        obj.third();  
        System.out.println("all in control"); 
        
        
        Calculadora calculadora = new Calculadora();
        

        
        try{
            calculadora.somar(-10, 10);
        }
        catch(NumeroMenorQueZeroException e){
            System.out.println(e.getMessage()); // Exception : lança exceção, precisa ser tratado na hora que usado (com try / catch )                                        
        }
        
        
        //se não tratado interrompe programa
        //try{
        calculadora.verificaSeTemA("bbb");  // RuntimeException : Não precisa lançar exceção , pode ser acessado direto    
        //                                    // mas aparecera erros igual
        //}
        //catch(NaoTemALetraAException e){
        //    System.out.println(e.getMessage());
        //}

       
                 
    }
    
}
