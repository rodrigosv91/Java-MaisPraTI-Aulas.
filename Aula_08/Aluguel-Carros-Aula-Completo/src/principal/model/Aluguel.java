package principal.model;

import java.time.LocalDate;

public class Aluguel {
    
    private int id;
    private Carro carro;
    private Vendedor vendedor;
    private Cliente cliente;
    private int qtDias;
    private LocalDate dataInicio;
    private LocalDate dataEntrega;

    public Aluguel(int id, Carro carro, Vendedor vendedor, Cliente cliente, int qtDias, LocalDate dataInicio) {
        this.id = id;
        this.carro = carro;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.qtDias = qtDias;
        this.dataInicio = dataInicio;
        this.vendedor.addVenda();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQtDias() {
        return qtDias;
    }

    public void setQtDias(int qtDias) {
        this.qtDias = qtDias;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void recibo(){
        System.out.println("O cliente " + getCliente().getNome() + " alugou o carro "
        + getCarro().getModelo() + " da placa: " + getCarro().getPlaca() + ", por " + getQtDias() + " dias.");
        System.out.printf("O valor total deu: R$ %.2f \n", retornaValorTotal());
    }
    
    public double retornaValorTotal(){        
        return getCarro().getValor() * getQtDias();
    }
}
