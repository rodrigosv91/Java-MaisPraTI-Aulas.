
package aula07_revisao_locadora.model;

import aula07_revisao_locadora.model.enums.Status;



public class Carro {
    private String modelo;
    private String placa;
    private Status status;
    private double valorAluguel;

    public Carro(String modelo, String placa, double valorAluguel) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorAluguel = valorAluguel;
        this.status = Status.valueOf("DISPONIVEL"); 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
     
    
}
