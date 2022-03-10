
package principal.model.repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import principal.model.Carro;


public class CarroRepository {

    private static HashMap<Integer, Carro> carros = new HashMap<Integer, Carro>();

    public static List<Carro> listar() {
         return carros.values().stream().collect(Collectors.toList());
    }

    public static Carro buscarCarroPorId(int opcao) {
                return carros.get(opcao);
    }

    public static void atualizar(Carro carro) {
        carros.replace(carro.getId(), carro);
    }

    public static void adicionar(Carro carro) {
        carros.put(carro.getId(), carro);
    }
    
}
