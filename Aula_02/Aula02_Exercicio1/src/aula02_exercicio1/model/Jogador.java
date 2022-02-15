
package aula02_exercicio1.model;

/**
 *
 * @author Rodrigo
 */
public class Jogador {
    public String nome;
    public int gols;
    public int assistencias;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void adicionarGol(int gols){
        this.gols = this.gols + gols;
    }
    
    public void adicionarAssistencias(int assistencias){
        this.assistencias += assistencias;
    }
    
    public int verGols(){
        return this.gols;
    }
    
    public int verAssistencias(){
        return this.assistencias;
    }

    @Override
    public String toString() {
        return "Jogador " + nome + " fez " + gols + " gols" + " e tem " + assistencias + " assistencias.";
    }
    
    
}
