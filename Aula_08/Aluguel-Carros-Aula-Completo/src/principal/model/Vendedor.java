package principal.model;


public class Vendedor extends Pessoa {
    
    private int totalVendas;
    
    public Vendedor(int id, String nome, String cpf, String endereco) {
        super(id, nome, cpf, endereco);
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
