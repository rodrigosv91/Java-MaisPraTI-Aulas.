
package aula03_exercicio3;

import aula03_exercicio3.model.Calculadora;
import aula03_exercicio3.model.Contador;

public class Aula03_Exercicio3 {

    
    public static void main(String[] args) {
      
        /* 
        Contador.incrementa();  // tudo que é static é compartilhado 
        
        Contador contador1 = new Contador();    
        contador1.nome = "01";
        Contador contador2 = new Contador();
        contador2.nome = "02";
        
        contador2.incrementa2(); // metodo não static
        
        System.out.println(contador1.nome + " : " + contador1.getValor());
        System.out.println(contador2.nome + " : " + contador2.getValor());  // valor de Contador é compartilhado (independentede de ocmo alterado)  // ambos tem mesmo valor
        */
        
                   
        //Calculadora.somar(10, 10); 
        //Calculadora.subtrair(10, 10);
        //Calculadora.multiplicar(10, 10);
        //Calculadora.dividir(10, 0); 
        
        Calculadora contador1 = new Calculadora();    
        contador1.nome = "01";
        Calculadora contador21 = new Calculadora();    
        contador1.nome = "02";
    }
    
}
