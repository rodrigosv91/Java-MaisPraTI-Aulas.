
package aula03;

import aula03.model.*;

/**
 *
 * @author Rodrigo
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Pedido pedido1 =  new Pedido("Jon");
             
        //System.out.println(pedido1.getCliente());
        //System.out.println(pedido1.toString());
        
        
        //Calculadora calculadora = new Calculadora(); // nao statico     
        //calculadora.somar(10, 10);
        
        /*               
        Calculadora.somar(10, 10);
        
        Contador.incrementa();  // tudo que é static é compartilhado 
        
        Contador contador1 = new Contador();    
        contador1.nome = "01";
        Contador contador2 = new Contador();
        contador2.nome = "02";
        
        System.out.println(contador1.nome + " " + contador1.getValor());
        System.out.println(contador2.nome + " " + contador2.getValor());  // vaor de Contador é compartilhado // ambos tem mesmo valor
        
        
        pedido1.setStatus("aguardando");
        System.out.println(pedido1.toString());
        
        */
        
        Aluno aluno =  new Aluno("Jon", "222", "POA");
        Professor professor = new Professor("Cris", "JAVA");
        
        aluno.setProfessor(professor);
        professor.setAluno(aluno);
        
        
        
        System.out.println(aluno.toString());
    }
    
}
