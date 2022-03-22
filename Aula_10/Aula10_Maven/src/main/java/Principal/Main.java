
package Principal;

import com.mycompany.aula10_maven.model.Carro;
import com.mycompany.aula10_maven.model.Service.CarroService;


public class Main {
    
    public static void main(String[] args) {
        
        Carro carro =  new Carro();
        carro.setValor(250);
        CarroService cs = new CarroService();
        
        cs.mudarStatusParaAlugado(carro);
        
        System.out.println(cs.eMaiorQueDuzentos(carro));
        
        
    }
    
    
}
