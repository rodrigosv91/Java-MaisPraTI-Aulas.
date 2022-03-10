
package principal.model.repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import principal.model.Cliente;


public class ClienteRepository {
    
    private static HashMap<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    
    
    public static void adicionar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public static List<Cliente> listar() {
        return clientes.values().stream().collect(Collectors.toList());
    }
    
}
