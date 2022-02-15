
package aula03.model;

/**
 *
 * @author Rodrigo
 */
public class Jogador {
    private String nome;
    private int gols;
    private int assistencias;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void adicionarGol(int gols){
        if(gols > 0){
            this.gols = this.gols + gols;
        }
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
