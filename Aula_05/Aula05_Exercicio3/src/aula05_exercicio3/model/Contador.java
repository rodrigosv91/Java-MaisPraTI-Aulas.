
package aula05_exercicio3.model;


public class Contador extends Funcionario{

    public static final double BONIFICACAO = 0.03;

    public Contador(String nome) {
        super(nome);
    }

    public Contador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }
  
    @Override
    public double valorTotalAReceber() {
        return ( this.getTotalHoras() * this.getValorHora() ) + (( this.getTotalHoras() * this.getValorHora() )* BONIFICACAO);
    }
    
    public String getClassSimpleName() {
       return "Contador";
    }
    
}
