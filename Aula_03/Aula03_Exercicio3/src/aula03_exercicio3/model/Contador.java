
package aula03_exercicio3.model;

public class Contador {
    
    public static int valor = 0;
    
    public String nome;
    
    public static void incrementa (){
        Contador.valor++; // referencia como a propria classe/ se usar "this" = erro
    }
    
     public void incrementa2 (){
        this.valor++;
    }
    
    public int getValor(){
        return Contador.valor;  
    }
    
}
