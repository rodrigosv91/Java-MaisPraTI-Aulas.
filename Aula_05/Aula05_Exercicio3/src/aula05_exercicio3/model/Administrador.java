
package aula05_exercicio3.model;


public class Administrador extends Funcionario {

    public final static double BONIFICACAO = 0.06;

    public Administrador(String nome) {
        super(nome);
    }

    public Administrador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }
 
    @Override
    public double valorTotalAReceber() {
        return (this.getTotalHoras() * this.getValorHora() + ((this.getTotalHoras()*this.getValorHora())*BONIFICACAO));
     }
   
    public String getClassSimpleName() {
       return "Administrador";
    }
}
