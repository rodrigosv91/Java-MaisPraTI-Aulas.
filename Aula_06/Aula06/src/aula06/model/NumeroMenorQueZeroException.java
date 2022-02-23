
package aula06.model;


public class NumeroMenorQueZeroException extends Exception { // RuntimeException { // poderia ser
    
    public NumeroMenorQueZeroException(String msg){
        super(msg);       
    } 
    
    public NumeroMenorQueZeroException(String msg, Throwable cause){ 
     super(msg, cause);
    }
    
    
}
