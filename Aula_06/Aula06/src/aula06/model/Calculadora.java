
package aula06.model;


public class Calculadora {
    
    //tipo: Exception
    public void somar(int v1, int v2) throws NumeroMenorQueZeroException, ArithmeticException { 
        if(v1 < 0 || v2 < 0){
            throw new NumeroMenorQueZeroException("Numero menor que zero"); 
            //int i = 1/0;
        }
        else{
            System.out.println(v1 + v2);
        }
    }
     
    //tipo: RuntimeException
    public void verificaSeTemA(String  nome){     
        
        if(!nome.contains("a")){
            throw new NaoTemALetraAException("Nao contem a letra A");  
        } 
        
    }
    
    
}
