
package aula03.model;


public class Contador {
    
    public static int valor = 0;
    
    public String nome;
    
    public static void incrementa (){
        Contador.valor++; // referencia como a propria classe/ this = erro
    }
    
    public int getValor(){
        return Contador.valor;
    }
    
    
}
