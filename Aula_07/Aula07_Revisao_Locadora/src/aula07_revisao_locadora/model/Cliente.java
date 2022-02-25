
package aula07_revisao_locadora.model;

import aula07_revisao_locadora.model.enums.TipoCliente;


public class Cliente extends Pessoa{
    
    private TipoCliente tipoCliente; 
     
    public Cliente (String nome){
        super(nome);   
        tipoCliente = TipoCliente.NORMAL;
    }
    
    public Cliente (String nome, TipoCliente tipoCliente){
        super(nome);
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
   
}
