
package aula07_revisao_locadora;

import aula07_revisao_locadora.model.Aluguel;
import aula07_revisao_locadora.model.Carro;
import aula07_revisao_locadora.model.Cliente;
import aula07_revisao_locadora.model.Vendedor;
import aula07_revisao_locadora.model.enums.Status;
import aula07_revisao_locadora.model.enums.TipoCliente;
import java.time.LocalDateTime;


public class Aula07_Revisao_Locadora {

    
    public static void main(String[] args) {
                   
        Carro carro1 = new Carro("HB20", "HB20ABC", 100.00);
        Carro carro2 = new Carro("RX-7", "RXABC", 200.00);
        Carro carro3 = new Carro("Ferrari SF90", "SF90ABC", 300.00);
        
        Cliente cliente1 =  new Cliente("Jon", TipoCliente.VIP); 
        
        Vendedor vendedor1 = new Vendedor("Mike");
               
        Aluguel aluguel = new Aluguel(carro1, cliente1, vendedor1, 2, LocalDateTime.now() );
        
        
        
        System.out.println(aluguel.retornaValor());
        
        System.out.println(vendedor1.getTotalVendas());
        
    }
    
}
