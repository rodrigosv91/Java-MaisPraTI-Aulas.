package com.mycompany.aula10_maven.model.Service;
        
import com.mycompany.aula10_maven.model.Carro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

        
public class CarroServiceTeste {
    
    @Test
    @DisplayName("Se o valor for maior que 200 retorna truye")
    public void deveriRetornaVerdadeiroQuandoMaiorQueDuzentos(){
        Carro carro =  new Carro();
        carro.setValor(250);
        CarroService service = new CarroService();
        
        
        Assertions.assertTrue(service.eMaiorQueDuzentos(carro));
    }
}
