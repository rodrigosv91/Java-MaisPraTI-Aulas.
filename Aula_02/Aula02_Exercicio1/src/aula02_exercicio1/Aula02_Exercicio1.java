
package aula02_exercicio1;

import aula02_exercicio1.model.Jogador;

/**
 *
 * @author Rodrigo
 */
public class Aula02_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogador jg = new Jogador("John");
        
        jg.adicionarGol(2);
        jg.adicionarAssistencias(3);
        
        System.out.println("Gols: " + jg.verGols());
        System.out.println("Assistencias: " + jg.verAssistencias());
        
        System.out.println(jg.toString());
        
        jg.adicionarGol(2);
        jg.adicionarAssistencias(3);
        
        System.out.println("Gols: " + jg.verGols());
        System.out.println("Assistencias: " + jg.verAssistencias());
        
        System.out.println(jg.toString());
        
        
        //Jogador jogador01 = new Jogador("Jon");
	//Jogador jogador02 = new Jogador("Ken");
	//System.out.println(jogador01.equals(jogador02)); //true ou false // 
    }
    
}
