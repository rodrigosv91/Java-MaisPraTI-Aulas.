
package principal.model.repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import principal.model.Vendedor;


public class VendedorRepository {
    
    private static HashMap<Integer, Vendedor> vendedores = new HashMap<Integer, Vendedor>();
    
    
    public static void adicionar(Vendedor vendedor) {
        vendedores.put(vendedor.getId(), vendedor);
    }

    public static List<Vendedor> listar() {
        return vendedores.values().stream().collect(Collectors.toList());
    }

    public static Vendedor buscarVendedorPorId(int opcao) {
        return vendedores.get(opcao);
    }

    public static void atualizar(Vendedor vendedor) {
        vendedores.replace(vendedor.getId(), vendedor);
    }
    
}
