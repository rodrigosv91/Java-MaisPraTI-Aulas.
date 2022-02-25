
package aula07_revisao_locadora.model;


public class Vendedor extends Pessoa {
    private int totalVendas;

    public Vendedor(String nome) {
        super(nome);
    }
 
    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public void addVenda(){
        setTotalVendas(getTotalVendas() + 1); 
    }
    
}
