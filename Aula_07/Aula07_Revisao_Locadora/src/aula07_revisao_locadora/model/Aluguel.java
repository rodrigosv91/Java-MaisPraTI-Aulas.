
package aula07_revisao_locadora.model;

import java.time.LocalDateTime;


public class Aluguel {
    private Carro carro;
    private Cliente cliente;
    private Vendedor vendedor;
    private int quantDias;
    private LocalDateTime dataInicio;
    private LocalDateTime dataEntrega;

    public Aluguel(Carro carro, Cliente cliente, Vendedor vendedor, int quantDias, LocalDateTime dataInicio) {
        this.carro = carro;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.quantDias = quantDias;
        this.dataInicio = dataInicio;
        
        vendedor.addVenda();
    }


    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
    
    public double retornaValor () {
        if(cliente.getTipoCliente().toString() == "VIP"){
            return (quantDias * carro.getValorAluguel() ) * 0.9;
        }else{
            return quantDias * carro.getValorAluguel();
        }
    }
    
}
