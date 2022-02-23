
package aula05_exercicio3.model;


public class Programador extends Funcionario{
    
    private static final double BONIFICACAO = 0.05;

    public Programador(String nome) {
        super(nome);
    }

    public Programador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }
 
    @Override
    public double valorTotalAReceber(){
        return ( this.valorBase() ) + ( this.valorBase() * BONIFICACAO);
    }
    
    public String getClassSimpleName() {
       return "Programador";
    }
    
}
