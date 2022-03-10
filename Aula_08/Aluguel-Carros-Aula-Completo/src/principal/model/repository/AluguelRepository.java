
package principal.model.repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import principal.model.Aluguel;
import principal.model.Aluguel;


public class AluguelRepository {
    
    private static HashMap<Integer, Aluguel> alugueis = new HashMap<Integer, Aluguel>();
    
    
    public static void adicionar(Aluguel aluguel) {
        alugueis.put(aluguel.getId(), aluguel);
    }

    public static List<Aluguel> listar() {
        return alugueis.values().stream().collect(Collectors.toList());
    }

    public static Aluguel buscarAluguelPorId(int opcao) {
        return alugueis.get(opcao);
    }

    
}
