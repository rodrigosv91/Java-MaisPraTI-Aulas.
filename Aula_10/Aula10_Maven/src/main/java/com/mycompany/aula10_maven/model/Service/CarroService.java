
package com.mycompany.aula10_maven.model.Service;

import com.mycompany.aula10_maven.model.Carro;


public class CarroService {
    
    
    public void mudarStatusParaAlugado(Carro carro){ 
        carro.setStatus("alugado");
        System.out.println("Alugado");
    }
    
     public boolean eMaiorQueDuzentos(Carro carro){ 
        
        return  carro.getValor() > 200;
    }
}
