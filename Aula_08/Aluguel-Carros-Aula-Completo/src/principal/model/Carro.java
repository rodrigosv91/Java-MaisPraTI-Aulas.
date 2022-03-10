package principal.model;

import principal.enuns.StatusCarro;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private double valor;
    private String placa;
    private StatusCarro status;

    public Carro(int id, String modelo, String marca, double valor, String placa) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.placa = placa;
        this.status = StatusCarro.LIVRE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(StatusCarro status) {
        this.status = status;
    }

    
    
}
