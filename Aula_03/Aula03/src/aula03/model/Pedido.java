
package aula03.model;

public class Pedido {
    
    private String[] itens = new String[10];
    private double  valorTotal;
    private String cliente;
    
    public Status status;

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public String[] getItens() {
        return itens;
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() { 
        return status;
    }

    public void setStatus(String status) {
        this.status = Status.valueOf(status.toUpperCase());
        // valueOf seta o valor de um enum retornando um dos valores ja existentes do nosso enum criado (Status)
    }

    @Override
    public String toString() {
        return "Pedido{" + "itens=" + itens + ", valorTotal=" + valorTotal + ", cliente=" + cliente + ", status=" + status + '}';
    }

    
    
    
    
   
    
    
    
    
}
